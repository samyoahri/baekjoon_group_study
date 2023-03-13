package Free;

import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;

public class boj_10819_samyoahri {
    static int max = Integer.MIN_VALUE;
    static void dfs(int depth) {
        int sum = 0;
        //Base Condition(중단조건)
        if (depth == N) {
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(sst[i] - sst[i + 1]);
            }
            if(max < sum){
                max = sum;
            }
            return;
        }
        //dfs문
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sst[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
    static int N;
    static int[] arr;
    static int[] sst;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        arr = new int[N];
        sst = new int[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
//        for (int integer : arr) {
//            System.out.print(integer + " ");
//        }
        dfs(0);
        ans.append(max);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
