package Sun_boj_1707_gold;

import java.io.*;
import java.util.*;

public class boj_1707_samyoahri {
    static int[] visited;
    static ArrayList<Integer>[] adjList;
    static void dfs(int now){

    }
    static boolean isBipartiteGraph(){

        return true;
    }
    static void printVisited(){
        System.out.println("==========printVisited()==========");
        for (int i = 1; i <= V; i++) {
            System.out.print(visited[i] + " ");
        }
    }
    static void printGraph(){
        System.out.println("==========printGraph()==========");
        for (int i = 1; i <= V; i++) {
            System.out.println("[ i = " + i + "]");
            for (int j = 0; j < adjList[i].size(); j++) {
                System.out.print(adjList[i].get(j) + " ");
            }
            System.out.println();
        }
    }
    static int V;
    static int E;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int K = Integer.parseInt(in.readLine());
        StringTokenizer st;
        while (K-- > 0) {
            st = new StringTokenizer(in.readLine(), " ");
            //정점의 개수
            V = Integer.parseInt(st.nextToken());
            //간선의 개수
            E = Integer.parseInt(st.nextToken());
            adjList = new ArrayList[V + 1];
            for (int i = 0; i <= V; i++) {
                adjList[i] = new ArrayList<>();
            }
            visited = new int[V + 1];
            while (E-- > 0) {
                st = new StringTokenizer(in.readLine(), " ");
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                adjList[u].add(v);
                adjList[v].add(u);
            }
//            printGraph();
            boolean chk = true;
            if (chk) {
                ans.append("YES\n");
            }
            else{
                ans.append("NO\n");
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }

}
//맞지만 내가푼 코드 아님
//public class boj_1707_samyoahri {
//    static int[] visited;
//    static ArrayList<Integer>[] adjList;
//    static void dfs(int now){
//        if (visited[now] == 0) {
//            visited[now] = 1;
//        }
//        for (int j = 0; j < adjList[now].size(); j++) {
//            int next = adjList[now].get(j);
//            if (visited[next] == 0) {
//                if (visited[now] == 1) {
//                    visited[next] = 2;
//                } else if (visited[now] == 2) {
//                    visited[next] = 1;
//                }
//                dfs(next);
//            }
//        }
//    }
//    static boolean isBipartiteGraph(){
//        for (int i = 1; i <= V; i++) {
//            int len = adjList[i].size();
//            int now = i;
//            for (int j = 0; j < len; j++) {
//                int next = adjList[i].get(j);
//                if (visited[now] == visited[next]) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//    static void printVisited(){
//        System.out.println("==========printVisited()==========");
//        for (int i = 1; i <= V; i++) {
//            System.out.print(visited[i] + " ");
//        }
//    }
//    static void printGraph(){
//        System.out.println("==========printGraph()==========");
//        for (int i = 1; i <= V; i++) {
//            System.out.println("[ i = " + i + "]");
//            for (int j = 0; j < adjList[i].size(); j++) {
//                System.out.print(adjList[i].get(j) + " ");
//            }
//            System.out.println();
//        }
//    }
//    static int V;
//    static int E;
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int K = Integer.parseInt(in.readLine());
//        StringTokenizer st;
//        while (K-- > 0) {
//            st = new StringTokenizer(in.readLine(), " ");
//            //정점의 개수
//            V = Integer.parseInt(st.nextToken());
//            //간선의 개수
//            E = Integer.parseInt(st.nextToken());
//            adjList = new ArrayList[V + 1];
//            for (int i = 0; i <= V; i++) {
//                adjList[i] = new ArrayList<>();
//            }
//            visited = new int[V + 1];
//            while (E-- > 0) {
//                st = new StringTokenizer(in.readLine(), " ");
//                int u = Integer.parseInt(st.nextToken());
//                int v = Integer.parseInt(st.nextToken());
//                adjList[u].add(v);
//                adjList[v].add(u);
//            }
////            printGraph();
//            for (int node = 1; node <= V; node++) {
//                if (visited[node] == 0) {
//                    dfs(node);
//                }
//            }
//            boolean chk = isBipartiteGraph();
//            if (chk) {
//                ans.append("YES\n");
//            }
//            else{
//                ans.append("NO\n");
//            }
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//
//}
//// /*메모리 초과 코드*/ //
//import java.io.*;
//import java.util.*;
//
//public class boj_1707_samyoahri {
//    static boolean[][] visited;
////    static ArrayList<ArrayList<Integer>> graph;
//    static ArrayList<Integer>[] graph;
//    static ArrayList<Integer> res;
//    static void printGraph(){
//        System.out.println("==========printGraph==========");
//        for (int i = 1; i <= VertexNum; i++) {
//            System.out.println("[ i = " + i + " ]");
//            for (int j = 0; j < graph[i].size(); j++) {
//                System.out.print(graph[i].get(j) + " ");
//            }
//            System.out.println();
//        }
//    }
////    static void printGraph(){
////        System.out.println("==========printGraph==========");
////        for (int i = 1; i <= VertexNum; i++) {
////            System.out.println("[ i = " + i + " ]");
////            for (int j = 0; j < graph.get(i).size(); j++) {
////                System.out.print(graph.get(i).get(j) + " ");
////            }
////            System.out.println();
////        }
////    }
//    static void printVisited(){
//        System.out.println("==========printVisited==========");
//        for (int i = 1; i <= VertexNum; i++) {
//            for (int j = 1; j <= VertexNum; j++) {
//                System.out.print(visited[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    static byte[] visitedVertex;
//    static boolean dfs(){
////        System.out.println("==========dfs()==========");
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        visitedVertex[1] = 1;
//        while (!stack.isEmpty()) {
//            int i = stack.pop();
//            for (int l = 0; l < graph[i].size(); l++) {
//                int j = graph[i].get(l);
//                if (!visited[i][j]) {
//                    visited[i][j] = true;
//                    visited[j][i] = true;
//                    visitedVertex[j] += 1;
//                    stack.push(j);
////                    System.out.println("i: " + i + ",  j: " + j + " ");
//                }
//                if (visitedVertex[j] >= 2) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
////    static boolean dfs(){
//////        System.out.println("==========dfs()==========");
////        Stack<Integer> stack = new Stack<>();
////        stack.push(1);
////        visitedVertex[1] = 1;
////        while (!stack.isEmpty()) {
////            int i = stack.pop();
////            for (int l = 0; l < graph.get(i).size(); l++) {
////                int j = graph.get(i).get(l);
////                if (!visited[i][j]) {
////                    visited[i][j] = true;
////                    visited[j][i] = true;
////                    visitedVertex[j] += 1;
////                    stack.push(j);
//////                    System.out.println("i: " + i + ",  j: " + j + " ");
////                }
////                if (visitedVertex[j] >= 2) {
////                    return false;
////                }
////            }
////        }
////        return true;
////    }
//    static int VertexNum;
//    static int EdgeNum;
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int T = Integer.parseInt(in.readLine());
//        StringTokenizer st;
//        for (int t = 0; t < T; t++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            VertexNum = Integer.parseInt(st.nextToken());
////            graph = new ArrayList<>();
//            graph = new ArrayList[VertexNum + 1];
//            for (int i = 0; i <= VertexNum; i++) {
////                graph.add(new ArrayList<>());
//                graph[i] = new ArrayList<>();
//            }
//            visited = new boolean[VertexNum + 1][VertexNum + 1];
//            EdgeNum = Integer.parseInt(st.nextToken());
////            res = new ArrayList<>();
//
//            visitedVertex = new byte[VertexNum + 1];
//            for (int i = 1; i <= EdgeNum; i++) {
//                st = new StringTokenizer(in.readLine(), " ");
//                int u = Integer.parseInt(st.nextToken());
//                int v = Integer.parseInt(st.nextToken());
////                graph.get(u).add(v);
////                graph.get(v).add(u);
//                graph[u].add(v);
//                graph[v].add(u);
//            }
//            boolean checkBipartiteGraph = true;
//            checkBipartiteGraph = dfs();
////            printGraph();
////            printVisited();
//            if (checkBipartiteGraph) {
//                ans.append("YES\n");
//            }
//            else{
//                ans.append("NO\n");
//            }
//        }
//
//
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
////// /*iter 코드 && 메모리 초과 코드*/
////import java.io.*;
////import java.util.*;
////
////class MatCoordinate{
////    int i;
////    int j;
////
////    public MatCoordinate(int i, int j) {
////        this.i = i;
////        this.j = j;
////    }
////}
////public class boj_1707_samyoahri {
////    static ArrayList<Integer> res;
////    static boolean[][] visited;
//////    static ArrayList<ArrayList<Integer>> graph;
////    static int[][] graph;
//////    static void printGraph(){
//////        System.out.println("------------");
//////        for (int i = 1; i <= VertexNum; i++) {
//////            System.out.println("[i = " + i + "]");
//////            int len = graph.get(i).size();
//////            for (int j = 0; j < len; j++) {
//////                System.out.print(graph.get(i).get(j) + " ");
//////            }
//////            System.out.println();
//////        }
//////        System.out.println("------------");
//////    }
////    static void printGraph(){
////        System.out.println("------------");
////        for (int i = 1; i <= VertexNum; i++) {
////            for (int j = 1; j <=  VertexNum; j++) {
////                System.out.print(graph[i][j] + " ");
////            }
////            System.out.println();
////        }
////        System.out.println("------------");
////    }
////    static void printVisited(){
////        System.out.println("------------");
////        for (int i = 1; i <= VertexNum; i++) {
////            for (int j = 1; j <=  VertexNum; j++) {
////                System.out.print(visited[i][j] + " ");
////            }
////            System.out.println();
////        }
////        System.out.println("------------");
////    }
////    static boolean dfs(){
////        dfsIter(1, 1);
////        boolean check = false;
////        if (res.size() == VertexNum) {
////            check = true;
////        }
////        if (check) {
////            return true;
////        }
////        return false;
////    }
////    static boolean dfsIter(int i, int j) {
//////        boolean check = false;
////        Stack<MatCoordinate> stack = new Stack<>();
////        stack.push(new MatCoordinate(i, j));
////        visited[i][j] = true;
////        while (!stack.isEmpty()) {
////            MatCoordinate now = stack.pop();
////            int nowI = now.i, nowJ = now.j;
//////            System.out.print(nowJ + " -> ");
////            res.add(nowJ);
//////            System.out.print("[nowI = " + nowI + " ");
//////            System.out.println("nowJ = " + nowJ + "]");
////
////            int nextI = nowJ, nextJ;
////            for (int l = 1; l <= VertexNum; l++) {
////                nextJ = l;
////                if (!visited[nextI][nextJ] && graph[nextI][nextJ] == 1) {
////                    stack.push(new MatCoordinate(nextI, nextJ));
////                    visited[nextI][nextJ] = true;
////                    visited[nextJ][nextI] = true;
//////                    visited[nextJ][nextI] = true;
//////                    System.out.print("nextI = " + nextI + " ");
//////                    System.out.println("nextJ = " + nextJ);
////                }
//////                System.out.print("nowJ(nextI) = " + nextI + " ");
//////                System.out.println("l(nextJ) = " + nextJ);
////                visited[nextI][nextJ] = true;
////                visited[nextJ][nextI] = true;
////            }
////        }
////        return true;
////    }
////
//////    static boolean dfsIter(int start) {
//////        boolean check = false;
//////        Stack<Integer> stack = new Stack<>();
//////        stack.push(start);
//////        visited[start] = true;
//////        while (!stack.isEmpty()) {
//////            int now = stack.pop();
////////            if(check){
////////                return false;
////////            }
//////            System.out.print(now + " -> ");
//////            for (int j = 0; j < graph.get(now).size(); j++) {
//////                int next = graph.get(now).get(j);
//////                if (!visited[next]) {
//////                    stack.push(next);
//////                    visited[next] = true;
//////                }
//////                else{
//////
//////                }
//////
//////            }
//////        }
//////        return true;
//////    }
////    static int VertexNum;
////    static int EdgeNum;
////    public static void main(String[] args) throws IOException {
////        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
////        StringBuilder ans = new StringBuilder();
////
////        int T = Integer.parseInt(in.readLine());
////        StringTokenizer st;
////        for (int t = 0; t < T; t++) {
////            st = new StringTokenizer(in.readLine(), " ");
////            VertexNum = Integer.parseInt(st.nextToken());
//////            graph = new ArrayList<>();
//////            for (int i = 0; i <= VertexNum; i++) {
//////                graph.add(new ArrayList<Integer>());
//////            }
////            graph = new int[VertexNum + 1][VertexNum + 1];
////            visited = new boolean[VertexNum + 1][VertexNum + 1];
////            res = new ArrayList<>();
//////            for (ArrayList<Integer> arrayList : graph) {
//////                System.out.println(arrayList);
//////            }
////
////            EdgeNum = Integer.parseInt(st.nextToken());
////            for (int i = 1; i <= EdgeNum; i++) {
////                st = new StringTokenizer(in.readLine(), " ");
////                int u = Integer.parseInt(st.nextToken());
////                int v = Integer.parseInt(st.nextToken());
//////                graph.get(u).add(v);
//////                graph.get(v).add(u);
////                graph[u][v] = 1;
////                graph[v][u] = 1;
////            }
//////            for (int i = 1; i <= VertexNum; i++) {
//////                Collections.sort(graph.get(i));
//////            }
////            boolean checkBipartiteGraph = dfs();
////            printGraph();
////            printVisited();
////            if (checkBipartiteGraph) {
////                ans.append("YES\n");
////            }
////            else{
////                ans.append("NO\n");
////            }
////        }
////
////
////
////        out.write(ans.toString());
////        out.flush();
////
////        in.close();
////        out.close();
////    }
////}
//////adjacent matrix 코드
////import java.io.*;
////import java.util.*;
////
////
////public class boj_1707_samyoahri {
////    static int[][] graph;
////    static boolean[][] visited;
////    static void printGraph(){
////        System.out.println("--------");
////        for (int arr[] : graph) {
////            for (int integer : arr) {
////                System.out.print(integer + " ");
////            }
////            System.out.println();
////        }
////        System.out.println("--------");
////    }
////    static boolean dfs(){
////        Stack<Integer> stack = new Stack<>();
////        stack.push(1);
////        return true;
////    }
////    public static void main(String[] args) throws IOException {
////        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
////        StringBuilder ans = new StringBuilder();
////
////        int T = Integer.parseInt(in.readLine());
////        StringTokenizer st;
////        for (int t = 0; t < T; t++) {
////            st = new StringTokenizer(in.readLine(), " ");
////            int VertexNum = Integer.parseInt(st.nextToken());
////            graph = new int[VertexNum + 1][VertexNum + 1];
////            visited = new boolean[VertexNum + 1][VertexNum + 1];
////            for (int i = 0; i <= VertexNum; i++) {
////                if (i == 0) {
////                    for (int j = 0; j <= VertexNum; j++) {
////                        graph[i][j] = -1;
////                    }
////                }
////                else{
////                    graph[i][0] = -1;
////                }
////            }
////            int EdgeNum = Integer.parseInt(st.nextToken());
////            for (int l = 0; l < EdgeNum; l++) {
////                st = new StringTokenizer(in.readLine(), " ");
////                int u = Integer.parseInt(st.nextToken());
////                int v = Integer.parseInt(st.nextToken());
////
////                graph[u][v] = 1;
//////                graph[v][u] = 1;
////            }
////            printGraph();
////            boolean checkBipartiteGraph = dfs();
////            if (checkBipartiteGraph) {
////                ans.append("YES\n");
////            }
////            else{
////                ans.append("NO\n");
////            }
////        }
////
////
////
////        out.write(ans.toString());
////        out.flush();
////
////        in.close();
////        out.close();
////    }
////}