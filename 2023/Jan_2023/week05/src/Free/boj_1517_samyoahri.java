package Free;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_1517_samyoahri {
    static int bubbleSort(int arr[]) {
        int cnt = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    cnt++;
                    System.out.print("arr[j] = " + arr[j]);
                    System.out.println(" arr[j+1] = " + arr[j+1]);
                    printArr(arr);
                }
            }
        }
        return cnt;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void ANS(int[] arr){
        int cnt = bubbleSort(arr);
        System.out.print("배열: ");printArr(arr);
        System.out.println("cnt = " + cnt);
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println("]");
    }
    static void printStack(Deque<Integer> stack) {
        System.out.print("[");
        for (int integer : stack) {
            System.out.print(integer + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        int cnt = 0;

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
//        8
//        7 1 8 13 6 2 4 3
//        ANS(arr);

        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
//        Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < N; i++) {
            //pop조건
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty() && stack1.peek() > arr[i]) {
                    stack2.push(stack1.pop());
                }
                stack1.push(arr[i]);
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                    cnt++;
                }
            }
            else{
                stack1.push(arr[i]);
            }
        }
        printStack(stack1);
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
