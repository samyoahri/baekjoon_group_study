package Fri_boj_1449;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1449_samyoahri {
//    static boolean location[] = new boolean[1001];;
//    static int findMaxLeakPoint(){
//
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //물이 새는 곳의 개수
        int N = Integer.parseInt(st.nextToken());
        //테이프의 길이
        int L = Integer.parseInt(st.nextToken());
        int[] X_coordinate_leakingWater = new int[N];
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < N; i++) {
            X_coordinate_leakingWater[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(X_coordinate_leakingWater);
        int tapeCnt = 1;
        int start = X_coordinate_leakingWater[0];
        for (int i = 1; i < X_coordinate_leakingWater.length; ++i) {
            //테이프 길이가 모자라면
            if (L <= X_coordinate_leakingWater[i] - start) {
                ++tapeCnt;
                start = X_coordinate_leakingWater[i];
            }
        }
        ans.append(tapeCnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
