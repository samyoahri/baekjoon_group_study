package Sun_boj_16173;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

class MatCoordinate{
    int i;
    int j;

    public MatCoordinate(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
public class boj_16173_samyoahri {
    static int[][] graph;
    static boolean[][] visited;
    static boolean bfs(int i, int j) {
        Queue<MatCoordinate> queue = new ArrayDeque<>();
        queue.add(new MatCoordinate(i, j));
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            MatCoordinate now = queue.poll();
            int i1 = now.i;
            int j1 = now.j;
            if (graph[i1][j1] == -1) {
                return true;
            }
            int i2 = 0;
            int j2 = 0;
            for (int k = 1; k <= 2; k++) {

                if (k == 1) {
                    i2 = i1;
                    j2 = j1 + graph[i1][j1];
                } else if (k == 2) {
                    i2 = i1 + graph[i1][j1];
                    j2 = j1;
                }
                else{
                    System.out.println("오류");
                    break;
                }
                if (i2 <= 0 || j2 <= 0 || i2 > N || j2 > N) {
                    continue;
                }

                if (!visited[i2][j2]) {
                    queue.offer(new MatCoordinate(i2, j2));
                    visited[i2][j2] = true;
                }

            }
        }

        return false;
    }

    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        N = Integer.parseInt(in.readLine());
        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1][N + 1];
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        boolean possible = bfs(1, 1);
        if (possible) {
            ans.append("HaruHaru");
        }
        else{
            ans.append("Hing");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
