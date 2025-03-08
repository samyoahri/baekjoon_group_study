package Free;

import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge>{
    int vertex;
    int adjVertex;
    int weight;
    public Edge(int vertex, int adjVertex, int weight) {
        this.vertex = vertex;
        this.adjVertex = adjVertex;
        this.weight = weight;
    }
    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class boj_18223_samyoahri {
    static List<Edge>[] adjList;

    static void printGraph(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println("[i = " + i + "]");
            for (int j = 0; j < adjList[i].size(); j++) {
                System.out.println("v"+adjList[i].get(j).vertex+"->v"+adjList[i].get(j).adjVertex+
                        ":"+adjList[i].get(j).weight);
            }
        }
    }
    static int INF = 987654321;
    static int dijkstra(int start){
        int N = adjList.length;
        int dist[] = new int[N];
        Arrays.fill(dist, INF);
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            Edge nowEdge = pq.poll();
            int now = nowEdge.adjVertex;
            int weight = nowEdge.weight;
            if(dist[now] < weight) continue;
            for (int j = 0; j < adjList[now].size(); j++) {
                int from = adjList[now].get(j).vertex;
                int to = adjList[now].get(j).adjVertex;
                int cost = adjList[now].get(j).weight + dist[from];
                if (cost < dist[to]) {
                    dist[to] = cost;
                    pq.offer(new Edge(from, to, cost));
                }
            }
        }
        return dist[6];
    }
    static int gunWoo;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        gunWoo = Integer.parseInt(st.nextToken());
        adjList = new List[N + 1];
        for (int i = 0; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adjList[u].add(new Edge(u, v, w));
            adjList[v].add(new Edge(v, u, w));
        }
        printGraph(N);

//        boolean check = false;
//        check = dijkstra(1);
        ans.append(dijkstra(1));

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
