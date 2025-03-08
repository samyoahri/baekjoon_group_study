package week03.Fri_boj_12873;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class boj_12873_samyoahri {
    static Queue<Integer> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        queue = new ArrayDeque<>();
        for (int i = 1; i <= N; ++i) {
            queue.add(i);
        }
        for (int i = 1; i <= N - 1; ++i) {
            long i_tripe = ((long) Math.pow(i, 3) - 1)%queue.size();
            while (i_tripe-- > 0) {
                queue.add(queue.poll());
            }
            queue.poll();
        }
        ans.append(queue.poll());

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
