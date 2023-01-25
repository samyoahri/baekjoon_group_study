package boj_9935_thu_gold;

import java.io.*;
import java.util.*;

public class boj_9935_samyoahri {
    //지금까지 성능 제일 좋은코드
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String string = in.readLine();
        String explodingStr = in.readLine();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            ans.append(ch);
            //pop조건
            if(ans.length() >= explodingStr.length()
                    && ans.charAt(ans.length()-1)==explodingStr.charAt(explodingStr.length()-1)){
                boolean check = false;
                int start = ans.length()-explodingStr.length();
                int end = ans.length();
                if(ans.substring(start, end).equals(explodingStr)){
                    check = true;
                }
                if (check) {
                    ans.delete(start, end);
                }
            }
        }
        if (ans.length() == 0) {
            out.write("FRULA");
        }
        else{
            out.write(ans.toString());
        }
        out.flush();

        in.close();
        out.close();
    }
    //최적화 덜된 코드
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        Stack<Character>stack = new Stack<>();
//
//        String string = in.readLine();
//        String explodingStr = in.readLine();
//        char[] charString = string.toCharArray();
//
//        for (int i = 0; i < charString.length; i++) {
//            if (charString[i] == explodingStr.charAt(explodingStr.length()-1)) {
//                stack.push(charString[i]);
//                int stackIdx = stack.size()-1;
//                int explodingStrIdx = explodingStr.length()-1;
//
//                boolean check = false;
//                for (int j = stackIdx; j > (stackIdx-explodingStr.length() ); j--, explodingStrIdx--) {
////                    System.out.println("<j = " + j + ">");
////                    System.out.println("stack.get(j) = " + stack.get(j));
//                    if (stack.size() < explodingStr.length()
//                            ||stack.get(j) != explodingStr.charAt(explodingStrIdx)) {
//                        check=false;
//                        break;
//                    }
//                    else{
//                        check = true;
//                    }
//                }
//                if (check) {
//                    int explodingStrLen = explodingStr.length();
////                    for (int k = 0; k < 10; k++) {
////                        stack.pop();
////                    }
//                    while (explodingStrLen-- > 0) {
//                        stack.pop();
//                    }
//                }
//            }
//            else{
//                stack.push(charString[i]);
//            }
//            /////
////            System.out.println("[i = " + i + "]");
////            for (char c : stack) {
////                System.out.print(c);
////            }
////            System.out.println();
////            if (i == 7) {
////                System.out.println("stackIdx = " + (stack.size()-1));
////                System.out.println("explodingStrIdx = " + (explodingStr.length()-1));
////            }
//        }
//        if (stack.isEmpty()) {
//            ans.append("FRULA");
//        }
//        else{
//            for (int i = 0; i < stack.size(); i++) {
//                ans.append(stack.get(i));
//            }
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
    //메모리 초과
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
//        String string = in.readLine();
//        String explodingStr = in.readLine();
//
//        while(string.contains(explodingStr)){
//            StringBuilder tmp = new StringBuilder();
//            StringTokenizer arr = new StringTokenizer(string, explodingStr);
//            while(arr.hasMoreTokens()){
//                tmp.append(arr.nextToken());
//            }
//            string = tmp.toString();
//
//        }
//        if(string.equals(""))
//            System.out.println("FRULA");
//        else
//            System.out.println(string);
//    }
    //메모리 초과 코드
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//
//        String string = in.readLine();
//        String explodingStr = in.readLine();
//
//        while(string.contains(explodingStr)){
//            StringBuilder tmp = new StringBuilder();
//            String[] arr = string.split(explodingStr);
//            for(int i = 0; i < arr.length; i++){
//                tmp.append(arr[i]);
//                arr[i] = null;
//            }
//            string = tmp.toString();
//
//        }
//        if(string.equals(""))
//            System.out.println("FRULA");
//        else
//            System.out.println(string);
//    }
}
