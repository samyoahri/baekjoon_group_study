package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_11005_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N != 0) {
            if (N % B >= 10) {
                ans.append((char) ((N % B) + 55));
            }
            else{
                ans.append(N % B);
            }
            N /= B;
        }

        out.write(ans.reverse().toString());
        out.flush();
        in.close();
        out.close();
    }
}
