package Mon_boj_9370;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//class Edge{
//    int vertex;
//    int weight;
//    int adjVertex;
//    public Edge(int vertex, int weight, int adjVertex) {
//        this.vertex = vertex;
//        this.weight = weight;
//        this.adjVertex = adjVertex;
//    }
//}
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
public class boj_9370_samyoahri {
    static void printGraph(int n) {
        System.out.println("=======printGraph=======");
        for (int i = 1; i < n; i++) {
            System.out.println("[i = " + i + "]");
            for (int j = 0; j < adjList[i].size(); j++) {
                System.out.println("idx:"+adjList[i].get(j).idx+" weight:"+adjList[i].get(j).weight);
            }
        }
        System.out.println("========================");
    }

    static void printDist(int n) {
        System.out.println("=======printDist========");
        for (int i = 1; i <= n; i++) {
            System.out.print("dist["+i+"]:" + dist[i] + " ");
        }
        System.out.println();
        System.out.println("========================");
    }

    static void printTrack(int start, int n) {
        System.out.println("=======printTrack========");
        for (int i = 1; i <= n; i++) {
            System.out.print("v"+start+"->");
            for (int j = 0; j < track[i].size(); j++) {
                System.out.print("v"+track[i].get(j)+"->");
            }
            System.out.println("v"+i+"(finish):"+dist[i]);
        }
        System.out.println();
        System.out.println("========================");
    }
    static List<Node> adjList[];
    static int[] dist;
    static List[] track;
    static void dijkstra(int start) {
        int N = adjList.length;
        dist = new int[N];
        track = new List[N];
        for (int i = 0; i < N; i++) {
            track[i] = new ArrayList();
        }
        for (int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            Node nowNode = pq.poll();
            int now = nowNode.idx;
            int weight = nowNode.weight;
            if(dist[now] < weight) continue;
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
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;
        int T = Integer.parseInt(in.readLine());
        for (int T1 = 0; T1 < T; T1++) {
            st = new StringTokenizer(in.readLine(), " ");
            //교차로 개수
            int n = Integer.parseInt(st.nextToken());
            //도로 개수
            int m = Integer.parseInt(st.nextToken());
            //목적지 후보 개수
            int t = Integer.parseInt(st.nextToken());
            adjList = new List[n + 1];
            for (int i = 0; i <= n; i++) {
                adjList[i] = new ArrayList<>();
            }

            st = new StringTokenizer(in.readLine(), " ");
            //출발지
            int s = Integer.parseInt(st.nextToken());
            //지났던 도로의 점1
            int g = Integer.parseInt(st.nextToken());
            //지났던 도로의 점2
            int h = Integer.parseInt(st.nextToken());

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(in.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                adjList[a].add(new Node(b, d));
                adjList[b].add(new Node(a, d));
            }
            printGraph(n);
            dijkstra(s);
            printDist(n);
//            printTrack(s, n);

            int destCandi[] = new int[t];
            for (int k = 0; k < t; k++) {
                destCandi[k] = Integer.parseInt(in.readLine());
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
