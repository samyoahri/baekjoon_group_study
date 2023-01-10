package boj_1406_sat;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class boj_1406_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> leftChar = new Stack<>();
        Stack<Character> rightChar = new Stack();

        String str = in.readLine();
        int n = str.length();

        for(int i = 0; i < n; i++){
            leftChar.push(str.charAt(i));
        }

        int m = Integer.parseInt(in.readLine());

        for(int i = 0; i < m; i++){
            String command = in.readLine();
            if(command.startsWith("L")){
                if(!leftChar.isEmpty()){
                    char ch = leftChar.pop();
                    rightChar.push(ch);
                }

            }
            else if (command.startsWith("D")) {
                if(!rightChar.isEmpty()){
                    char ch = rightChar.pop();
                    leftChar.push(ch);
                }

            }
            else if (command.startsWith("B")) {
                if(!leftChar.isEmpty())
                    leftChar.pop();
            }
            else if (command.startsWith("P")) {
                char ch = command.charAt(2);
                leftChar.push(ch);
            }
            else{
                System.out.println("Error 입력에러");
            }
        }
        while(!leftChar.isEmpty()){
            rightChar.push(leftChar.pop());
        }
        while(!rightChar.isEmpty()){
            out.write(rightChar.pop());
        }
        out.flush();

        in.close();
        out.close();
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        LinkedList<Character> res = new LinkedList<>();
//
//        String str = in.readLine();
//        int n = str.length();
//        for(int i = 0; i < n; i++) {
//            res.add(str.charAt(i));
//        }
//
//        ListIterator<Character> iter = res.listIterator();
//        while(iter.hasNext()) {
//            iter.next();
//        }
//
//        int m = Integer.parseInt(in.readLine());
//        for(int i = 0; i < m; i++) {
//            String command = in.readLine();
//            //L
//            if(command.startsWith("L")) {
//                if(!iter.hasPrevious())
//                    continue;
//                iter.previous();
//            }
//            else if(command.startsWith("D")) {
//                if(!iter.hasNext())
//                    continue;
//                iter.next();
//            }
//            else if (command.startsWith("B")){
//                if(!iter.hasPrevious())
//                    continue;
//                iter.previous();
//                iter.remove();
//            }
//            else if (command.startsWith("P")){
//                iter.add(command.charAt(2));
//            }
//            else{
//                System.out.println("Error 입력값 에러");
//            }
//        }
//        for(char ch: res) {
//            out.write(ch);
//        }
//        out.flush();
//
//        in.close();
//        out.close();
//    }

    //틀린코드 왜틀렸는지를 모르겠네
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Stack<String> stack = new Stack<>();
//        ArrayList<String> commands = new ArrayList<>();
////        LinkedList<String> commands = new LinkedList<>();
//        StringBuilder res = new StringBuilder();
//
//        String str = in.readLine();
//        int n = str.length();
//        int now = n;
//
//        res.append(str);
//
//        int m = Integer.parseInt(in.readLine());
//
//        for(int i = 0; i < m; i++){
//            String tmp = in.readLine();
//            if(stack.isEmpty()){
//                stack.push(tmp);
//            }
//            // L, D
//            //B
//            else if(!stack.isEmpty() && tmp.length()==1){
//                if(tmp.equals("L")){
//                    if ( stack.peek().equals("D")) {
//                        stack.pop();
//                    }
//                    else{
//                        commands.add(stack.pop());
//                        stack.push(tmp);
//                    }
//                }
//                else if(!stack.isEmpty() && tmp.equals("D")){
//                    if (stack.peek().equals("L")) {
//                        stack.pop();
//                    }
//                    else{
//                        commands.add(stack.pop());
//                        stack.push(tmp);
//                    }
//                }
//                else if(!stack.isEmpty() && tmp.equals("B")){
//                    if(stack.peek().charAt(0)=='P'){
//                        stack.pop();
//                    }
//                    else{
//                        commands.add(stack.pop());
//                        stack.push(tmp);
//                    }
//                }
//                else{
//                    System.out.println("Error 입력에러 L, D, B 가 아님");
//                }
//            }
//            // P
//            else if(!stack.isEmpty() && tmp.length()==3){
//                commands.add(stack.pop());
//                stack.push(tmp);
//            }
//            else{
//                System.out.println("Error");
//            }
//        }
//        while(!stack.isEmpty()){
//            commands.add(stack.pop());
//        }
//        for(String command : commands){
////            System.out.println(command);
//            char ch = command.charAt(0);
//            if(ch == 'P'){
////                System.out.println("[P]: 삽입");
//                res.insert(now, command.charAt(2));
//                now++;
////                System.out.println("now: " + now);
////                System.out.println("res: " + res);
//            }
//            else if(ch == 'L'){
////                System.out.println("[L]: 왼쪽커서이동");
//                if(now==0){
//                    continue;
//                }
//                now--;
//            }
//            else if(ch == 'D'){
////                System.out.println("[D]: 오른쪽커서이동");
//                if(now==res.length()){
//                    continue;
//                }
//                now++;
//            }
//            else if(ch == 'B'){
////                System.out.println("[B]: 삭제");
//                if(now==0){
//                    continue;
//                }
//                res.delete(now-1, now);
//                now--;
//
////                System.out.println("now: " + now);
////                System.out.println("res: " + res);
//            }
//            else{
//                System.out.println("Error command");
//            }
//        }
////        System.out.println(res);
//        out.write(res.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
