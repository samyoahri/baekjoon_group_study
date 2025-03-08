package Free;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class boj_5568_samyoahri {
    static int N;
    static int K;
    static String[] card;
    static boolean[] visited;
    static String[] sst;
    static Set<Integer> set = new HashSet<>();
    static void dfs(int depth) {
        //중단조건
        if (depth == K) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < K; i++) {
                tmp.append(sst[i]);
            }
            set.add(Integer.parseInt(tmp.toString()));
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sst[depth] = card[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        N = Integer.parseInt(in.readLine());
        K = Integer.parseInt(in.readLine());
        card = new String[N];
        visited = new boolean[N];
        sst = new String[K];
        for (int i = 0; i < N; i++) {
            card[i] = in.readLine();
        }
        dfs(0);
        ans.append(set.size());

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
