package Thu_boj_2810;

import java.io.*;

public class boj_2810_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter out = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        String str = in.readLine();
        int lCnt = 0, sCnt = 0;
        int cupHolderCnt = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); ++i) {
            if (i == 0) {
                ++cupHolderCnt;
            }
            if (str.charAt(i) == 'S') {
                ++sCnt;
                ++cupHolderCnt;
            }
            else{
                ++lCnt;
                flag = true;
            }

            if (flag && lCnt % 2 == 0) {
                flag = false;
                ++cupHolderCnt;
            }
        }
        if (cupHolderCnt < N) {
            ans.append(cupHolderCnt);
        }
        else{
            ans.append(N);
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
