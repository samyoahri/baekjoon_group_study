import java.io.*;
import java.util.StringTokenizer;

public class boj_1018 {
    static char reverse(char ch) {
        if (ch == 'W') {
            return 'B';
        }
        else{
            return 'W';
        }
    }
    static int calcNumOfRepaint(char[][] matrix, int startI, int startJ) {
        if (matrix.length < startI + 8
                || matrix[0].length < startJ + 8) {
            return Integer.MAX_VALUE;
        }
        int cnt = 0;
        char ch = matrix[startI][startJ];
        for (int i = startI; i < startI + 8; ++i) {
            for (int j = startJ; j < startJ + 8; ++j) {
                if (matrix[i][j] != ch) {
                    ++cnt;
                }
                ch = reverse(ch);
            }
            ch = reverse(ch);
        }
        return Math.min(cnt, 64 - cnt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] matrix = new char[N][M];

        for (int i = 0; i < N; ++i) {
            String str = in.readLine();
            for (int j = 0; j < M; ++j) {
                char ch = str.charAt(j);
                matrix[i][j] = ch;
            }
        }
        int cnt = Integer.MAX_VALUE;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                cnt = Math.min(cnt, calcNumOfRepaint(matrix, i, j));
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
