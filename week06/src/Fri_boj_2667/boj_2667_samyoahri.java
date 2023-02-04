package Fri_boj_2667;

import java.io.*;
import java.util.*;

class Coordinate{
    int x;
    int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class boj_2667_samyoahri {
    static int N;

    static boolean[][] visited;
    static int[][] graph;

    static int cnt1 = 0;
    static void dfs(int i, int j) {
        visited[i][j] = true;
        cnt1++;

        for (int k = 1; k <= N; k++) {
            if(     (i < N ) && !visited[i+1][j] && graph[i+1][j]==1) dfs(i+1, j);
            else if((i > 1)  && !visited[i-1][j] && graph[i-1][j]==1) dfs(i-1, j);
            else if((j < N ) && !visited[i][j+1] && graph[i][j+1]==1) dfs(i, j+1);
            else if((j > 1)  && !visited[i][j-1] && graph[i][j-1]==1) dfs(i, j-1);
        }
    }
    static void bfs(int i, int j) {
        int cnt = 0;

        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.offer(new Coordinate(j, i));
        visited[i][j] = true;

        int newX = 0; int newY = 0;
        while (!queue.isEmpty()) {
            Coordinate now = queue.poll();
            if (graph[now.y][now.x]==1) {
                cnt++;
            }
            for (int k = 1; k <= 4; k++) {
                //top
                if (k == 1) {
                    newX = now.x + 0;
                    newY = now.y + 1;
                }
                //bot
                else if (k == 2) {
                    newX = now.x + 0;
                    newY = now.y - 1;
                }
                //left
                else if (k == 3) {
                    newX = now.x - 1;
                    newY = now.y + 0;
                }
                //right
                else if (k == 4) {
                    newX = now.x + 1;
                    newY = now.y + 0;
                }
                else{
                    System.out.println("k오류");
                    break;
                }
                
                if (newX < 1 || newY < 1 || newX > N || newY > N) {
                    continue;
                }
                if (!visited[newY][newX] && graph[newY][newX] == 1) {
                    queue.offer(new Coordinate(newX, newY));
                    visited[newY][newX] = true;
                }
            }
        }
        res.add(cnt);
    }
    static PriorityQueue<Integer> res;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        N = Integer.parseInt(in.readLine());
        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1][N + 1];
        res = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 == o2) {
                    return 0;
                }
                else{
                    return -1;
                }
            }
        });

        for (int i = 1; i <= N; i++) {
            String[] strings = in.readLine().split("");
            for (int j = 1; j <= N; j++) {
                graph[i][j] = Integer.parseInt(strings[j-1]);
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if ((!visited[i][j]) && (graph[i][j] == 1)) {
//                    bfs(i, j);

                    dfs(i, j);
                    res.offer(cnt1);
                    cnt1 = 0;
                }
            }
        }
        ans.append(res.size() + "\n");
        while (!res.isEmpty()) {
            ans.append(res.poll()+"\n");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
