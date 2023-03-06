package Free;

import java.io.*;

public class boj_25314_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int q = N / 4;
        int r = N % 4;
        if (r == 0) {
            for (int i = 0; i < q; i++) {
                ans.append("long ");
            }
        }
        else{
            for (int i = 0; i < q + 1; i++) {
                ans.append("long ");
            }
        }
        ans.append("int");


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
