package Wed_boj_1417;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class boj_1417_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int min = 0;
        int N = Integer.parseInt(in.readLine());
        int DasomVote = Integer.parseInt(in.readLine());
        if (N > 1) {
            Integer candidates[] = new Integer[N-1];
            for (int i = 0; i < N-1; i++) {
                candidates[i] = Integer.parseInt(in.readLine());
            }
            Arrays.sort(candidates, Collections.reverseOrder());

            while(true){
                if (DasomVote > candidates[0])
                    break;
                --candidates[0];
                ++DasomVote;
                ++min;
                Arrays.sort(candidates, Collections.reverseOrder());
            }
        }
        ans.append(min);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
