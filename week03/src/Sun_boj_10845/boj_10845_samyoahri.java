package Sun_boj_10845;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class  Queue{
    int rear;
    int front;
//    ArrayList<Integer> data;
    int[] data;

    public Queue(int n) {
        rear = -1;
        front = -1;
//        data = new ArrayList<>();
        data = new int[n];
    }

    public void push(int num) {
        data[++rear] = num;
    }
    public int pop() {
        if (empty() == 1) {
            return -1;
        }
        else
            return data[++front];
    }
    public int size(){
        return rear-front;
    }
    public int empty(){
        if(rear==front)
            return 1;
        else
            return 0;
    }
    public boolean isEmpty(){
        if(rear==front)
            return true;
        else
            return false;
    }
    public int front(){
        if (empty()==1) {
            return -1;
        }
        else
            return data[front+1];

    }
    public  int back(){
        if (empty() == 1) {
            return -1;
        }
        else
            return data[rear];
    }
}
public class boj_10845_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        StringTokenizer st;
        Queue queue = new Queue(n);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            String command = st.nextToken();
            int num;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
                queue.push(num);
            }
            else{
                if (command.equals("pop")) {
                    int output = queue.pop();
                    ans.append(output + "\n");
                }else if(command.equals("size")){
                    int output = queue.size();
                    ans.append(output + "\n");
                } else if (command.equals("empty")) {
                    int output = queue.empty();
                    ans.append(output + "\n");
                } else if (command.equals("front")) {
                    int output = queue.front();
                    ans.append(output + "\n");
                } else if (command.equals("back")) {
                    int output = queue.back();
                    ans.append(output + "\n");
                } else {
                    System.out.println("명령어 오류");
                }
            }
        }
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
