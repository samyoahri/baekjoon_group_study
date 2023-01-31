package Tue_boj_24444;

import java.io.*;
import java.util.*;

public class boj_24444_samyoahri {
    public static boolean[] visited;
    static int idx = 0;
    public static void bfs(List<ArrayList<Integer>> graph, int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int x = queue.poll();
//            ans.append(x + " ");
            result[x] = ++idx;
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
    static int[] result;
//    static StringBuilder ans;
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

//        List<PriorityQueue<Integer>> graph = new ArrayList<PriorityQueue<Integer>>();
        List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
//            graph.add(new PriorityQueue<Integer>(Collections.reverseOrder()));
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

//        for (ArrayList edge : graph) {
//            System.out.println("edge = " + edge);
//        }

        visited = new boolean[N + 1];
        result = new int[N + 1];
        bfs(graph, R);

        for (int i = 1; i <= N; i++) {
            ans.append(result[i] + "\n");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
