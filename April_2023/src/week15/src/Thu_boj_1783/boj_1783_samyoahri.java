package Thu_boj_1783;

import java.io.*;
import java.util.StringTokenizer;

public class boj_1783_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //나이트가 4가지 방법을 모두 이용하는 경우
        if (N >= 3 && M >= 7) {
            ans.append((4 + M - 6));
        }
        //나이트가 움직일 수 없는 경우(방문한 칸 1개)
        else if (N == 1 || M == 1) {
            ans.append(1);
        }
        // 2<=N<3 || 2<= M <7
        else if (N >= 2 && N < 3) {
            ans.append(1 + Math.min(3, (M - 1) / 2));
        }
        else if (M >= 2 && M < 7) {
            ans.append(1 + Math.min(3, M - 1));
        }
        else{
            ans.append("오류");
        }



        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
