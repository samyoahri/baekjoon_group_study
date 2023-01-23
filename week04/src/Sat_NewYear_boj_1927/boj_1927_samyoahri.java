package Sat_NewYear_boj_1927;

import java.io.*;
import java.util.PriorityQueue;

public class boj_1927_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int N = Integer.parseInt(in.readLine());

        for (int i = 1; i <= N; i++) {
            int x = Integer.parseInt(in.readLine());
            if (x == 0) {
                if (!heap.isEmpty()) {
                    ans.append(heap.poll() + "\n");
                }
                else{
                    ans.append("0\n");
                }
            }
            else{
                heap.add(x);
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
