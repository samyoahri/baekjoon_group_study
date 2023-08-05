package week01.Sat_boj_24511;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj_24511_samyoahri {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        boolean[] queueState = new boolean[N];
        for (int i = 0; i < N; ++i) {
            int integer = Integer.parseInt(st.nextToken());
            if (integer == 0) {
                queueState[i] = true;
            }
            else{
                queueState[i] = false;
            }
        }
        Deque<Integer> deque = new ArrayDeque<>();
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < N; ++i) {
            int num = Integer.parseInt(st.nextToken());
            if (queueState[i]) {
                deque.addFirst(num);
            }
        }
        //수열의 길이
        int M = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < M; ++i) {
            int num = Integer.parseInt(st.nextToken());
            deque.addLast(num);
            int output = deque.removeFirst();
            ans.append(output + " ");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
    //시간초과 코드
//    static void printArrayOfDeque(){
//        for (int i = 0; i < N; ++i) {
//            System.out.print("["+i+"번째 덱]: ");
//            for (int integer : deque[i]) {
//                System.out.print(integer + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//    static int N;
//    static Deque<Integer> deque[];
//    static int[] state;
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        N = Integer.parseInt(in.readLine());
//
//        state = new int[N];
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        for (int i = 0; i < N; ++i) {
//            state[i] = Integer.parseInt(st.nextToken());
//        }
//        deque = new ArrayDeque[N];
//
//        st = new StringTokenizer(in.readLine(), " ");
//        for (int i = 0; i < N; ++i) {
//            deque[i] = new ArrayDeque<>();
//            int num = Integer.parseInt(st.nextToken());
//            deque[i].push(num);
//        }
//
//        //삽입할 수열의 길이
//        int M = Integer.parseInt(in.readLine());
//        st = new StringTokenizer(in.readLine(), " ");
//
//
//        for (int j = 0; j < M; ++j) {
//
//            int numOfSequence = Integer.parseInt(st.nextToken());
//            //큐면
//            if (state[0] == 0) {
//                deque[0].addLast(numOfSequence);
//            }
//            //스택이면
//            else{
//                deque[0].addLast(numOfSequence);
//            }
//            for (int i = 0; i < N; ++i) {
//
//                if (i == N - 1) {
//                    if (state[i] == 0) {
//                        ans.append(deque[i].removeFirst() + " ");
//                    }
//                    //스택
//                    else {
//                        ans.append(deque[i].removeLast() + " ");
//                    }
//                    break;
//                }
//                //큐
//                if (state[i] == 0) {
//                    deque[i+1].addLast(deque[i].removeFirst());
//                }
//                //스택
//                else{
//                    deque[i+1].addLast(deque[i].removeLast());
//                }
//            }
//        }
//
//
//        out.write(ans.toString());
//        out.flush();
//        in.close();
//        out.close();
//    }
}
