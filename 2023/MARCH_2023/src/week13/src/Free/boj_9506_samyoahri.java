package Free;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class boj_9506_samyoahri {
    static int sumList(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N;
        while ((N = Integer.parseInt(in.readLine()) ) != -1) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    list.add(i);
                }
            }
            int sum = sumList(list);
            if (sum == N) {
                ans.append(N + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        ans.append(list.get(i)+"\n");
                    }
                    else{
                        ans.append(list.get(i) + " + ");
                    }
                }
            }
            else{
                ans.append(N + " is NOT perfect.\n");
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
