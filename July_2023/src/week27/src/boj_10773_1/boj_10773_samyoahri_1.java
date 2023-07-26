package boj_10773_1;

import java.io.*;
import java.util.*;
public class boj_10773_samyoahri_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int K = Integer.parseInt(in.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; ++i) {
            int inputInteger = Integer.parseInt(in.readLine());
            if (inputInteger == 0) {
                stack.pop();
            }
            else{
                stack.push(inputInteger);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        ans.append(sum);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
