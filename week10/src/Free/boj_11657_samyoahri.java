package Free;

import java.io.*;
import java.util.*;

public class boj_11657_samyoahri {
    static int[] arr;

    static void reverse(int i, int j) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int k = i; k <= j; k++) {
            stack.push(arr[k]);
        }
//        int cnt = i - j + 1;
        int idx = i;
        while (!stack.isEmpty()) {
            arr[idx++] = stack.pop();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
        for (int l = 0; l <= N; l++) {
            arr[l] = l;
        }
        for (int l = 0; l < M; l++) {
            st = new StringTokenizer(in.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            reverse(i, j);
        }
        for (int i = 1; i <= N; i++) {
            ans.append(arr[i] + " ");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
