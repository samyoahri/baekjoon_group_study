package Fri_boj_16928_gold;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class IdxAndCnt{
    int idx;
    int cnt;

    public IdxAndCnt(int idx, int cnt) {
        this.idx = idx;
        this.cnt = cnt;
    }
}
public class boj_16928_samyoahri {
    static int[] graph;
    static boolean[] visited;
    static int bfs(){
        Queue<IdxAndCnt> queue = new ArrayDeque<>();
        queue.offer(new IdxAndCnt(1, 0));
        visited[1] = true;
        while (!queue.isEmpty()) {
            IdxAndCnt now = queue.poll();
            int nowIdx = now.idx;
            int nowCnt = now.cnt;
            int nextIdx, nextCnt;
            if (nowIdx == 100) {
                return nowCnt;
            }
            for (int k = 1; k <= 6; k++) {
                nextIdx = nowIdx + k;
                nextCnt = nowCnt + 1;
                if (nextIdx <= 0 || nextIdx > 100) {
                    continue;
                }
                //주사위를 굴려 도착한칸에 사다리나 뱀이 있으면
                if (nextIdx != graph[nextIdx]) {
                    nextIdx = graph[nextIdx];
                }
                if (!visited[nextIdx]) {
                    queue.offer(new IdxAndCnt(nextIdx, nextCnt));
                    visited[nextIdx] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //사다리의 수
        int N = Integer.parseInt(st.nextToken());
        //뱀의수
        int M = Integer.parseInt(st.nextToken());
        graph = new int[101];
        visited = new boolean[101];
        for (int i = 1; i <= 100; i++) {
            graph[i] = i;
        }
        for (int i = 0; i < N+M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int idx = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());
            graph[idx] = next;
        }

        int cnt = bfs();
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
//
//4 1
//        25 99
//        5 40
//        46 77
//        83 98
//        66 65

//메모리 초과
//import java.io.*;
//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//class IdxAndCnt{
//    int idx;
//    int cnt;
//
//    public IdxAndCnt(int idx, int cnt) {
//        this.idx = idx;
//        this.cnt = cnt;
//    }
//}
//public class boj_16928_samyoahri {
//    static int[] graph;
//    static int bfs(){
//        Queue<IdxAndCnt> queue = new ArrayDeque<>();
//        queue.offer(new IdxAndCnt(1, 0));
//        while (!queue.isEmpty()) {
//            IdxAndCnt now = queue.poll();
//            int nowIdx = now.idx;
//            int nowCnt = now.cnt;
//            int nextIdx, nextCnt;
//            if (nowIdx == 100) {
//                return nowCnt;
//            }
//            for (int k = 1; k <= 6; k++) {
//                nextIdx = nowIdx + k;
//                nextCnt = nowCnt + 1;
//                if (nextIdx <= 0 || nextIdx > 100) {
//                    continue;
//                }
//                //주사위를 굴려 도착한칸에 사다리나 뱀이 있으면
//                if (nextIdx != graph[nextIdx]) {
//                    nextIdx = graph[nextIdx];
//                }
//                queue.offer(new IdxAndCnt(nextIdx, nextCnt));
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        //사다리의 수
//        int N = Integer.parseInt(st.nextToken());
//        //뱀의수
//        int M = Integer.parseInt(st.nextToken());
//        graph = new int[101];
//        for (int i = 1; i <= 100; i++) {
//            graph[i] = i;
//        }
//        for (int i = 0; i < N+M; i++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            int idx = Integer.parseInt(st.nextToken());
//            int next = Integer.parseInt(st.nextToken());
//            graph[idx] = next;
//        }
//
//        int cnt = bfs();
//        ans.append(cnt);
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
