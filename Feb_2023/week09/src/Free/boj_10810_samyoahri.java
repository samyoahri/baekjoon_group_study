package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_10810_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int l = 0; l < M; l++) {
            st = new StringTokenizer(in.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int p = i - 1; p < j; p++) {
                arr[p] = k;
            }
        }
        for (int p = 0; p < arr.length; p++) {
            ans.append(arr[p] + " ");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
