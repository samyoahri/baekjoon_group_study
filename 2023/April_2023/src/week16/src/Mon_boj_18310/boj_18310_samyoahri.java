package Mon_boj_18310;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_18310_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        ArrayList<Integer> houses = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            houses.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(houses);
        int midIdx = 0;
        if (N % 2 != 0) {
            midIdx = N / 2 + 1;
        }
        else{
            midIdx = N / 2;
        }
        //houses는 0부터 시작하므로 1을 빼줘야함
        ans.append(houses.get(--midIdx));
//        System.out.println("mid = " + midIdx);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
