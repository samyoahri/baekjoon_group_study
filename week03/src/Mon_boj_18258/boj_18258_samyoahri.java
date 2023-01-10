package Mon_boj_18258;

import java.io.*;
import java.util.StringTokenizer;

class Queue{
    private int rear;
    private int front;
    private int data[];
    public StringBuilder res = new StringBuilder();;
    Queue(int n){
        rear = -1;
        front = -1;
        data = new int[n];

    }
    void push(int num) {
        data[++rear] = num;
    }
    void pop(){
        int output;
        if(isEmpty()){
            output = -1;
//            System.out.println(output);
            res.append(output + "\n");
        }
        else{
            output = data[++front];
//            System.out.println(output);
            res.append(output + "\n");
        }
    }
    void empty(){
        if (front == rear) {
//            System.out.println(1);
            res.append(1 + "\n");
        }else{
//            System.out.println(0);
            res.append(0 + "\n");
        }
    }
    void size(){
        int output;
        if(isEmpty()){
            output = 0;
//            System.out.println(output);
            res.append(output + "\n");
        }
        else{
//            System.out.println(rear - front);
            res.append((rear-front) + "\n");
        }
    }
    void front(){
        int output;
        if(isEmpty()){
            output = -1;
//            System.out.println(output);
            res.append(output + "\n");
        }
        else{
            output = data[front+1];
//            System.out.println(output);
            res.append(output + "\n");
        }
    }
    void back(){
        int output;
        if(isEmpty()){
            output = -1;
//            System.out.println(output);
            res.append(output + "\n");
        }
        else{
            output = data[rear];
//            System.out.println(output);
            res.append(output + "\n");
        }
    }
    boolean isEmpty(){
        if(front==rear)
            return true;
        else
            return false;
    }
}
public class boj_18258_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        Queue queue = new Queue(n);
        for(int i = 0; i < n; i++){
            StringTokenizer input = new StringTokenizer(in.readLine());
            String command = input.nextToken();
            if (command.equals("push")) {
                int num = Integer.parseInt(input.nextToken());
                queue.push(num);
            } else if (command.equals("pop")) {
                queue.pop();
            } else if (command.equals("size")) {
                queue.size();
            } else if (command.equals("empty")) {
                queue.empty();
            } else if (command.equals("front")) {
                queue.front();
            } else if (command.equals("back")) {
                queue.back();
            }else{
                System.out.println("명령어 오류입니다.");
            }
        }
        out.write(queue.res.toString());
        out.flush();
        in.close();
        out.close();
    }
}