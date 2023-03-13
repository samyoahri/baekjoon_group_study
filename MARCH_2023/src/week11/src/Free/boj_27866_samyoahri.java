package Free;

import java.io.*;

public class boj_27866_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String str = in.readLine();
        int N = Integer.parseInt(in.readLine());
        ans.append(str.charAt(N-1));

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
