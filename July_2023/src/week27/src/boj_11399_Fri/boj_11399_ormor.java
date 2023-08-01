package week27.src.boj_11399_Fri;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11399_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(in.readLine());
        int[] P = new int[N];

        st = new StringTokenizer(in.readLine());

        for(int i=0; i<N; i++){
            P[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(P);

        int sumP = 0;
        int ansP = 0;

        for(int i=0; i<N; i++){
            sumP = sumP + P[i];
            ansP = ansP + sumP;
        }

        ans.append(ansP);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
