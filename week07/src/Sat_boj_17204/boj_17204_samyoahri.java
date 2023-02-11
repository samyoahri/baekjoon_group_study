package Sat_boj_17204;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_17204_samyoahri {
    static int findBosung(int[] arr, int k) {
        int len = arr.length;
        int cnt = 0;
        int i = 0;
        while (len-- > 0) {
            int idx = arr[i];
            if (arr[i] == k) {
                return cnt+1;
            }
            i = idx;
            cnt++;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //참여하는 사람의 수
        int N = Integer.parseInt(st.nextToken());
        //보성이의 번호
        int K = Integer.parseInt(st.nextToken());

//        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        int res = findBosung(arr, K);
        ans.append(res);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
