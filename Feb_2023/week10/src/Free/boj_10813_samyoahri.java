package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_10813_samyoahri {
    static int[] arr;
    static void swap(int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            swap(a, b);
        }
        for (int i = 1; i <= N; i++) {
            ans.append(arr[i] + " ");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
