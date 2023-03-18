package Free;

import java.io.*;

public class boj_2566_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int[][] matrix = new int[9][9];
        int max = Integer.MIN_VALUE, i2=0, j2=0;
        for (int i = 0; i < 9; i++) {
            String[] strings = in.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(strings[j]);
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    i2 = i;
                    j2 = j;
                }
            }
        }
        ans.append(max + "\n" + (i2+1) + " " + (j2+1));

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
