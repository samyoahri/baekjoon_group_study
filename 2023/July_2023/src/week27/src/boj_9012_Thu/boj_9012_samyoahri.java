package boj_9012_Thu;

import java.io.*;
import java.util.Stack;

public class boj_9012_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; ++i) {
            String str = in.readLine();
            Stack<Character> stack = new Stack<Character>();
            for (int j = 0; j < str.length(); ++j) {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(j));
                }
                else if(stack.peek()=='(' && str.charAt(j) == ')'){
                    stack.pop();
                }
                else{
                    stack.push(str.charAt(j));
                }
            }
            if (stack.isEmpty()) {
                ans.append("YES\n");
            }
            else{
                ans.append("NO\n");
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
