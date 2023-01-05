package boj_1918_wed_gold;

import java.io.*;
import java.util.Stack;

public class boj_1918_samyoahri {
    static int prioritize(char c){
        //리턴하는 수가 클수록 우선순위가 높음
        //예를 들어 2를 우선순위로 가지면 0이나 1보다 높은 우선순위를 가짐
//        if(c==43 || c==45)
        if(c=='+'||c=='-')
            return 1;
//        else if(c==42 || c==47)
        else if(c=='*'||c=='/')
            return 2;
        else
            return 0;
    }
    static boolean isOpenParenthesis(char c){
        if(c=='(')
            return true;
        else
            return false;
    }
    static boolean isCloseParenthesis(char c){
        if(c==')')
            return true;
        else
            return false;
    }
    static boolean isOperand(char c){
//        if(c>=65 && c<=90)
        if(c>='A' && c<='z')
            return true;
        else
            return false;
    }
    static boolean isOperator(char c){
//        if(c==74 || c==75 || c==77 || c== 79)
        if(c=='+'||c=='-'||c=='*'||c=='/')
            return true;
        else
            return false;
    }
    static String infixToPostfix(String exp){
        Stack<Character> stack = new Stack<>();
        StringBuilder tmp = new StringBuilder();
        for(int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);
            //피연산자이면 스트링으로 복사
            if(isOperand(c)){
                tmp.append(c);
            }
            // ( 열림괄호이면
            else if(isOpenParenthesis(c)){
                stack.push(c);
            }
            // ) 닫힘괄호이면
            else if(isCloseParenthesis(c)){
                if(stack.isEmpty()){
                    System.out.println("CloseParenthesis Error");
                    break;
                }
                else{
                    //스택의 최상단이 열린괄호가 아닌동안 팝
                    while(!isOpenParenthesis(stack.peek())){
                        char stackC = stack.pop();
                        tmp.append(stackC);
                    }
                    // ( 열림괄호 제거
                    stack.pop();
                }

            }
            // 연산자이면
//            else if(isOperator(c)){
//                if(c=='*' || c=='/'){
//                    while(!stack.isEmpty() && (stack.peek()=='*'||stack.peek()=='/')){
//                        tmp.append(stack.pop());
//                    }
//                    stack.push(c);
//                }
//                else if(c=='+'||c=='-'){
//                    while(!stack.isEmpty() && (stack.peek()=='+'||stack.peek()=='-'||stack.peek()=='*'||stack.peek()=='/')){
//                        tmp.append(stack.pop());
//                    }
//                    stack.push(c);
//                }
//            }
            //연산자이면
            else if(isOperator(c)) {
                while(!stack.isEmpty()&&(prioritize(c)<=prioritize(stack.peek()))){
                    tmp.append(stack.pop());
                }
                stack.push(c);
            }
            else if (isOperator(c)) {
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else{
                    int cPrior = prioritize(c);
                    int stackPrior = prioritize(stack.peek());
                    while(cPrior<=stackPrior){
                        tmp.append(stack.pop());

                        if(stack.isEmpty())
                            break;
                        cPrior = prioritize(c);
                        stackPrior = prioritize(stack.peek());
                    }
                    stack.push(c);
                }
            }
            // 실패코드
            // 이유: 스택에 들어가는 연산자가 우선순위가 같은경우에도 꺼내어 계산하여야함.
            // 예외케이스 A*B+C+D를 넣으면 AB*C+D+가 나와야하지만, AB*CD++이 나옴
            // 연산자이면
//            else if(isOperator(c)){
//
//                int stackPrior;
//                if(stack.isEmpty())
//                    stackPrior = 0;
//                else
//                    stackPrior= prioritize(stack.peek());
//
//                int cPrior = prioritize(c);
//                if(cPrior<stackPrior){
//
//                    while (!stack.isEmpty()) {
//                        tmp.append(stack.pop());
//                    }
//                    stack.push(c);
//                }
//                else if(cPrior>=stackPrior){
//                    stack.push(c);
//                }
//
//            }

        }
        while(!stack.isEmpty()){
            tmp.append(stack.pop());
        }

        String postfix = tmp.toString();

        return postfix;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String mathExp = in.readLine();

        String mathExpPostfix = infixToPostfix(mathExp);

        out.write(mathExpPostfix);
        out.flush();
        out.close();
    }
}
