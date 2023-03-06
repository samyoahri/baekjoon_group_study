package Fri_boj_1743;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class MatCoordinate{
    int i;
    int j;
    int cnt;

    public MatCoordinate(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public MatCoordinate(int i, int j, int cnt) {
        this.i = i;
        this.j = j;
        this.cnt = cnt;
    }
}
public class boj_1743_samyoahri {
    static boolean[][] visited;
    static int[][] graph;
    static int bfs(){
        return bfs(1, 1);
    }
    static int bfs(int i, int j) {
        Queue<MatCoordinate> queue = new ArrayDeque<>();
        queue.offer(new MatCoordinate(i, j));
        visited[i][j] = true;
        int cnt = 0;
        if (graph[i][j] == 1) {
            cnt++;
        }
//        visited[i][j] = true;
        while (!queue.isEmpty()) {
            MatCoordinate now = queue.poll();
            for (int k = 1; k <= 4; k++) {
                int i2, j2;
                if (k == 1) {
                    i2 = now.i;
                    j2 = now.j + 1;
                } else if (k == 2) {
                    i2 = now.i + 1;
                    j2 = now.j;
                } else if (k == 3) {
                    i2 = now.i;
                    j2 = now.j - 1;
                } else if (k == 4) {
                    i2 = now.i - 1;
                    j2 = now.j;
                } else {
                    System.out.println("오류");
                    break;
                }

                if (i2 <= 0 || j2 <= 0 || i2 > N || j2 > M) {
                    continue;
                }
                if (!visited[i2][j2] && graph[i2][j2] == 1) {
                    queue.add(new MatCoordinate(i2, j2));
                    visited[i2][j2] = true;
                    cnt++;
                }
            }
        }
        return cnt;
//        return -1;
    }
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //통로의 세로길이
        N = Integer.parseInt(st.nextToken());
        //통로의 가로길이
        M = Integer.parseInt(st.nextToken());
        //음식물 쓰레기의 개수
        int K = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int k = 1; k <= K; k++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
        }
//        for (int arr[] : graph) {
//            for (int integer : arr) {
//                System.out.print(integer + " ");
//            }
//            System.out.println();
//        }
        int max = 0;
        int res = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                res = bfs(i, j);
                if (max < res) {
                    max = res;
                }
            }
        }

        ans.append(max);


        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
