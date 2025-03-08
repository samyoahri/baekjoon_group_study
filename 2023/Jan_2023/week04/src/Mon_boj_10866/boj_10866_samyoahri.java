package Mon_boj_10866;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

//public class boj_10866_samyoahri {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int n = Integer.parseInt(in.readLine());
//
//        Deque<Integer> deque = new LinkedList<>();
//
//        StringTokenizer st;
//        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            String command = st.nextToken();
//            int x = -2147000000;
//            if (st.hasMoreTokens()) {
//                x = Integer.parseInt(st.nextToken());
//            }
//            if (command.equals("push_front")) {
//                deque.addFirst(x);
//            } else if (command.equals("push_back")) {
//                deque.addLast(x);
//            } else if (command.equals("pop_front")) {
//                if (deque.isEmpty()) {
//                    ans.append(-1 + "\n");
//                }
//                else{
//                    int output = deque.removeFirst();
//                    ans.append(output+ "\n");
//                }
//            } else if (command.equals("pop_back")) {
//                if (deque.isEmpty()) {
//                    ans.append(-1 + "\n");
//                }
//                else{
//                    int output = deque.removeLast();
//                    ans.append(output + "\n");
//                }
//            } else if (command.equals("size")) {
//                int output = deque.size();
//                ans.append(output + "\n");
//            } else if (command.equals("empty")) {
//                int output;
//                if (deque.isEmpty()) {
//                    output = 1;
//                }
//                else{
//                    output = 0;
//                }
//                ans.append(output + "\n");
//            } else if (command.equals("front")) {
//                int output;
//                if (deque.isEmpty()) {
//                    output = -1;
//                }else{
//                    output = deque.peekFirst();
//                }
//                ans.append(output + "\n");
//            } else if (command.equals("back")) {
//                int output;
//                if (deque.isEmpty()) {
//                    output = -1;
//                }else{
//                    output = deque.peekLast();
//                }
//                ans.append(output);
//                ans.append("\n");
//            }
//            else{
//                System.out.println("명령어 오류");
//                break;
//            }
//
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
class DEQUE{
    int[] data;
    int front;
    int back;
    public DEQUE() {
        data = new int[2147];
        front = 1050;
        back = 1050;
    }
    public DEQUE(int n) {
        data = new int[n];
        front = 0;
        back = 0;
    }
    boolean isEmpty(){
        if(front==back)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if ((back + 1) % data.length == front) {
            return true;
        }
        return false;
    }
    void push_front(int x) {
        if(isFull()){
//            System.out.println("큐가 포화상태입니다.");
        }
        else{
            data[front] = x;
            front = (front-1 + data.length) % data.length;
        }
    }
    void push_back(int x){
        if (isFull()) {
            System.out.println();
        }
        else{
            back = (back+1) % data.length;
            data[back] = x;
        }
    }
    int pop_front(){
        if (isEmpty()) {
//            System.out.println("큐가 공백상태입니다.");
            return -1;
        }
        else{
            front = (front+1) % data.length;
            return data[front];
        }

    }
    int pop_back(){
        int prev = back;
        if (isEmpty()) {
//            System.out.println("큐가 공백상태입니다.");
            return -1;
        }
        else{
            back = (back-1 + data.length) % data.length;
            return data[prev];
        }

    }
    int size(){
        return back-front;
    }
    int empty(){
        if (front == back) {
            return 1;
        }
        else{
            return 0;
        }
    }
    int front(){
        if (isEmpty()) {
//            System.out.println("큐가 공백상태입니다.");
            return -1;
        }
        else{
            return data[(front+1) % data.length];
        }
    }
    int back(){
        if (isEmpty()) {
//            System.out.println("큐가 공백상태입니다.");
            return -1;
        }
        else{
            return data[back];
        }
    }
}
public class boj_10866_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        StringTokenizer st;
        DEQUE deque = new DEQUE();
//        DEQUE deque = new DEQUE(n);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            String command = st.nextToken();
            int x = -2147000000;
            if (st.hasMoreTokens()) {
                x = Integer.parseInt(st.nextToken());
            }
            int output;
            if (command.equals("push_front")) {
//                System.out.println("[push_front]");
                deque.push_front(x);
            } else if (command.equals("push_back")) {
//                System.out.println("[push_back]");
                deque.push_back(x);
            } else if (command.equals("pop_front")) {
//                System.out.println("[pop_front]");
                output = deque.pop_front();
                ans.append(output + "\n");
            } else if (command.equals("pop_back")) {
//                System.out.println("[pop_back]");
                output = deque.pop_back();
                ans.append(output + "\n");
            } else if (command.equals("size")) {
//                System.out.println("[size]");
                output = deque.size();
                ans.append(output + "\n");
            } else if (command.equals("empty")) {
//                System.out.println("[empty]");
                output = deque.empty();
                ans.append(output + "\n");
            } else if (command.equals("front")) {
//                System.out.println("[front]");
                output = deque.front();
                ans.append(output + "\n");
            } else if (command.equals("back")) {
//                System.out.println("[back]");
                output = deque.back();
                ans.append(output + "\n");
            }
            else{
                System.out.println("명령어 오류");
                break;
            }
        }
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}