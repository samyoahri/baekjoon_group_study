package Free;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_10817_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[3];
        arr[0] = A;
        arr[1] = B;
        arr[2] = C;
        Arrays.sort(arr);
        ans.append(arr[1]);
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
