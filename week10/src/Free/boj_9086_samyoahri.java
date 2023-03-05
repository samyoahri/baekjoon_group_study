package Free;

import java.io.*;

public class boj_9086_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(in.readLine());
        for (int t = 0; t < T; t++) {
            String str = in.readLine();
            ans.append(str.charAt(0));
            ans.append(str.charAt(str.length() - 1));
            ans.append("\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
