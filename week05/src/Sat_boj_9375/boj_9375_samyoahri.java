package Sat_boj_9375;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj_9375_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;

        int T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(in.readLine());
            HashMap<String, Integer> closet = new HashMap<>();

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(in.readLine(), " ");
                String goods = st.nextToken();
                String category = st.nextToken();
                if (!closet.containsKey(category)) {
                    closet.put(category, 1);
                }
                else{
                    int num = closet.get(category);
                    closet.replace(category, ++num);
                }
            }
            int cnt = 1;
            for (String key : closet.keySet()) {
                cnt *= (closet.get(key)+1);
            }
            ans.append(--cnt + "\n");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
