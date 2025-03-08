package week03.Fri_boj_11577_gold;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_11577_samyoahri {
    static int N;
    static int K;
    static boolean[] bulbs;
    static void toggle(int start){
        int end = start + K - 1;
        if (end >= N) {
//            System.out.println("Error");
        }
        else{
            for (int i = start; i <= end; ++i) {
                if (bulbs[i]) {
                    bulbs[i] = false;
                }
                else{
                    bulbs[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(in.readLine(), " ");
        bulbs = new boolean[N];
        for (int i = 0; i < N; ++i) {
            int swithchNum;
            swithchNum = Integer.parseInt(st.nextToken());
            if (swithchNum == 1) {
                bulbs[i] = true;
            }
            else{
                bulbs[i] = false;
            }
        }
        int cnt = 0;
        //첫번째 전구가 켜져있다면(왜냐하면 첫번째 전구를 끌 방법은 첫번째 전구를 눌러서 끄는 방법 밖에 없으므로)
        if (bulbs[0]) {
            toggle(0);
            ++cnt;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        int i;
//        for (i = 0; i <= N - K; ++i) {
        for (i = 0; i < N; ++i) {
            boolean nowBulbState = bulbs[i];
            if (queue.size() % 2 != 0) {
                nowBulbState = !nowBulbState;
            }
            if (!queue.isEmpty() && i >= queue.peek()) {
                queue.poll();
            }
            if (nowBulbState) {
                if(i > N - K){
                    break;
                }
                ++cnt;
                queue.add(i + K - 1);
            }
        }
        if (i < N) {
            ans.append("Insomnia");
        }
        else{
            ans.append(cnt);
        }


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
