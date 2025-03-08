package Tue_boj_13170;

import java.io.*;
import java.util.StringTokenizer;

public class boj_13170_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //남은 마나수정의 개수
        int N = Integer.parseInt(st.nextToken());
        //남은 마나수정 중 폭발하는 수정의 강도 순서
        int K = Integer.parseInt(st.nextToken());
        //망치를 내려칠 수 있는 최대 힘
        int P = Integer.parseInt(st.nextToken());
        //폭발 위험이 있는 힘 차이
        int W = Integer.parseInt(st.nextToken());
        if (P % W == 0) {
            ans.append((P / W));
        }
        else{
            ans.append((P / W + 1));
        }


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
