package week01.Sun_boj_1052;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_1052_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int one_cnt = 0;
        int i = 0;

        while(true){
            int num = N + i;
            one_cnt = 0;
            while (num != 0) {
                if (num % 2 != 0) {
                    ++one_cnt;
                }
                num /= 2;
            }
            if (one_cnt<=K) {
                break;
            }
            ++i;
        }
        ans.append(i);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}

