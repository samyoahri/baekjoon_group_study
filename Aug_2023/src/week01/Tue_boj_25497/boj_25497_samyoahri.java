package week01.Tue_boj_25497;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_25497_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        String str = in.readLine();
        int cnt = 0;
//        Stack<Character> stack_LR = new Stack<>();
//        Stack<Character> stack_SK = new Stack<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < N; ++i) {
            char ch = str.charAt(i);
            if (ch == 'S' || ch=='L') {
                stack.push(ch);
            } else if (ch == 'K') {
                if (!stack.isEmpty() && stack.peek() == 'S') {
                    stack.pop();
                    ++cnt;
                }
                else{
                    stack.clear();
                }
            } else if (ch == 'R') {
                if (!stack.isEmpty() && stack.peek() == 'L') {
                    stack.pop();
                    ++cnt;
                }
                else{
                    stack.clear();
                }
            } else {
                ++cnt;
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
