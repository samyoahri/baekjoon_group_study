package week01.Sat_boj_9009;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class boj_9009_samyoahri {
    static List<Long> fibo_seq;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        fibo_seq = new ArrayList<>();
        fibo_seq.add(1L);
        fibo_seq.add(2L);
        for (int i = 2; i < 50; ++i) {
            long f1 = fibo_seq.get(i - 2);
            long f2 = fibo_seq.get(i - 1);
            long f3 = f1 + f2;
            fibo_seq.add(f3);
        }

        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; ++i) {
            long num = Long.parseLong(in.readLine());
            ArrayList<Long> res = new ArrayList<>();
            for (int j = fibo_seq.size() - 1; j >= 0; --j) {
                long fibo_num = fibo_seq.get(j);
                if (fibo_num > num) {
                    continue;
                }
                num -= fibo_num;
                res.add(fibo_num);
            }
            for (int k = res.size()-1; k >= 0; --k) {
                ans.append(res.get(k) + " ");
            }
            ans.append("\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
