package Wed_boj_7576_gold;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

class MatCoordinate{
    int i;
    int j;
    int cnt;

    public MatCoordinate(int i, int j, int cnt) {
        this.i = i;
        this.j = j;
        this.cnt = cnt;
    }

    public MatCoordinate(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public void findAndSetIdx(int[][] graph){
        int N = graph.length;
        int M = graph[0].length;
        int i = 1;
        int j = 1;
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= M; j++) {
                if (graph[i][j] == 1) {
                    this.i = i;
                    this.j = j;
                    break;
                }
            }
            if (graph[i][j] == 1) {
                this.i = i;
                this.j = j;
                break;
            }
        }
    }
}
public class boj_7576_samyoahri {
    static boolean[][] visited;
    static int [][] graph;

    static int bfs(){
        int max = -2147;
        int cnt = 0;
        Queue<MatCoordinate> queue = new ArrayDeque<>();
        int i = 1, j = 1;
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= M; j++) {
                if (graph[i][j] == 1) {
                    queue.offer(new MatCoordinate(i, j, cnt));
                    visited[i][j] = true;
                }
            }
        }

        int i1, j1, i2, j2;
        while (!queue.isEmpty()) {
            MatCoordinate now = queue.poll();
            i1 = now.i;
            j1 = now.j;
            cnt = now.cnt;
            if (max < cnt) {
                max = cnt;
            }
            for (int k = 1; k <= 4; k++) {
                i2 = 0;
                j2 = 0;
                if (k == 1) {
                    i2 = i1;
                    j2 = j1 + 1;
                } else if (k == 2) {
                    i2 = i1 + 1;
                    j2 = j1;
                } else if (k == 3) {
                    i2 = i1;
                    j2 = j1 - 1;
                } else if (k == 4) {
                    i2 = i1 - 1;
                    j2 = j1;
                }
                else{
                    System.out.println("k오류");
                    break;
                }
                if (i2 <= 0 || j2 <= 0 || i2 > N || j2 > M) {
                    continue;
                }
                if (!visited[i2][j2] && graph[i2][j2]==0) {
                    queue.offer(new MatCoordinate(i2, j2, cnt+1));
                    graph[i2][j2] = 1;
                    visited[i2][j2] = true;
                }
            }

        }

        return max;
    }

//    static int bfs(int i, int j) {
//
//    }
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(graph[i], -2);
        }

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            for (int j = 1; j <= M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int res = bfs();
        boolean check = false;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (graph[i][j] == 0) {
                    check = true;
                    break;
                }
            }
        }
        if (check) {
            res = -1;
        }
        ans.append(res);


        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
