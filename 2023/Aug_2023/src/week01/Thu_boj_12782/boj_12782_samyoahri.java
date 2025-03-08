package week01.Thu_boj_12782;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_12782_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(in.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; ++i) {
            st = new StringTokenizer(in.readLine(), " ");
            String N = st.nextToken();
            String M = st.nextToken();
            int cnt = 0;
            int one_cnt_N = 0, zero_cnt_N = 0;
//            int one_cnt_M = 0, zero_cnt_M = 0;
            for (int j = 0; j < N.length(); ++j) {
                int N_digit = N.charAt(j)-48;
                int M_digit = M.charAt(j)-48;
                if (N_digit == M_digit) {
                    continue;
                }
                else{
                    if (N_digit == 0) {
                        ++zero_cnt_N;
                    }
                    if (N_digit == 1) {
                        ++one_cnt_N;
                    }
                }
            }
            cnt = Math.max(one_cnt_N, zero_cnt_N);
            ans.append(cnt + "\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
