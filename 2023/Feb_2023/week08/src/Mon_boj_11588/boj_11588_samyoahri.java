package Mon_boj_11588;

import java.io.*;

public class boj_11588_samyoahri {
    static int findK(int[] arr, int N) {
        int cnt = 1;
        int now = arr[1];
        while (now!=N && cnt <= N) {
            now = arr[now];
            cnt++;
        }
        if (cnt > N) {
            return 0;
        }
        else{
            return cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(in.readLine());
        for (int t = 0; t < T; t++) {
            int k = 0;
            int N = Integer.parseInt(in.readLine());
            int[] arr = new int[N+1];
            for (int n = 1; n <= N; n++) {
                arr[n] = Integer.parseInt(in.readLine());
            }
            k = findK(arr, N);
            ans.append(k + "\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
