package Wed_boj_11657;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Edge{
    int vertex;
    int adjVertex;
    int weight;

    public Edge(int vertex, int adjVertex, int weight) {
        this.vertex = vertex;
        this.adjVertex = adjVertex;
        this.weight = weight;
    }
}
public class boj_11657_samyoahri {
    static void printGraph(int N) {
        System.out.println("==========printGraph()=========");
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= N; i++) {
            System.out.println("[i = " + i+"]");
            for (int j = 0; j < adjList[i].size(); j++) {
                System.out.println("v"+adjList[i].get(j).vertex + "->v" + adjList[i].get(j).adjVertex + ":" + adjList[i].get(j).weight);
            }
        }
    }
    static List<Edge> adjList[];
//    static int[][] matrix;

    static void BellmanFord(int start) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < adjList[i].size(); j++) {
                int from = i;
                int to = adjList[i].get(j).adjVertex;
                int weight = adjList[i].get(j).weight;
                if(dist[from]==INF) continue;
                int cost = weight + dist[from];
                if(dist[to] > cost){
                    if (i == N) {
                        ans.append(-1+"\n");
//                        System.out.println(-1);
                        return;
                    }
                    dist[to] = cost;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            ans.append((dist[i] == INF ? -1 : dist[i]) + "\n");
//            System.out.println((dist[i] == INF ? -1 : dist[i]));
        }
    }
    static int INF = 987654321;
    static int N;
    static int M;
    static StringBuilder ans;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
//        matrix = new int[N + 1][N + 1];
        adjList = new List[N + 1];
        for (int i = 0; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
//            matrix[u][v] = w;
            adjList[u].add(new Edge(u, v, w));
        }
//        printGraph(N);
        BellmanFord(1);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
