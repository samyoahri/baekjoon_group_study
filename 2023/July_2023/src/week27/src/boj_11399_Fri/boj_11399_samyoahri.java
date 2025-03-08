package boj_11399_Fri;

import java.io.*;
import java.util.*;

public class boj_11399_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        int[] workingTime = new int[N];
        for (int i = 0; i < N; ++i) {
            workingTime[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(workingTime);
        int sum = 0, waitingTime = 0;
        for (int i = 0; i < N; ++i) {
            waitingTime += workingTime[i];
            sum += waitingTime;
        }
        ans.append(sum);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
