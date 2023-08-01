package week01.Mon_boj_17413;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class boj_17413_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String input = in.readLine();
//        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length(); ++i) {
            char ch = input.charAt(i);
//            System.out.println("ch = " + ch);
//            System.out.println("input.length() = " + input.length());
            //태크 체크
            if (ch == '<') {
                StringBuilder tmp = new StringBuilder();
                while(input.charAt(i)!='>'){
                    tmp.append(input.charAt(i++));
                }
                tmp.append('>');
                ans.append(tmp.toString());
//                System.out.println("tmp = " + tmp);
            } else if (ch == ' ') {
                ans.append(' ');
            }
            //문자열 체크
            else {
                Stack<Character> stack = new Stack<>();
                while (input.charAt(i) != '<' && input.charAt(i) != '>' && input.charAt(i) != ' ') {
//                    System.out.println("input.charAt(i) = " + input.charAt(i));
                    stack.push(input.charAt(i++));
                    if (i == input.length()) {
                        break;
                    }
                }
                while (!stack.isEmpty()) {
                    ans.append(stack.pop());
                }
                i--;
            }

        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
