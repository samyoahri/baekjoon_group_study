package Free;

import java.io.*;

public class boj_10798_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String[][] matrix = new String[5][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                matrix[i][j] = "!";
            }
        }

        for (int i = 0; i < 5; i++) {
            String[] strings = in.readLine().split("");
            for (int j = 0; j < strings.length; j++) {
                matrix[i][j] = strings[j];
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (!matrix[i][j].equals("!")) {
                    ans.append(matrix[i][j]);
                }
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
