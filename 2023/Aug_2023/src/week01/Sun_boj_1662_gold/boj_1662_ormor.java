package week01.Sun_boj_1662_gold;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class boj_1662_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();


        String S = in.readLine();
        char[] inputArr = S.toCharArray();

        Stack<Character> noZipChar = new Stack<>();
        Stack<Integer> zipOpenIdx = new Stack<>();
        Stack<Integer> innerZipCheck = new Stack<>();
        Stack<Integer> unZipLength = new Stack<>();

        char inputValue;
        for(int inputIdx=0; inputIdx<S.length(); inputIdx++){
            inputValue = inputArr[inputIdx];
            if(inputValue == '('){
                noZipChar.push(inputValue);
                zipOpenIdx.push(inputIdx);
            }else if(inputValue == ')'){
                if(zipOpenIdx.isEmpty()){
                    noZipChar.push(inputValue);
                    continue;
                }
                int opIdx = zipOpenIdx.pop();
                int Q=0;
                while(true) {
                    if (!innerZipCheck.isEmpty() && opIdx < innerZipCheck.peek()) { // 내부압축 존재
                        innerZipCheck.pop();
                        Q = Q + unZipLength.pop();
                    }else{
                        int K;
                        while (true) {
                            // char a = noZipChar.pop();
                            if (noZipChar.peek() == '(') {
                                noZipChar.pop();
                                K = Character.getNumericValue(noZipChar.pop());
                                break;
                            }
                            // System.out.println(noZipChar);
                            noZipChar.pop();
                            Q++;
                        }
                        unZipLength.push(K * Q);
                        innerZipCheck.push(opIdx);
                        break;
                    }
                }
            }else{
                noZipChar.push(inputValue);
            }
        }
        int finalUnzipLength = 0;
        while(!unZipLength.isEmpty()){
            innerZipCheck.pop();
            finalUnzipLength = finalUnzipLength + unZipLength.pop();
        }
        int finalNozipLength = 0;
        while(!noZipChar.isEmpty()){
            noZipChar.pop();
            finalNozipLength++;
        }

        ans.append(finalUnzipLength+finalNozipLength);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}

//package week01.Sun_boj_1662_gold;
//
//        import java.io.*;
//        import java.util.Stack;
//
//public class boj_1662_ormor {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        String S = in.readLine();
//        char[] inputArr = S.toCharArray();
//
//        Stack<Character> noZipStack = new Stack<>(); // 압축 되지 않은 나머지 문자들이 최종적으로 저장될 스택
//        Stack<Integer> unZipStack = new Stack<>(); // 압축 문자열의 압축 해제 후 길이가 저장될 스택
//        Stack<Integer> KIndexStack = new Stack<>(); // 압축 해제된 문자열의 K값의 인덱스를 저장할 스택
//
//        // 입력 문자열 0번째~마지막 인덱스까지 반복
//        for(int i=0; i<inputArr.length; i++){
//            System.out.println("-문자열에서 "+i+"번째 index 반복 시작-");
//            // i번째 문자가 ')'이라면,
//            if(inputArr[i] == ')'){
//                System.out.println(i+"번째 index 에서 ) 발견");
//                int Q=0;  // 입력 문자열에서 ')'이전 문자들의 개수
//                // ')'문자의 인덱스부터 0번째 문자까지 반복
//                while(!noZipStack.isEmpty()){
//                    // 스택에서 문자 제거 후, openStr에 초기화
//                    char openStr = noZipStack.pop(); // openStr : '('찾기 위해 사용
//                    if(openStr == '(' && noZipStack.peek() != '(' && noZipStack.peek() != ')'){ // '('를 찾았다면
//                        int K = noZipStack.pop() - '0'; // K값 저장, 아스키코드 값으로 char -> int 변환('0'==48)
//                        // 이중 압축 계산
//                        if(!unZipStack.isEmpty()){
//                            unZipStack.push(K*(Q+unZipStack.pop()));
//                        }else{
//                            unZipStack.push(K*Q); // K*Q 하여 K(Q)의 압축 해제 후 길이 계산
//                        }
//                        break;
//                    }
//                    // j번째 문자가 '('이 아니라면,
//                    Q++; // 제거된 문자 개수 세기
//                }
//
//                // System.out.println("K index : "+(i-Q-2));
//            }else{
//                noZipStack.push(inputArr[i]);
//            }
//
//        }
//
//        System.out.println("unZipStack : "+unZipStack);
//        System.out.println("noZipStack : "+noZipStack);
//        // System.out.println("KStack : "+KStack);
////        ans.append()
////        out.write(ans.toString());
////        out.flush();
//        in.close();
//        out.close();
//    }
//}
