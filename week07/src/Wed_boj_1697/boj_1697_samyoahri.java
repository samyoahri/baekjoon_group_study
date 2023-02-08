package Wed_boj_1697;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1697_samyoahri {
    static int[] visited;

    static int dfs(int start, int end) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        int idx = start;
        visited[idx] = 1;

        int now;
        while (!queue.isEmpty()) {
            now = queue.poll();
            if (now == end) {
                return visited[now] - 1;
            }
            for (int i = 1; i <= 3; i++) {
                if (i == 1) {
                    if (now - 1 >= 0 && visited[now - 1] == 0) {
                        visited[now - 1] = visited[now] + 1;
                        queue.add(now - 1);
                    }
                } else if (i == 2) {
                    if (now + 1 <= 100000 && visited[now + 1] == 0) {
                        visited[now + 1] = visited[now] + 1;
                        queue.add(now + 1);
                    }
                } else if (i == 3) {
                    if (2 * now <= 100000 && visited[now*2] == 0) {
                        visited[2*now] = visited[now] + 1;
                        queue.add(now * 2);
                    }
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
        //수빈이 현재 위치
        int N = Integer.parseInt(st.nextToken());
        //동생이 있는 위치
        int K = Integer.parseInt(st.nextToken());
        visited = new int[100001];

        int result = dfs(N, K);
        ans.append(result);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
