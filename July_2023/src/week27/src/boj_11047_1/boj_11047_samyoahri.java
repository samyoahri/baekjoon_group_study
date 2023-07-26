package boj_11047_1;

import java.io.*;
import java.util.StringTokenizer;

public class boj_11047_samyoahri {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = 0; i < N; ++i) {
            coins[i] = Integer.parseInt(in.readLine());
        }
        int cnt = 0, idx = N - 1, value = 0;
        while (K != 0) {
            if (K < coins[idx]) {
                --idx;
                continue;
            }
            K -= coins[idx];
            ++cnt;
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
