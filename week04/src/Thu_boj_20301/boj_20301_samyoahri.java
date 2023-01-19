package Thu_boj_20301;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj_20301_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        boolean reverseCheck = false;
        int Kcnt = 0;
        int Mcnt = 0;
        while (!deque.isEmpty()) {
            if(!reverseCheck){
                while (++Kcnt != K) {
                    deque.addLast(deque.removeFirst());
                }
                Kcnt = 0;
                ans.append(deque.removeFirst()+"\n");
                if (++Mcnt == M) {
                    reverseCheck = true;
                    Mcnt = 0;
                }
            }
            else{
                while (++Kcnt != K) {
                    deque.addFirst(deque.removeLast());
                }
                Kcnt = 0;
                ans.append(deque.removeLast() + "\n");
                if (++Mcnt == M) {
                    reverseCheck = false;
                    Mcnt = 0;
                }
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
