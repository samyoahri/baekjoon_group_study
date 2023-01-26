package Thu_boj_14425;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj_14425_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //문자열의 갯수(집합 S)
        int N = Integer.parseInt(st.nextToken());
        //문자열의 갯수(집합 S에 포함되는지 알 수 없음)
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(in.readLine());
        }
        int cnt = 0;
        for (int i = 0; i < M; i++) {
//            String str = in.readLine();
            if (hashSet.contains(in.readLine())) {
                cnt++;
            }
        }
        ans.append(cnt);
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
