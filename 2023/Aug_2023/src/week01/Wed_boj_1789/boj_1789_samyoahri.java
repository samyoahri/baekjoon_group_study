package week01.Wed_boj_1789;

import java.io.*;
import java.math.BigInteger;

public class boj_1789_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        long S = Long.parseLong(in.readLine());
        long tmp = 0L;
        int i = 0, N = 0;
        while(true){
            tmp += ++i;
            if (tmp > S) {
                break;
            }
            ++N;
        }
        ans.append(N);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
