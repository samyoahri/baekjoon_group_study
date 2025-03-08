package Sat_boj_14659;

import java.io.*;
import java.util.StringTokenizer;

public class boj_14659_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int[] mountainHeight = new int[N];
        for (int i = 0; i < N; ++i) {
            mountainHeight[i] = Integer.parseInt(st.nextToken());
        }
        int maxHeight = 0;
        int cnt = 0;
        int res = 0;
        for (int i = 0; i < N; ++i) {
            int now = mountainHeight[i];
            if (now > maxHeight) {
                maxHeight = mountainHeight[i];
                cnt = 0;
            }
            else{
                ++cnt;
            }
            res = Math.max(cnt, res);
        }
        ans.append(res);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
