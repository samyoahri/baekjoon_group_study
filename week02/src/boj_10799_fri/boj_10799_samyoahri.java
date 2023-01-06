package boj_10799_fri;

import java.io.*;
import java.util.Stack;

public class boj_10799_samyoahri {
    //조금 더 효율적인 코드
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        int tot = 0;

        String str = in.readLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //push하는 경우
            if(ch=='('){
                stack.push('(');
            }
            //pop하는 경우
            else if (ch == ')') {
                char prev = str.charAt(i - 1);
                //레이저인 경우
                if(prev=='('){
                    stack.pop();
                    tot += stack.size();
                }
                //막대기인 경우
                else if(prev==')'){
                    stack.pop();
                    tot++;
                }
                else{
                    out.write("Error 이전입력에러");
                    out.flush();
                }
            }
            else{
                out.write("Error 입력에러");
                out.flush();
            }
        }
        String res = Integer.toString(tot);
        out.write(res);
        out.flush();

        in.close();
        out.close();

    }
    //조금 안좋은 코드
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Stack<Character> stick = new Stack<>();
//        Stack<Character> tmp = new Stack<>();
//
//        String str = in.readLine();
//
//        int rootStick = 0;
//        int total = 0;
//        for(int i = 0; i <str.length(); i++){
//            char ch = str.charAt(i);
//            //push하는 경우
//            if(ch=='('){
//                if(!tmp.isEmpty() && tmp.peek()=='('){
//                    stick.push(tmp.pop());
//                    {
//                        rootStick++;
//                        total++;
//                    }
//                    tmp.push(ch);
//                }
//                else{
//                    tmp.push(ch);
//                }
//            }
//            //pop 하는 경우
//            else if(ch==')'){
//                //레이저인 경우
//                if(!tmp.isEmpty() && tmp.peek()=='('){
//                    tmp.pop();
//                    total += rootStick;
//                }
//                //철제스틱이 끝나는 경우
//                else if(tmp.isEmpty()){
//                    stick.pop();
//                    {
//                        rootStick--;
////                        total++;
//                    }
//                }
//            }
//            else{
//                out.write("Error 잘못된 입력을 넣었습니다.");
//                out.flush();
//            }
//        }
//        String res = Integer.toString(total);
//        out.write(res);
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
