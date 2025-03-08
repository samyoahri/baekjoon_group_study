package Tue_boj_1753;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
    int idx;
    int weight;

    public Node(int idx, int weight) {
        this.idx = idx;
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
public class boj_1753_samyoahri {
    static void printGraph(){
        for (int i = 1; i <= V; i++) {
            System.out.println("[i = " + i + "]");
            for (int j = 0; j < adjList[i].size(); j++) {
                System.out.println("v"+i + " -> " +"v"+adjList[i].get(j).idx + ": weight=" + adjList[i].get(j).weight);
            }
            System.out.println();
        }
    }
    static void printDist(){
        System.out.print("dist: ");
        for (int i = 0; i <= V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    static void printVisited(){
        System.out.print("visited: ");
        for (int i = 0; i <= V; i++) {
            System.out.print(visited[i] + " ");
        }
        System.out.println();
    }
    static List<Node> adjList[];
    static boolean[] visited;
    static int[] dist;
    static void dijkstraNotPq(int start){
        //시작점 visited, dist 초기화
        visited[start] = true;
        dist[start] = 0;
        //시작점과 연결된 노드의 거리 셋팅
        for (int j = 0; j < adjList[start].size(); j++) {
            Node next = adjList[start].get(j);
            dist[next.idx] = next.weight;
        }
//        printDist();
//        printVisited();
        // 시작 노드를 제외한 V-1개의 노드에 대해 실행
        for (int i = 0; i < V; i++) {
            int now = getSmallestNode();
            visited[now] = true;
//            System.out.println("[now="+now+"]");
//            printDist();
            for (int j = 0; j < adjList[now].size(); j++) {
                Node next = adjList[now].get(j);
                int cost = dist[now] + next.weight;
                if (cost < dist[next.idx]) {
                    dist[next.idx] = cost;
//                    System.out.println("<next="+next+">");
//                    printDist();
                }
            }
        }
    }
    static int getSmallestNode(){
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 1; i <= V; i++) {
            if (dist[i] < min && !visited[i]) {
                min = dist[i];
                idx = i;
            }
        }
        return idx;
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
//        visited[start] = true;
        dist[start] = 0;
        pq.offer(new Node(start, 0));
        while (!pq.isEmpty()) {
            Node node = pq.poll();
//            printDist();
            int weight = node.weight;
            int now = node.idx;
            if(dist[now] < weight)  continue;
            for (int j = 0; j < adjList[now].size(); j++) {
                int cost = dist[now] + adjList[now].get(j).weight;
                int next = adjList[now].get(j).idx;
                if (cost < dist[next]) {
                    dist[next] = cost;
                    pq.offer(new Node(next, cost));
                }
            }
        }
    }
    static int V;
    static int E;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        adjList = new List[V + 1];
        visited = new boolean[V + 1];
        dist = new int[V + 1];
        for (int i = 0; i <= V; i++) {
            adjList[i] = new ArrayList<Node>();
            dist[i] = Integer.MAX_VALUE;
        }
        int start = Integer.parseInt(in.readLine());
        for (int i = 1; i <= E; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adjList[u].add(new Node(v, w));
//            adjList[v].add(new Node(u, w));
        }
//        printGraph();
//        printDist();
//        dijkstraNotPq(start);
        dijkstra(start);
        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                ans.append("INF\n");
            }
            else{
                ans.append(dist[i] + "\n");
            }
        }


        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
