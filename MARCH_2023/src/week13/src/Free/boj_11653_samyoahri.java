package Free;

import java.io.*;
public class boj_11653_samyoahri {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        for (int i = 2; i <= N; i++) { // 2부터 N까지의 수를 1씩 늘려가면서 N과 나눠줘봄.
            for (; ; ) {
                if (N % i == 0) { // 딱 나눠진다면
                    N = N / i;
                    ans.append(i + "\n");
                } else {
                    break;
                }
            }
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
