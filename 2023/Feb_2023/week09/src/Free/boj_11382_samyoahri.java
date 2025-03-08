package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_11382_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long sum = A + B + C;
        ans.append(sum);


        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
