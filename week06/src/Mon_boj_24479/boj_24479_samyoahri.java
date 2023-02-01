package Mon_boj_24479;

import java.io.*;
import java.util.*;

public class boj_24479_samyoahri {
    //priority queue
    static int idx = 0;
    static int[] result;
    public static boolean[] visited;
    public static void dfs(List<PriorityQueue<Integer>> graph, int curr) {
        //방문표시
        visited[curr] = true;
        result[curr] = ++idx;
        int len = graph.get(curr).size();
        for (int i = 0; i < len; i++) {
            int next = graph.get(curr).poll();
            if(!visited[next]) dfs(graph, next);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //정점의 수
        int N = Integer.parseInt(st.nextToken());
        //간선의 수
        int M = Integer.parseInt(st.nextToken());
        //시작정점
        int R = Integer.parseInt(st.nextToken());

        List<PriorityQueue<Integer>> graph = new ArrayList<PriorityQueue<Integer>>();
        visited = new boolean[N + 1];
        result = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new PriorityQueue<>());
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).offer(v);
            graph.get(v).offer(u);
        }

        dfs(graph, R);
        for (int i = 1; i <= N; i++) {
            ans.append(result[i] + "\n");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
//    static int N;//정점의수
//    static int M;//간선의수
//    static int R;//시작점
//    static ArrayList<ArrayList<Integer>> graph;
//
//    public static void graphInit(){
//        for (int i = 0; i <= N; i++) {
//            graph.add(new ArrayList<Integer>());
//        }
//    }
//
//    static boolean visited[];
//    static int result[];
//    static int idx = 0;
//    public static void dfs(int curr) {
//        //현재노드 방문처리
//        visited[curr] = true;
//        result[curr] = ++idx;
//        for (int i = 0; i < graph.get(curr).size(); i++) {
//            int next = graph.get(curr).get(i);
////            System.out.println("x = " + x + " -> " + y);
//            if(!visited[next]) dfs(next);
//        }
//    }
//    public void printGraph(){
//        for (int i = 1; i <= N; i++) {
//            System.out.print(i+": ");
//            for (int integer : graph.get(i)) {
//                System.out.print(integer+ " ");
//            }
//            System.out.println();
//        }
//    }
////    static StringBuilder ans;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        //정점의 수
//        N = Integer.parseInt(st.nextToken());
//        //간선의 수
//        M = Integer.parseInt(st.nextToken());
//        //시작정점
//        R = Integer.parseInt(st.nextToken());
//
//        graph = new ArrayList<ArrayList<Integer>>();
//        visited = new boolean[N + 1];
//        result = new int[N + 1];
//        Arrays.fill(visited, false);
//
//        graphInit();
//
//        //inputGraph();
//        for (int i = 1; i <= M; i++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            int u = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            graph.get(u).add(v);
//            graph.get(v).add(u);
//        }
//
//        for (int i = 1; i <= N; i++) {
//            Collections.sort(graph.get(i));
//        }
//
//        //printGraph()
//
//        //dfs
//        dfs(R);
//        for (int i = 1; i <= N; i++) {
//            ans.append(result[i] + "\n");
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
