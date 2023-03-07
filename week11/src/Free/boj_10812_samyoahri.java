package Free;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_10812_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int[] basket = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            basket[i] = i;
        }
        int M = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new ArrayDeque<>();
        for (int idx = 0; idx < M; idx++) {
            st = new StringTokenizer(in.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int l = k; l <= j; l++) {
                queue.offer(basket[l]);
            }
            for (int l = i; l < k; l++) {
                queue.offer(basket[l]);
            }
            for (int l = i; l <= j; l++) {
                basket[l] = queue.poll();
            }
        }

        for (int i = 1; i <= N; i++) {
            ans.append(basket[i] + " ");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
