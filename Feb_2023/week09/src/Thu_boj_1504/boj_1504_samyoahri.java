package Thu_boj_1504;
import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
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
public class boj_1504_samyoahri {
    static void printGraph(int N){
        for (int i = 1; i <= N; i++) {
            System.out.println("[i = " + i + "]");
            for (int j = 0; j < adjList[i].size(); j++) {
                System.out.println("v"+ i + " -> " + "v" + adjList[i].get(j).idx+ ": " + adjList[i].get(j).weight);
            }
        }
    }
    static void printDist(int N, int[] dist) {
        System.out.println("=====printDist()=====");
        for (int i = 1; i <= N; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    static int dijkstra(int start, int end) {
        Arrays.fill(dist, INF);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            Node nowNode = pq.poll();
            int now = nowNode.idx;
            int weight = nowNode.weight;
            if(dist[now] < weight)  continue;
            for (int j = 0; j < adjList[now].size(); j++) {
                int cost = dist[now] + adjList[now].get(j).weight;
                int next = adjList[now].get(j).idx;
                if (cost < dist[next]) {
                    Node nextNode = new Node(next, cost);
                    pq.offer(nextNode);
                    dist[next] = cost;
                }
            }
        }
        return dist[end];
    }
    static List<Node> adjList[];
    static int[] dist;
    static int INF = 500000000;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        adjList = new ArrayList[N + 1];
        dist = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<Node>();
            dist[i] = 1000000000;
        }
        for (int l = 1; l <= E; l++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adjList[u].add(new Node(v, w));
            adjList[v].add(new Node(u, w));
        }
//        printGraph(N);
        st = new StringTokenizer(in.readLine(), " ");
        int transfer1 = Integer.parseInt(st.nextToken());
        int transfer2 = Integer.parseInt(st.nextToken());
//        printDist(N, dist);
        int path1 = dijkstra(1, transfer1) + dijkstra(transfer1, transfer2) + dijkstra(transfer2, N);
        int path2 = dijkstra(1, transfer2) + dijkstra(transfer2, transfer1) + dijkstra(transfer1, N);


        if (path1 >= INF && path2 >= INF) {
            ans.append(-1);
        }
        else{
            if (path1 < path2) {
                ans.append(path1);
            }
            else{
                ans.append(path2);
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.StringTokenizer;
//
//class Node implements Comparable<Node>{
//    int idx;
//    int weight;
//
//    public Node(int idx, int weight) {
//        this.idx = idx;
//        this.weight = weight;
//    }
//
//    @Override
//    public int compareTo(Node other) {
//        if (this.weight < other.weight) {
//            return -1;
//        }
//        return 1;
//    }
//}
//public class boj_1504_samyoahri {
//    static void printGraph(int N){
//        for (int i = 1; i <= N; i++) {
//            System.out.println("[i = " + i + "]");
//            for (int j = 0; j < adjList[i].size(); j++) {
//                System.out.println("v"+ i + " -> " + "v" + adjList[i].get(j).idx+ ": " + adjList[i].get(j).weight);
//            }
//        }
//    }
//    static void printDist(int N, int[] dist) {
//        System.out.println("=====printDist()=====");
//        for (int i = 1; i <= N; i++) {
//            System.out.print(dist[i] + " ");
//        }
//        System.out.println();
//    }
//    static List<Node>[] adjList;
////    static int[] dist;
////    static int[] dist1;
////    static int[] dist2;
//
//    static void dijkstra(int start, int[] dist) {
//        PriorityQueue<Node> pq = new PriorityQueue<>();
//        pq.offer(new Node(start, 0));
//        dist[start] = 0;
//        while (!pq.isEmpty()) {
//            Node nowNode = pq.poll();
//            int now = nowNode.idx;
//            int weight = nowNode.weight;
//            if(dist[now] < weight)  continue;
//            for (int j = 0; j < adjList[now].size(); j++) {
//                int cost = dist[now] + adjList[now].get(j).weight;
//                int next = adjList[now].get(j).idx;
//                if (cost < dist[next]) {
//                    Node nextNode = new Node(next, cost);
//                    pq.offer(nextNode);
//                    dist[next] = cost;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//        int E = Integer.parseInt(st.nextToken());
//        adjList = new ArrayList[N + 1];
//        int[] dist = new int[N + 1];
//        int[] dist1 = new int[N + 1];
//        int[] dist2 = new int[N + 1];
//        for (int i = 1; i <= N; i++) {
//            adjList[i] = new ArrayList<Node>();
////            dist[i] = Integer.MAX_VALUE;
////            dist1[i] = Integer.MAX_VALUE;
////            dist2[i] = Integer.MAX_VALUE;
//            dist[i] = 1000000000;
//            dist1[i] = 1000000000;
//            dist2[i] = 1000000000;
//        }
//        for (int l = 1; l <= E; l++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            int u = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            int w = Integer.parseInt(st.nextToken());
//            adjList[u].add(new Node(v, w));
//            adjList[v].add(new Node(u, w));
//        }
//        printGraph(N);
//        st = new StringTokenizer(in.readLine(), " ");
//        int transfer1 = Integer.parseInt(st.nextToken());
//        int transfer2 = Integer.parseInt(st.nextToken());
//        dijkstra(1, dist);
//        dijkstra(transfer1, dist1);
//        dijkstra(transfer2, dist2);
////        dist1[transfer1] = dist[transfer1];
////        dist2[transfer2] = dist[transfer2];
//        printDist(N, dist);
//        printDist(N, dist1);
//        printDist(N, dist2);
//        int path1 = dist[transfer1] + dist1[transfer2] + dist2[N];
//        int path2 = dist[transfer2] + dist2[transfer1] + dist1[N];
//        if (path1 > 1000000000 && path2 > 1000000000) {
//            ans.append(-1);
//        }
//        else{
//            if (path1 < path2) {
//                ans.append(path1);
//            }
//            else{
//                ans.append(path2);
//            }
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
