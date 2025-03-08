package Sat_boj_1158;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1158_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        ans.append("<");

        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            int cnt = 0;
            while (true) {
                int tmp = queue.remove();
                cnt++;
                if (cnt == K) {
                    ans.append(tmp + ", ");
                    break;
                }
                else{
                    queue.add(tmp);
                }
            }
        }

        ans.replace(ans.length() - 2, ans.length(), ">");
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
