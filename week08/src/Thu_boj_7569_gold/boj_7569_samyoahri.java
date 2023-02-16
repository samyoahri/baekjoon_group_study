package Thu_boj_7569_gold;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;
class MatCoordinate{
    int h;
    int i;
    int j;
    int cnt;

    public MatCoordinate(int h, int i, int j, int cnt) {
        this.h = h;
        this.i = i;
        this.j = j;
        this.cnt = cnt;
    }
}
public class boj_7569_samyoahri {
    static int[][][] graph3D;
    static boolean[][][] visited;

    static void findMaturedTomatoAndPutQueue(Queue<MatCoordinate> queue) {
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (graph3D[h][i][j] == 1) {
                        queue.offer(new MatCoordinate(h, i, j, 0));
                        visited[h][i][j] = true;
                    }
                }
            }
        }
    }
    static int bfs(){
        int cnt = 0;
        int max = -2147;
        Queue<MatCoordinate> queue = new ArrayDeque<>();
        findMaturedTomatoAndPutQueue(queue);
        while (!queue.isEmpty()) {
            MatCoordinate now = queue.poll();
            int i1 = now.i; int j1 = now.j; int h1 = now.h; cnt = now.cnt;
            if (max < cnt) {
                max = cnt;
            }
            for (int k = 1; k <= 6; k++) {
                int i2, j2, h2;
                if (k == 1) {
                    i2 = i1;
                    j2 = j1 + 1;
                    h2 = h1;
                } else if (k == 2) {
                    i2 = i1 + 1;
                    j2 = j1;
                    h2 = h1;
                } else if (k == 3) {
                    i2 = i1;
                    j2 = j1 - 1;
                    h2 = h1;
                } else if (k == 4) {
                    i2 = i1 - 1;
                    j2 = j1;
                    h2 = h1;
                } else if (k == 5) {
                    i2 = i1;
                    j2 = j1;
                    h2 = h1 + 1;
                } else if (k == 6) {
                    i2 = i1;
                    j2 = j1;
                    h2 = h1 - 1;
                }
                else{
                    System.out.println("Error");
                    break;
                }
                if (i2 < 0 || j2 < 0 || h2 < 0 || i2 >= N || j2 >= M || h2 >= H) {
                    continue;
                }
                if (!visited[h2][i2][j2] && graph3D[h2][i2][j2]==0) {
                    queue.offer(new MatCoordinate(h2, i2, j2, cnt + 1));
                    graph3D[h2][i2][j2] = 1;
                    visited[h2][i2][j2] = true;
                }
            }
        }
        return max;
    }
    static int M;
    static int N;
    static int H;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        graph3D = new int[H][N][M];
        visited = new boolean[H][N][M];

//        for (int[][] graph : graph3D) {
//            for (int[] arr : graph) {
//                for (int integer : arr) {
//                    System.out.print(integer + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("-----------");
//        }

        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(in.readLine(), " ");
                for (int j = 0; j < M; j++) {
                    graph3D[h][i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }
//        for (int[][] graph : graph3D) {
//            for (int[] arr : graph) {
//                for (int integer : arr) {
//                    System.out.print(integer + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("-----------");
//        }
        int minDay = bfs();
        boolean check = false;
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (graph3D[h][i][j] == 0) {
                        check = true;
                        break;
                    }
                }
            }
        }
        if (check) {
            minDay = -1;
        }

        ans.append(minDay);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
