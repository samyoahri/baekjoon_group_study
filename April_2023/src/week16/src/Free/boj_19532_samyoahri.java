package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_19532_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int X = 0;
        int Y = 0;
        for (int i = -999; i < 1000; ++i) {
            for (int j = -999; j < 1000; ++j) {
                if (a * i + b * j == c && d * i + e * j == f) {
                    X = i;
                    Y = j;
                    break;
                }
            }
        }
        ans.append(X + " " + Y);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
