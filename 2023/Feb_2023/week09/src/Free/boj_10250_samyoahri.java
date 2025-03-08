package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_10250_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(in.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int q = N / H + 1;
            int r = N % H;
            if (N % H == 0) {
                q = N / H;
                r = H;
            }
            if (q >= 10) {
                ans.append(r);
                ans.append(q + "\n");
            }
            else{
                ans.append(r + "0" + q +"\n");
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
