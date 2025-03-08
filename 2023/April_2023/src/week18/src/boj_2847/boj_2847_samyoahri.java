package boj_2847;

import java.io.*;

public class boj_2847_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int scores[] = new int[N];
        for (int i = 0; i < N; ++i) {
            scores[i] = Integer.parseInt(in.readLine());
        }
        int reduceCnt = 0;
        int prev = scores[N - 1], now;
        for (int i = N - 2; i >= 0; --i) {
            now = scores[i];
            int diff = 0;
            if (prev <= now) {
                diff = now - prev + 1;
                reduceCnt += diff;
            }
            scores[i] -= diff;
            prev = scores[i];
//            System.out.println("i = " + i);
//            for (int integer : scores) {
//                System.out.print(integer + " ");
//            }
//            System.out.println();
        }
//        for (int integer : scores) {
//            System.out.println("integer = " + integer);
//        }

        ans.append(reduceCnt);


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
