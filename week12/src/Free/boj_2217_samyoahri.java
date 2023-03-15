package Free;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class boj_2217_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        Integer[] rope = new Integer[N];
        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(rope, Collections.reverseOrder());

        int res = 0;
        for (int i = 0; i < N; i++) {
            res = Math.max(res, rope[i] * (i + 1));
        }
        ans.append(res);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
