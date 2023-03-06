package Tue_boj_1388;

import java.io.*;
import java.util.ArrayDeque;
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
public class boj_1388_samyoahri {
    static char[][] graph;
    static boolean[][] visited;

    static int bfs(int i, int j) {
        int cnt = 0;
        if (!visited[i][j]) {
            cnt = 1;
//            System.out.print("[i = " + i + ", ");
//            System.out.println("j = " + j + "]");
        }
        Queue<MatCoordinate> queue = new ArrayDeque<>();
        queue.offer(new MatCoordinate(i, j));
        visited[i][j] = true;
        char origin = graph[i][j];
        while (!queue.isEmpty()) {
            MatCoordinate now = queue.poll();
            int i1 = now.i;
            int j1 = now.j;
            origin = graph[i1][j1];
            int i2 = 0;
            int j2 = 0;
            if (origin == '-') {
                i2 = i1;
                j2 = j1 + 1;
            } else if (origin == '|') {
                i2 = i1 + 1;
                j2 = j1;
            }else{
                System.out.println("오류");
                break;
            }
            if (i2 <= 0 || j2 <= 0 || i2 > N || j2 > M) {
                continue;
            }
            if (!visited[i2][j2] && graph[i2][j2]==origin) {
                queue.offer(new MatCoordinate(i2, j2));
                visited[i2][j2] = true;
//                System.out.print("[i2 = " + i2 + ", ");
//                System.out.println("j2 = " + j2 + "]");
            }
        }
//        System.out.println();
        return cnt;
    }
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new char[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String[] strings = in.readLine().split("");
            for (int j = 1; j <= M; j++) {
                graph[i][j] = strings[j-1].charAt(0);
            }
        }
//        for (char[] arr : graph) {
//            for (char ch : arr) {
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                cnt += bfs(i, j);
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
