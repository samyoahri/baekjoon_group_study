package boj_1874_Sat;

import java.io.*;
import java.util.*;

public class boj_1874_samyoahri {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        int num = 0;
        boolean check = false;
        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(num);
        while (!stack.isEmpty() && idx < n) {
            if (stack.peek() == arr[idx]) {
                ++idx;
                stack.pop();
                ans.append("-\n");
            } else if (num > arr[idx]) {
                stack.pop();
                ans.append("-\n");
            } else {
                stack.push(++num);
                ans.append("+\n");
            }
        }
        if (stack.isEmpty()) {
            ans = new StringBuilder();
            ans.append("NO");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
