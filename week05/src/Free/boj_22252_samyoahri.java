package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_22252_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;

        int Q = Integer.parseInt(in.readLine());
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(in.readLine(), " ");

//            int commandNumber
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
