package Sun_boj_2785;

import java.io.*;
import java.util.*;

public class boj_2785_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        ArrayList<Integer> chains = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            chains.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(chains);
        int j = 0, cnt = 0;
        while (true) {
            int startIdx = 0;
            if (chains.size() <= 1) {
                break;
            }
            chains.set(startIdx, chains.get(startIdx) - 1);
            int endIdx = chains.size() - 1;
            chains.remove(endIdx);
            if (chains.get(startIdx) == 0) {
                chains.remove(startIdx);
            }
            ++cnt;
        }
        ans.append(cnt);


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
