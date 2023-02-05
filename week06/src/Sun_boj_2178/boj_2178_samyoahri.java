package Sun_boj_2178;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Coordinate{
    int x;
    int y;
    int cnt;

    public Coordinate(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
public class boj_2178_samyoahri {
    static int N;
    static int M;
    static int result;
    static boolean visited[][];
    static int graph[][];
    static void bfs(int i, int j) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(i, j, 1));
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            Coordinate now = queue.poll();
            if(now.x==M && now.y==N){
                result = now.cnt;
                return;
            }

            int cnt;
            int newX;
            int newY;
            for (int k = 1; k <= 4; k++) {
                cnt = now.cnt + 1;
                //Top
                if (k == 1) {
                    newX = now.x;
                    newY = now.y + 1;

                }
                //Down
                else if (k == 2) {
                    newX = now.x;
                    newY = now.y - 1;
                }
                //Left
                else if (k == 3) {
                    newX = now.x -1;
                    newY = now.y;
                }
                //Right
                else if (k == 4) {
                    newX = now.x + 1;
                    newY = now.y;
                }
                else{
                    System.out.println("K값 오류");
                    break;
                }
                if(newX < 1 || newY < 1 || newX > M || newY > N)    continue;
                if (!visited[newY][newX] && graph[newY][newX] == 1) {
                    queue.offer(new Coordinate(newX, newY, cnt));
                    visited[newY][newX] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //행의개수 (y좌표)
        N = Integer.parseInt(st.nextToken());
        //열의개수 (x좌표)
        M = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String[] strings = in.readLine().split("");
            for (int j = 1; j <= M; j++) {
                graph[i][j] = Integer.parseInt(strings[j-1]);
            }
        }

//        for (int arr[] : graph) {
//            for (int integer : arr) {
//                System.out.print(integer + " ");
//            }
//            System.out.println();
//        }
        bfs(1, 1);

        ans.append(result);
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
