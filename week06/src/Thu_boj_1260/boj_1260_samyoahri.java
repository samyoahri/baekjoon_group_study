/*StringBuilder,Bufferedwriter와 system.out.print의 차이*/
package Thu_boj_1260;

import java.io.*;
import java.util.*;

public class boj_1260_samyoahri {
    static boolean visited[];
    public static StringBuilder ans;
    static int idx = 0;
    static void bfs(List<ArrayList<Integer>> graph, int start){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            ans.append(x + " ");
//            System.out.print(x+" ");
            int len = graph.get(x).size();
            for (int i = 0; i < len; i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
    static void dfs(List<ArrayList<Integer>> graph, int curr) {
        visited[curr] = true;
        ans.append(curr + " ");
//        System.out.print(curr + " ");
        int len = graph.get(curr).size();
        for (int i = 0; i < len; i++) {
            int next = graph.get(curr).get(i);
            if(!visited[next]) dfs(graph, next);
        }
    }
    //왜 안되지???
//    static void dfs(List<PriorityQueue<Integer>> graph, int curr) {
//        visited[curr] = true;
//        ans.append(++idx + " ");
//        System.out.println("curr = " + curr);
//        int len = graph.get(curr).size();
//        for (int i = 0; i < len; i++) {
//            int next = graph.get(curr).poll();
//            if(!visited[next]) dfs(graph, next);
//        }
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        ans = new StringBuilder();
//        ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //정점의 개수
        int N = Integer.parseInt(st.nextToken());
        //간선의 개수
        int M = Integer.parseInt(st.nextToken());
        //시작정점
        int R = Integer.parseInt(st.nextToken());

        List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        visited = new boolean[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
//        for (ArrayList<Integer> edges : graph) {
//            System.out.println("edges = " + edges);
//        }

        dfs(graph, R);

        Arrays.fill(visited, false);
        ans.append("\n");

        bfs(graph, R);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}


////맞은 코드
//import java.io.*;
//import java.util.*;
////맞은 코드
//public class Main {
//    static boolean visited[];
//    static int result[];
//    static StringBuilder ans;
//    static void bfs(List<ArrayList<Integer>> graph, int start){
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(start);
//        visited[start] = true;
//        while (!queue.isEmpty()) {
//            int x = queue.poll();
//            System.out.print(x+" ");
//            int len = graph.get(x).size();
//            for (int i = 0; i < len; i++) {
//                int y = graph.get(x).get(i);
//                if (!visited[y]) {
//                    queue.offer(y);
//                    visited[y] = true;
//                }
//            }
//        }
//    }
//    static void dfs(List<ArrayList<Integer>> graph, int curr) {
//        visited[curr] = true;
//        System.out.print(curr + " ");
//        int len = graph.get(curr).size();
//        for (int i = 0; i < len; i++) {
//            int next = graph.get(curr).get(i);
//            if(!visited[next]) dfs(graph, next);
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        //정점의 개수
//        int N = Integer.parseInt(st.nextToken());
//        //간선의 개수
//        int M = Integer.parseInt(st.nextToken());
//        //시작정점
//        int R = Integer.parseInt(st.nextToken());
//
//        List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
//        visited = new boolean[N + 1];
//        for (int i = 0; i <= N; i++) {
//            graph.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < M; i++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            int u = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            graph.get(u).add(v);
//            graph.get(v).add(u);
//        }
//        for (int i = 1; i <= N; i++) {
//            Collections.sort(graph.get(i));
//        }
//        result = new int[N + 1];
//        dfs(graph, R);
//
//        Arrays.fill(visited, false);
//
//        System.out.println();
//        bfs(graph, R);
//
//
//        in.close();
//        out.close();
//    }
//}

