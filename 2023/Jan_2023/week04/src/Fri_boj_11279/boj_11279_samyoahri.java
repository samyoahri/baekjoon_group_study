package Fri_boj_11279;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class boj_11279_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        int n = Integer.parseInt(in.readLine());

        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(in.readLine());
            if (x == 0) {
                if (!heap.isEmpty()) {
                    ans.append(heap.poll() + "\n");
                }
                else{
                    ans.append("0\n");
                }
            } else {
                heap.add(x);
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
