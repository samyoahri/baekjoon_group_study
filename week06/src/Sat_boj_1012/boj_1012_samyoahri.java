package Sat_boj_1012;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

class Coordinate{
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class boj_1012_samyoahri {
    static int N;
    static int M;
    static int K;
    ////////////////////
    static int cnt = 0;
    static int[][] graph;
    static boolean[][] visited;

    static void bfs(int i, int j) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(j, i));
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            Coordinate now = queue.poll();
            int nextX;
            int nextY;
            for (int k = 1; k <= 4; k++) {
                //top
                if (k == 1) {
                    nextX = now.x;
                    nextY = now.y + 1;
                }
                //down
                else if (k == 2) {
                    nextX = now.x;
                    nextY = now.y - 1;
                }
                //left
                else if (k == 3) {
                    nextX = now.x - 1;
                    nextY = now.y;
                }
                //right
                else if (k == 4) {
                    nextX = now.x + 1;
                    nextY = now.y;
                }
                else{
                    System.out.println("bfs k값오류");
                    break;
                }
                if (nextX < 0 || nextY < 0 || nextY > N-1 || nextX > M - 1) {
                    continue;
                }
                if (graph[nextY][nextX] == 1 && !visited[nextY][nextX]) {
                    queue.add(new Coordinate(nextX, nextY));
                    visited[nextY][nextX] = true;
                }
            }
        }
        cnt++;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(in.readLine());

        for (int l = 0; l < T; l++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            //배추밭 가로길이
            M = Integer.parseInt(st.nextToken());
            //배추밭 세로길이
            N = Integer.parseInt(st.nextToken());
            //배추가 심어져 있는 개수
            K = Integer.parseInt(st.nextToken());
            //그래프 초기화
            visited = new boolean[N][M];
            graph = new int[N][M];
            
            for (int p = 0; p < K; p++) {
                st = new StringTokenizer(in.readLine(), " ");
                int x;
                int y;
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                graph[y][x] = 1;
            }
//            for (int[] arr : graph) {
//                for (int integer : arr) {
//                    System.out.print(integer + " ");
//                }
//                System.out.println();
//            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(graph[i][j]==1 && !visited[i][j]){
                        bfs(i, j);
                    }
                }
            }

            ans.append(cnt + "\n");

            cnt = 0;
            for (int i = 0; i < N; i++) {
                Arrays.fill(visited[i], false);
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
