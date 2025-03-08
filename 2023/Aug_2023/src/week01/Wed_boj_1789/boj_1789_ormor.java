package week01.Wed_boj_1789;

import java.io.*;
import static java.lang.Math.sqrt;

public class boj_1789_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        long S = Long.parseLong(in.readLine()); // S : 자연수의 합
        long N = Math.round(Math.floor((-1 + sqrt(1 + 8*S))/2)); // N : 자연수의 최소 개수
        // 자연수 1부터 N까지의 합(시그마 1부터N까지, K)의 공식 : (N*(N+1))/2
        // 따라서, (N*(N+1))/2 <= S (S는 상수)
        // 양변에 2를 곱하고, S를 좌항으로 넘기면(우항을 0으로 만든다.) 근의 공식에 의해 N은 다음과 같은 값을 가진다.
        // (단, S가 자연수 이므로 N은 양의 근만 가지게 된다.)
        //
        // N = (-1 + sqrt( 1 - 4*1*(-2S)))/2
        // N = (-1 + sqrt( 1 + 8S))/2

        // N의 근은 2차함수 그래프의 최대값을 의미하고, 최대값보다 작은 값들 중 가장 큰 자연수를 구하면 되므로,
        // N의 값(double타입)에서 소숫점을 제거하고(내림 연산), long타입으로 변환한다.

        ans.append(N);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}