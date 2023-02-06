package Mon_boj_24480;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_24480_samyoahri {
    static int N;
    static int M;
    static int R;
//    static int[][] graph;
    static ArrayList<ArrayList<Integer>> graph;
//    static boolean[][] visited;
    static boolean[] visited;

    static void dfs(int start) {
        visited[start] = true;
        res[start] = ++idx;
        int len = graph.get(start).size();
        for (int i = 0; i < len; i++) {
            int next = graph.get(start).get(i);
            if(!visited[next]) dfs(next);
        }
    }
//    static void dfs(int i, int j) {
//        visited[i][j] = true;
//        if(res[i]!=0)
//            res[i] = ++idx;
//
//        for (int k = 1; k <= N; k++) {
//            int nextI = graph[i][j];
////            int nextJ = 1;
//            if (!visited[nextI][k])
//                dfs(nextI, k);
//        }
//    }
    static int idx = 0;
    static int[] res;
    static StringBuilder ans;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //정점의수
        N = Integer.parseInt(st.nextToken());
        //간선의수
        M = Integer.parseInt(st.nextToken());
        //시작정점
        R = Integer.parseInt(st.nextToken());

//        graph = new int[N + 1][N + 1];
        res = new int[N + 1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }
//        visited = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
//            graph[u][v] = v;
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
//        for (int[] arr : graph) {
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i]+ " ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        dfs(R);
//        dfs(R, 1);

        for (int i = 1; i <= N; i++) {
            ans.append(res[i] + "\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
