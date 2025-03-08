package Free;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2798_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int i = 0, j = 1, k = 2;
        int max = 0;
        if (N == 3) {
            max = arr[0] + arr[1] + arr[2];
        }
        else{
            for (i = 0; i < N - 2; i++) {
                for (j = 1; j < N - 1; j++) {
                    for (k = 2; k < N; k++) {
                        if (i != j && j != k && i != k) {
                            int tmp = arr[i] + arr[j] + arr[k];
                            if (tmp > M) {
                                break;
                            }
                            if (max < tmp) {
                                max = tmp;
                            }
                        }
                    }
                }
            }
        }
        ans.append(max);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
