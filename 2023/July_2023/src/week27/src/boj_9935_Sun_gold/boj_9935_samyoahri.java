package boj_9935_Sun_gold;

import java.io.*;
import java.util.*;

public class boj_9935_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder tmp = new StringBuilder();

        String str = in.readLine();
        String delim = in.readLine();
        int N = delim.length();

        for (int i = 0; i < str.length(); ++i) {
            tmp.append(str.charAt(i));
            int end = tmp.length();
            int start = tmp.length() - N;
            if (start < 0) {
                start = 0;
            }

            if (tmp.substring(start, end).equals(delim)) {
                tmp.replace(start, end, "");
            }
        }
        if (tmp.length() == 0) {
            out.write("FRULA");
        }
        else{
            out.write(tmp.toString());
        }
        out.flush();
        in.close();
        out.close();
    }
    //비효율적인 코드
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
//                    if (stack.size() < explodingStr.length()
//                            ||stack.get(j) != explodingStr.charAt(explodingStrIdx)){
//                        check=false;
//                        break;
//                    }
//                    else{
//                        check = true;
//                    }
//                }
//                if (check) {
//                    int explodingStrLen = explodingStr.length();
//                    while (explodingStrLen-- > 0) {
//                        stack.pop();
//                    }
//                }
//            }
//            else{
//                stack.push(charString[i]);
//            }
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
}
