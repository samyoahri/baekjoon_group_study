package Free;

import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int loc;
    int weight;
    public Node(int loc, int weight) {
        this.loc = loc;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node other) {
        if (this.weight < other.weight) {
            return -1;
        }
        return 1;
    }
}
public class boj_1238_samyoahri {
    static List<Node>[] adjList;
    static int[] dist;

    static int dijkstra(int start, int end) {
        int len = adjList.length;
        dist = new int[len];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            Node nowNode = pq.poll();
            int now = nowNode.loc;
            int weight = nowNode.weight;
            if(dist[now] < weight) continue;
            for (int j = 0; j < adjList[now].size(); j++) {
                int curTo = adjList[now].get(j).loc;
                int cost = dist[now] + adjList[now].get(j).weight;
                if (cost < dist[curTo]) {
                    dist[curTo] = cost;
                    pq.offer(new Node(curTo, cost));
                }
            }
        }

        return dist[end];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        adjList = new List[N + 1];
        for (int i = 0; i <= N; i++) {
            adjList[i] = new ArrayList();
        }
        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(in.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            adjList[start].add(new Node(end, weight));
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            int temp = dijkstra(i, X) + dijkstra(X, i);
            if (max < temp) {
                max = temp;
            }
        }
        ans.append(max);


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
