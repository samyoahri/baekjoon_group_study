package Free;

import java.io.*;

public class boj_2501_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String[] strings = in.readLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int K = Integer.parseInt(strings[1]);
        //약수의 개수
        int cnt = 0;
        for (int i = 1; i <= K; i++) {
            if (N % K == 0) {
                cnt++;
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
