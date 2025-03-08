package Sun_boj_2138;

import java.io.*;

public class boj_2138_samyoahri {
    static void lightOn(int[] buttons, int buttonIdx) {
        int idx = buttonIdx;
        if (idx < 1) {
            return;
        }
        else{
            //1일때는 0으로 0일때는 1로(즉, 반전)
            if (idx > 1) {
                buttons[idx - 1] = 1 - buttons[idx - 1];
            }
            buttons[idx] = 1 - buttons[idx];
            if (buttonIdx < buttons.length-1) {
                buttons[idx+1] = 1 - buttons[idx+1];
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int[] nowBulbs = new int[N + 1];
        int[] targetBulbs = new int[N + 1];
        String[] strings = in.readLine().split("");
        String[] strings1 = in.readLine().split("");
        //1번 버튼을 누리지 않을 tmp
        int[] tmpBulbs = new int[N + 1];
        //1번 버튼을 누를 tmp
        int[] tmpBulbs1 = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            nowBulbs[i] = Integer.parseInt(strings[i - 1]);
            tmpBulbs[i] = Integer.parseInt(strings[i - 1]);
            tmpBulbs1[i] = Integer.parseInt(strings[i - 1]);
            targetBulbs[i] = Integer.parseInt(strings1[i - 1]);
        }

        lightOn(tmpBulbs1, 1);
        int cnt = 0, cnt1 = 1;
        for (int i = 2; i <= N; i++) {
            if (tmpBulbs[i-1] != targetBulbs[i-1]) {
                lightOn(tmpBulbs, i);
                ++cnt;
            }
            if (tmpBulbs1[i-1] != targetBulbs[i-1]) {
                lightOn(tmpBulbs1, i);
                ++cnt1;
            }
        }
        if (tmpBulbs1[N] != targetBulbs[N]) {
            cnt1 = Integer.MAX_VALUE;
        }
        if (tmpBulbs[N] != targetBulbs[N]) {
            cnt = Integer.MAX_VALUE;
        }
        if (cnt == Integer.MAX_VALUE && cnt1 == Integer.MAX_VALUE) {
            ans.append(-1);
        }
        else{
            ans.append(Math.min(cnt, cnt1));
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
