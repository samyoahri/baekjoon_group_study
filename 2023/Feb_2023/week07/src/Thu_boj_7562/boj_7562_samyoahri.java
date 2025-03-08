package Thu_boj_7562;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class MatCoordinate{
    int i;
    int j;

    public MatCoordinate() {
    }

    public MatCoordinate(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
public class boj_7562_samyoahri {
//    static int[] res;
    static int l;
    static StringBuilder ans;
    static int[][] graph;

    static void printArr(){
        for (int arr[] : graph) {
            for (int integer : arr) {
                System.out.print(integer+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int bfs(MatCoordinate start, MatCoordinate end) {
//        int cnt = 0;
        Queue<MatCoordinate> queue = new ArrayDeque<>();
        queue.add(start);
        graph[start.i][start.j] = 1;
        MatCoordinate next;
        while (!queue.isEmpty()) {
            MatCoordinate now = queue.poll();
//            System.out.println("now.i = " + now.i);
//            System.out.println("now.j = " + now.j);
            if (now.i == end.i && now.j == end.j) {
                return graph[now.i][now.j] - 1;
            }
//            next = new MatCoordinate();
            //next.i next.j로 하면 안됨 왜 안될까???
            for (int k = 1; k <= 8; k++) {
                int i2, j2;
                if (k == 1) {
                    i2 = now.i+1;
                    j2 = now.j+2;
                }
                else if (k == 2) {
                    i2 = now.i+2;
                    j2 = now.j+1;
                }
                else if (k == 3) {
                    i2 = now.i+2;
                    j2 = now.j-1;
                }
                else if (k == 4) {
                    i2 = now.i+1;
                    j2 = now.j-2;
                }
                else if (k == 5) {
                    i2 = now.i-1;
                    j2 = now.j-2;
                }
                else if (k == 6) {
                    i2 = now.i-2;
                    j2 = now.j-1;
                }
                else if (k == 7) {
                    i2 = now.i-2;
                    j2 = now.j+1;
                }
                else if (k == 8) {
                    i2 = now.i-1;
                    j2 = now.j+2;
                }
                else{
                    System.out.println("k오류");
                    break;
                }
                if (i2 < 0 || j2 < 0 || i2 > l-1 || j2 > l-1) {
                    continue;
                }
//                System.out.println("k = " + k);
//                System.out.println("next.i = " + i2);
//                System.out.println("next.j = " + j2);
                if(graph[i2][j2]==0){
                    queue.add(new MatCoordinate(i2, j2));
//                    queue.add(next);
                    graph[i2][j2] = graph[now.i][now.j] + 1;
                }
            }
        }
        return -1;
    }
//    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
        ans = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(in.readLine());

        for (int k = 0; k < T; k++) {
            l = Integer.parseInt(in.readLine());
            graph = new int[l + 1][l + 1];
//            printArr();
            st = new StringTokenizer(in.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(in.readLine(), " ");
            int i2 = Integer.parseInt(st.nextToken());
            int j2 = Integer.parseInt(st.nextToken());
            MatCoordinate start = new MatCoordinate(i, j);
            MatCoordinate end = new MatCoordinate(i2, j2);
            ans.append(bfs(start, end) + "\n");
//            printArr();
//            dfs(i, j, i2, j2);
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
