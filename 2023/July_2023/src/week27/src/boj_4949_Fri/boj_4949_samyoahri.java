package boj_4949_Fri;

import java.io.*;
import java.util.Stack;

public class boj_4949_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        while(true){
//            boolean flag = false;
            String str = in.readLine();
            if (str.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); ++i) {
                char ch = str.charAt(i);
                if (ch == '[' || ch == '(') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if(stack.isEmpty()) {
                        stack.push('E');
                        break;
                    } else{
                        if (stack.peek() == '(' && ch == ')') {
                            stack.pop();
                        }
                        else if (stack.peek() == '[' && ch == ']') {
                            stack.pop();
                        }
                        else if (stack.peek() == '(' && ch == ']') {
                            stack.push('E');
                            break;
                        }
                        else if (stack.peek() == '[' && ch == ')') {
                            stack.push('E');
                            break;
                        }
                    }
                } else{
                    continue;
                }
            }
            if (!stack.isEmpty()) {
                ans.append("no\n");
            } else{
                ans.append("yes\n");
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}


