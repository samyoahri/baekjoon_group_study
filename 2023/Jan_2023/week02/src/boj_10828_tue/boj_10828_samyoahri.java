package boj_10828_tue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack{
    private int [] data;
    private int top;
    Stack(){
    }
    Stack(int n){
        data = new int[n];
        top = -1;
    }
    void push(int num){
        ++top;
        data[top] = num;
    }
    int pop(){
        if(empty()==1){
            return -1;
//            System.out.println(-1);
        }
        else {
            return data[top--];
//            System.out.println(data[top--]);
        }
    }
    int size(){
        if(top==-1){
            return 0;
        }
        else{
            return top+1;
        }
    }
    int empty(){
        if(top==-1){
            return 1;
        }
        else{
            return 0;
        }
    }
    int top(){
        if(empty()==1){
            return -1;
//            System.out.println(-1);
        }
        else{
            return data[top];
//            System.out.println(data[top]);
        }
    }
}

public class boj_10828_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int commandNumber = Integer.parseInt(in.readLine());
        Stack stack = new Stack(commandNumber);
        for (int i = 0; i < commandNumber; i++) {
            String str = in.readLine();
//            String[] command = str.split(" ");

            //푸쉬할 숫자가 있는 경우
            if (str.contains(" ")) {
                String[] command = str.split(" ");
                if (command[0].equals("push")) {
                    stack.push(Integer.parseInt(command[1]));
                } else {
                    System.out.println("오류");
                }
//                else if(command[1]==)
            }
            //푸쉬할 숫자가 없는 경우
            else {
//                if(str=="pop"){
                if (str.equals("pop")) {
//                    stack.pop();
                    System.out.println(stack.pop());
                }
                else if (str.equals("size")) {
                    System.out.println(stack.size());
                }
                else if (str.equals("empty")) {
                    System.out.println(stack.empty());
                }
                else if (str.equals("top")) {
                    System.out.println(stack.top());
                }
                else {
                    System.out.println("오류");
                }
            }
        }
    }
}
