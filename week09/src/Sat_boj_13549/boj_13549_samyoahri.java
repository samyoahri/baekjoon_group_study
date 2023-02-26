package Sat_boj_13549;

import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int loc;
    int time;

    public Node(int loc, int time) {
        this.loc = loc;
        this.time = time;
    }

    @Override
    public int compareTo(Node other) {
        if (this.time < other.time) {
            return -1;
        }
        return 1;
    }
}
public class boj_13549_samyoahri {
    static int INF = 100000000;
    static int MAX = 200000;
    static int min = Integer.MAX_VALUE;
    static int[] dist;
    static boolean[] visited;

    static int bfs(int start, int target) {
//        Queue<Node> queue = new ArrayDeque<>();
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start, 0));
        visited[start] = true;
        while (!queue.isEmpty()) {
            Node now = queue.poll();
            int nowTime = now.time, nowLoc = now.loc;
            visited[nowLoc] = true;
            if (nowLoc == target && min > nowTime) {
                min = nowTime;
            }
            int nextIdx = 0, nextCnt = 0;
            for (int j = 1; j <= 3; j++) {
                if (j == 1) {
                    nextIdx = nowLoc * 2;
                    nextCnt = nowTime;
                } else if (j == 2) {
                    nextIdx = nowLoc + 1;
                    nextCnt = nowTime + 1;
                } else if (j == 3) {
                    nextIdx = nowLoc - 1;
                    nextCnt = nowTime + 1;
                }
                if(nextIdx > MAX || nextIdx < 0) continue;
//                System.out.println("nextIdx = " + nextIdx);
                if(!visited[nextIdx]){
                    queue.offer(new Node(nextIdx, nextCnt));
//                    visited[nextIdx] = true;
                }
            }
        }

        return min;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dist = new int[MAX + 1];
        visited = new boolean[MAX + 1];
        for (int i = 0; i <= MAX; i++) {
            dist[i] = INF;
        }
        int res = bfs(N, K);
        ans.append(res);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
