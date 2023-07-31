package week01.Mon_boj_1263_gold;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Work{
    int duringTime;

    int lastTime;

    public Work(int time, int lastTime) {
        this.duringTime = time;
        this.lastTime = lastTime;
    }
}

public class boj_1263_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        Work[] works = new Work[N];
        StringTokenizer st;
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine());
            int duringTime = Integer.parseInt(st.nextToken());
            int lastTime = Integer.parseInt(st.nextToken());
            works[i] = new Work(duringTime, lastTime);
        }
        Arrays.sort(works, new Comparator<Work>() {
            @Override
            public int compare(Work o1, Work o2) {
//                return -(o1.lastTime - o2.lastTime);
                if (o1.lastTime == o2.lastTime) {
                    return -(o1.duringTime - o2.duringTime);
                }
                return -(o1.lastTime - o2.lastTime);
            }
        });
        int now = 1000000;
        boolean impossible = false;
        for (int i = 0; i < N; ++i) {
            int duringTime = works[i].duringTime;
            int lastTime = works[i].lastTime;
            if (now > lastTime) {
                now = lastTime;
            }
            now = now - duringTime;
            if (now < 0) {
                impossible = true;
                break;
            }
        }
        if (impossible) {
            ans.append(-1);
        }
        else{
            ans.append(now);
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
