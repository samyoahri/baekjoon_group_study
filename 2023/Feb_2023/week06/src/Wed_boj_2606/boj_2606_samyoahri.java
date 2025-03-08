package Wed_boj_2606;

import java.io.*;
import java.util.*;

public class boj_2606_samyoahri {
    //bfs
    static boolean[] visited;
    static int cnt = -1;
    static void bfs(List<ArrayList<Integer>> graph, int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        //현재노드 방문처리
        visited[start] = true;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            cnt++;
            //해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(!visited[y]){
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        //컴퓨터의 수
        int N = Integer.parseInt(in.readLine());
        //연결된 컴퓨터 쌍의 수
        int M = Integer.parseInt(in.readLine());

        List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        visited = new boolean[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
//        for (ArrayList<Integer> arrayList : graph) {
//            System.out.println("graph:" + arrayList);
//        }

        bfs(graph, 1);
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
    //dfs
//    static int cnt = -1;
//    static boolean visited[];
//
//    static void dfs(List<ArrayList<Integer>> graph, int curr) {
//        visited[curr] = true;
//        cnt++;
//        int len = graph.get(curr).size();
//        for (int i = 0; i < len; i++) {
//            int next = graph.get(curr).get(i);
//            if(!visited[next]) dfs(graph, next);
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        //컴퓨터의 수
//        int N = Integer.parseInt(in.readLine());
//        //연결된 컴퓨터 쌍의 수
//        int M = Integer.parseInt(in.readLine());
//
//        List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
//        visited = new boolean[N + 1];
//        for (int i = 0; i <= N; i++) {
//            graph.add(new ArrayList<Integer>());
//        }
//
//        StringTokenizer st;
//        for (int i = 1; i <= M; i++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            int u = Integer.parseInt(st.nextToken());
//            int v = Integer.parseInt(st.nextToken());
//            graph.get(u).add(v);
//            graph.get(v).add(u);
//        }
////        for (int i = 0; i <= N; i++) {
////            System.out.println("graph.get("+i+") = " + graph.get(i));
////        }
//        dfs(graph, 1);
//        ans.append(cnt);
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
