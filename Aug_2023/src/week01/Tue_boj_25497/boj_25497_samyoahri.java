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
        Stack<Character> stack_LR = new Stack<>();
        Stack<Character> stack_SK = new Stack<>();
        for (int i = 0; i < N; ++i) {
            char ch = str.charAt(i);
            if (ch == 'L') {
                stack_LR.push(ch);
            } else if (ch == 'S') {
                stack_SK.push(ch);
            } else if (ch == 'R') {
                if (!stack_LR.isEmpty() && stack_LR.peek() == 'L') {
                    stack_LR.pop();
                    ++cnt;
                }
                else{
                    break;
                }
            } else if (ch == 'K') {
                if (!stack_SK.isEmpty() && stack_SK.peek() == 'S') {
                    stack_SK.pop();
                    ++cnt;
                }
                else{
                    break;
                }
            } else{
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
