package boj_9012_mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_9012_samyoahri {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(in.readLine());
        for(int i = 0; i < T; i++){
            Stack<Character> stack = new Stack<>();
            String str = in.readLine();
            boolean judge = true;
            for(int j = 0; j < str.length(); j++){
                // '(' 문자가 주어진다면
                if(str.charAt(j)=='('){
                    stack.push(str.charAt(j));
                }
                // ')' 문자가 주어진다면
                else if(str.charAt(j)==')'){
                    //스택에 '('이 들어가있지 않음 or 스택이 비어있다면
                    if(stack.isEmpty()||stack.peek()!='('){
                        judge = false;
                        break;
                    }
                    //스택에 '('이 들어가 있음 and 스택이 비어있지않다면
                    else{
                        stack.pop();
                    }
//                    if(stack.peek()=='('){
//                        stack.pop();
//                    }
                }
                //'('이나 ')'가 주어지지 않는다면
                else{
                    continue;
                }
            }
            if(!stack.isEmpty())    judge = false;
            if(judge==true)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
