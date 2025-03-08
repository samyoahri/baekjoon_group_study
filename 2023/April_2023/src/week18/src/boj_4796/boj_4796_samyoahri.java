package boj_4796;

import java.io.*;
import java.util.StringTokenizer;

public class boj_4796_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int i = 0;
        while(true){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if (L == 0 && P == 0 && V == 0) {
                break;
            }
            int q = V / P;
            int r = V % P;
            int maxDay;
            if (r < L) {
                maxDay = L * q + r;
            }
            else{
                maxDay = L * q + L;
            }
            ans.append("Case "+(++i)+": "+maxDay+"\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
