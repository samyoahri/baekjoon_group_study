package Free;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_1517_platinum {
    static int cnt = 0;
    static void swap(int a, int b) {
        int tmp = b;
        b = a;
        a = tmp;
    }
    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();

        for (int i = 1; i <= n; i++) {
            int data = arr[i];
            int swapCnt = 0;

        }
    }
}
