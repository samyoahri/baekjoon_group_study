package boj_4949_sun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class boj_4949_samyoahri {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while(true){
            str = in.readLine();
            if(str.equals("."))
                break;
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);

                //여는 괄호의 경우
                if(ch=='(' || ch=='['){
                    stack.push(ch);
                }
                else if(ch==')'){
                    if(!stack.isEmpty()&&stack.peek()=='('){
                        stack.pop();
                    }
                    else{
//                        System.out.println("no");
                        stack.push('E');
                        break;
                    }
                }
                else if(ch==']'){
                    if(!stack.isEmpty()&&stack.peek()=='['){
                        stack.pop();
                    }
                    else{
//                        System.out.println("no");
                        stack.push('E');
                        break;
                    }
                }
                else{
                    continue;
                }
            }
            if(stack.isEmpty()){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }

        //예외 케이스 존재: ')'을 입력시 실패
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        while(true){
//            str = in.readLine();
//            if(str.equals(".")){
//                break;
//            }
//            Stack<Character> stack = new Stack<>();
//
//            for(int i = 0; i < str.length(); i++){
//                char ch = str.charAt(i);
//                //여는 괄호일 경우
//                if(ch == '['||
//                    ch == '('){
//                    stack.push(ch);
//                }
//                if(stack.isEmpty())
//                    continue;
//                else{
//                    //닫는 대괄호
//                    if (ch == ']') {
//                        if (stack.peek() == '[') {
//                            stack.pop();
//                        }
//                    }
//                    else if (ch == ')') {
//                        if (stack.peek() == '(') {
//                            stack.pop();
//                        }
//                    }
//                }
//            }
//            if(stack.isEmpty()){
//                System.out.println("yes");
//            }
//            else{
//                System.out.println("no");
//            }
//        }
    }
}
