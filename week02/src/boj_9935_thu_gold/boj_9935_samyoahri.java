package boj_9935_thu_gold;

import java.io.*;
import java.util.*;

public class boj_9935_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

//        Stack<Character> leftChar = new Stack<>();
//        Stack<Character> rightChar = new Stack<>();
        Stack<Character>stack = new Stack<>();
//        Stack<Character>stack1 = new Stack<>();
//        Stack<Character>stack2 = new Stack<>();
//        Queue<Character>queue = new LinkedList<>();


        String string = in.readLine();
        String explodingStr = in.readLine();
        int n = explodingStr.length();

        StringBuilder check = new StringBuilder();
//        char[] check = new char[n];
//        Arrays.fill(check, ' ');

        StringBuilder tmp = new StringBuilder(string);

        while(string.contains(explodingStr)){
            for(int i = 0; i < string.length(); i++){
//                queue.add(string.charAt(i));
                
            }


            tmp.append(stack.pop());


            string = tmp.toString();
        }
        out.write(string);
        out.flush();

        in.close();
        out.close();
//        for(int i = 0; i < string.length(); i++){
//
//        }


    }
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
