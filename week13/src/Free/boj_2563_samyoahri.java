package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_2563_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        //색종이의 수
        byte N = Byte.parseByte(in.readLine());
        byte[][] drawingPaper = new byte[101][101];
        for (byte l = 0; l < N; l++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            byte x = Byte.parseByte(st.nextToken());
            byte y = Byte.parseByte(st.nextToken());
            for (byte i = y; i < y + 10; i++) {
                for (int j = x; j < x + 10; j++) {
                    ++drawingPaper[i][j];
                }
            }
        }
        int area = 10000;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (drawingPaper[i][j] == 0) {
                    --area;
                }
            }
        }
        ans.append(area);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
