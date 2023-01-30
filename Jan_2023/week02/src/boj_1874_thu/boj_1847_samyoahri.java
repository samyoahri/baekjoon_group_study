package boj_1874_thu;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class boj_1847_samyoahri {
//        public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder tmp = new StringBuilder();
//
//        int n = Integer.parseInt(in.readLine());
//        int seq[] = new int[n + 1];
//        Stack<Integer> stack = new Stack<>();
////        StringBuilder res = new StringBuilder();
//        for(int i = 1; i <=n; i++){
//            seq[i] = Integer.parseInt(in.readLine());
//        }
//        int pos = 1;
//        for(int i = 1; i <=n; i++){
//            stack.push(i);
//            tmp.append('+');
//            while (!stack.isEmpty() && stack.peek() == seq[pos]) {
////                System.out.println("i: " + i + "    pos" + pos + "    seq[pos]" + seq[pos]);
//                stack.pop();
//                tmp.append('-');
//                pos++;
//            }
//        }
//        String res = tmp.toString();
//        if(!stack.isEmpty()){
//            System.out.println("NO");
//        }
//        else{
//            for(int i = 0; i < res.length(); i++){
//                System.out.println(res.charAt(i));
//            }
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder tmp = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        int seq[] = new int[n + 1];
        Stack<Integer> stack = new Stack<>();
//        StringBuilder res = new StringBuilder();
        for(int i = 1; i <=n; i++){
            seq[i] = Integer.parseInt(in.readLine());
        }
        int pos = 1;
        for(int i = 1; i <=n; i++){
            //pop
            if (!stack.isEmpty() && stack.peek() == seq[pos]) {
                while (!stack.isEmpty() && stack.peek() == seq[pos]) {
                    stack.pop();
                    tmp.append('-');
                    pos++;
                }
                i--;
            }
            //push
            else{
                stack.push(i);
                tmp.append('+');
            }
        }
        while(!stack.isEmpty() && stack.peek()>= seq[pos]){
            if(!stack.isEmpty() && stack.peek()==seq[pos]){
                stack.pop();
                tmp.append('-');
                pos++;
            }
            else{
                stack.pop();
            }
        }
        if (pos == n + 1) {
//            System.out.println(tmp);
            for(int i = 0; i < tmp.length(); i++){
                System.out.println(tmp.charAt(i));
            }
        } else {
            System.out.println("NO");
        }
//        System.out.println("tmp: " + tmp);
//        System.out.println("pos: " + pos);
//        while(!stack.isEmpty()){
//            System.out.println("stack: " + stack.pop());
//        }
    }

}
