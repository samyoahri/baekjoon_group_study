package Fri_boj_11404;

import java.io.*;
import java.util.StringTokenizer;

public class boj_11404_samyoahri {
    static int INF = 987654321;
    static StringBuilder ans;
    static int[][] matrix;

    static void printGraph(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(matrix[i][j]!=INF)
                    ans.append(matrix[i][j] + " ");
                else
                    ans.append(0 + " ");
            }
            ans.append("\n");
        }
    }

    static void Floyd(int n) {
//        for (int k = 1; k <= n; k++) {
//            for (int i = 1; i <= n; i++) {
//                for (int j = 1; j <= n; j++) {
//                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
//                }
//            }
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int M = Integer.parseInt(in.readLine());

        matrix = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                }
                else{
                    matrix[i][j] = INF;
                }
            }
        }

        StringTokenizer st;
        for (int idx = 0; idx < M; idx++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if(matrix[u][v] > w) matrix[u][v] = w;
        }
//        printGraph(N);
        Floyd(N);
        printGraph(N);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
