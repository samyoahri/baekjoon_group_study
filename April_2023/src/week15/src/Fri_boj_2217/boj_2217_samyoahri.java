package Fri_boj_2217;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class boj_2217_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        Integer[] ropes = new Integer[N];
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(ropes, Collections.reverseOrder());
        int maxWeight = 0;
        for (int i = 0, cnt = 1; i < N; ++i, ++cnt) {
            //nowWeight = 선택한 로프 중 가장 낮은 무게를 버티는 로프 * 지금까지의 로프갯수
            int nowWeight = cnt * ropes[i];
            if (nowWeight > maxWeight) {
                maxWeight = nowWeight;
            }
            else{
                break;
            }
        }
        ans.append(maxWeight);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
