package Free;

import java.io.*;

public class boj_2447_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                ans.append(" ");
//                ans.append("x");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                ans.append("*");
            }
            ans.append("\n");
        }
        for (int i = N-1; i > 0; i--) {
            for (int j = N - i; j > 0; j--) {
                ans.append(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                ans.append("*");
            }
            ans.append("\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
