package week27.src.boj_9935_Sun_gold;

import java.io.*;
import java.util.*;

public class boj_9935_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        // 사용자 입력
        String inputStr = in.readLine();
        String bombStr = in.readLine();

        char[] bombArr = bombStr.toCharArray(); // bombArr : 폭발 문자열이 담긴 배열
        Stack<Character> stack = new Stack<>(); // stack : 폭발 연산을 위한 스택 선언
        Stack<Character> checkBomb = new Stack<>(); // 폭발 문자열이 맞는지 확인 할 때 사용할 스택
        char ch; // i번째 문자
        // 입력 문자열을 순회
        for(int i=0; i<inputStr.length(); i++){
            ch = inputStr.charAt(i);
            stack.push(ch); // 우선 i번째 문자열을 스택에 push
            // 폭발 문자열의 마지막 문자 == i번째 문자
            if(bombArr[bombArr.length-1] == stack.peek()){
//                System.out.println("-폭탄 의심-");
                // 폭발 문자열을 뒤에서부터 순회하며, 폭탄인지 확인하기
                for(int j=bombArr.length-1; j>=0; j--){
                    // 폭탄 문자열의 j번째 문자가 스택 최상단 문자와 동일하다면,
                    if(!stack.isEmpty() && bombArr[j] == stack.peek()){
                        checkBomb.push(stack.pop()); // 스택에서 pop, 폭탄이 아닐 수 있으니 다른 스택에 임시 저장
                    }else{
                        // 폭탄 문자열의 j번째 문자가 스택 최상단 문자와 동일하지 않다면,(폭탄이 아님)
                        // 1. 다른 스택에 임시로 저장한 문자들 모두 원래 스택으로 push
                        while(!checkBomb.isEmpty()){
                            stack.push(checkBomb.pop());
                        }
                        break;
                    }
                }
                if(!checkBomb.isEmpty()){
                    checkBomb.clear();
                }
//                System.out.println("폭탄 확인 후 stack : "+stack);
            }
//            System.out.println(i+"번째 반복 후 stack : "+stack);
        }
        if(stack.isEmpty()){
            ans.append("FRULA");
        }else{
            while(!stack.isEmpty()){
                ans.append(stack.pop());
            }
            ans.reverse();
        }

        out.write(ans.toString());
        out.flush();
        out.close();
        in.close();
    }
}
