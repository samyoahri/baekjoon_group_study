package Sat_boj_17219;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj_17219_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //저장된 사이트의 주소수
        int N = Integer.parseInt(st.nextToken());
        //찾으려는 사이트의 주소수
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> information = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            String url = st.nextToken();
            String pw = st.nextToken();
            information.put(url, pw);
        }
        for (int i = 0; i < M; i++) {
            String wantedUrl = in.readLine();
            ans.append(information.get(wantedUrl) + "\n");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
