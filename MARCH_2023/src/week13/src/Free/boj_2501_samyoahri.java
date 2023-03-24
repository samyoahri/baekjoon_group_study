package Free;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class boj_2501_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String[] strings = in.readLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int K = Integer.parseInt(strings[1]);
        //약수의 배열
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arrayList.add(i);
            }
        }
        try {
            ans.append(arrayList.get(K - 1));
        } catch (Exception e) {
            ans.append("0");
        }


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
