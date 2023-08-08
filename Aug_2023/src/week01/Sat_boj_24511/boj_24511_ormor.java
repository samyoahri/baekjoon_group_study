package week01.Sat_boj_24511;

import java.io.*;
import java.util.*;

class QueueStack{
    private int lengthQS; // N : 큐스택 길이
    private int[] config; // 수열A : 큐스택 자료구조 구성 (0:큐, 1:스택)
    private int[] element; // 수열B : 큐스택 원소 초기 값

    private Deque<Integer> deque = new ArrayDeque<>();

    // 기본 생성자
    public QueueStack(){
    }
    // 변수 할당 생성자
    public QueueStack(int lengthQS, int[] config, int[] element){
        this.lengthQS = lengthQS;
        this.config = config;
        this.element = element;
    }
    // 3번째 시도
    public int[] operation(int[] inputList){

        for(int i=0; i<lengthQS; i++){
            if(config[i] == 0){
                deque.add(element[i]);
            }
        }

        for(int i=0; i<inputList.length; i++){
            deque.addFirst(inputList[i]);
            inputList[i] = deque.removeLast();
        }

        return inputList;
    }
}

public class boj_24511_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine());
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(in.readLine());
        int[] B = new int[N];
        for(int i=0; i<N; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        QueueStack test = new QueueStack(N,A,B);

        int M = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine());
        int[] C = new int[M];
        for(int i=0; i<M; i++){
            C[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = test.operation(C);
        for(int i=0; i<M; i++){
            ans.append(answer[i]);
            if(i<M-1){
                ans.append(" ");
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}

//package week01.Sat_boj_24511;
//
//import java.io.*;
//import java.util.*;
//
//class QueueStack{
//    private int lengthQS; // N : 큐스택 길이
//    private int[] config; // 수열A : 큐스택 자료구조 구성 (0:큐, 1:스택)
//    private int[] element; // 수열B : 큐스택 원소 초기 값
//
////    // 1트
////    private LinkedList<Queue> listQueue = new LinkedList<>();
////    private LinkedList<Stack> listStack = new LinkedList<>();
////    // 2트
////    private Deque<Integer> deque = new ArrayDeque<>();
//    // 3트
////    private Queue<Integer> queue = new LinkedList<Integer>();
//    private Deque<Integer> deque = new ArrayDeque<>();
//
//    // 기본 생성자
//    public QueueStack(){
//    }
//    // 변수 할당 생성자
//    public QueueStack(int lengthQS, int[] config, int[] element){
//        this.lengthQS = lengthQS;
//        this.config = config;
//        this.element = element;
//    }
//    // 3번째 시도
//    public int[] operation(int[] inputList){
//
//        for(int i=0; i<lengthQS; i++){
//            if(config[i] == 0){
//                deque.add(element[i]);
////                System.out.println("큐에 저장된 값(스택제거) : "+deque);
//            }
//        }
//
//        for(int i=0; i<inputList.length; i++){
//            deque.addFirst(inputList[i]);
//            inputList[i] = deque.removeLast();
////            System.out.println("연산작업 : "+deque);
//        }
//
//        return inputList;
//    }
//
//
////    // 2번째 시도 - 시간 초과 : deque 사용, 자료구조 반복 생성 삭제
////    public int operation(int deliveryNum){
////        for(int i=0; i<lengthQS; i++){
////            deque.addFirst(Element[i]);
////            deque.addFirst(deliveryNum);
////            if(config[i] == 0){
////                deliveryNum = deque.pollLast();
////            }
////            else if(config[i] == 1){
////                deliveryNum = deque.pollFirst();
////            }
////            Element[i] = deque.poll();
////        }
////        return deliveryNum;
////    }
//
////    // 1번째 시도 - 시간 초과 (1번째 함수 : 큐 리스트, 스택 리스트 초기화)
////    private void initQS(){
////        for(int i = 0; i< lengthQS; i++){
////            if(config[i] == 0){
////                Queue<Integer> queue = new LinkedList<>();
////                queue.add(initElement[i]);
////                listQueue.add(queue);
//////                System.out.println("queue 생성");
////            } else if (config[i] == 1) {
////                Stack<Integer> stack = new Stack<>();
////                stack.add(initElement[i]);
////                listStack.add(stack);
//////                System.out.println("stack 생성");
////            }
////        }
////    }
//
////    // 1번째 시도 - 시간 초과 (2번째 함수 : 큐스택 연산)
////    public int operation(int inputNum){
////        int indexQ = 0;
////        int indexS = 0;
////        int deliver = inputNum;
////
////        while(indexS+indexQ< lengthQS){
////            if(config[indexQ+indexS] == 0){
////                listQueue.get(indexQ).add(deliver);
////                deliver = (int)listQueue.get(indexQ).poll();
////                indexQ++;
////            }
////            else if(config[indexQ+indexS] == 1){
////                listStack.get(indexS).push(deliver);
////                deliver = (int)listStack.get(indexS).pop();
////                indexS++;
////            }
////        }
////        return deliver;
////    }
//
//
////    public void printQS(){
////        System.out.println("length : "+ lengthQS);
////        for(int i=0; i<config.length; i++){
////            System.out.println("config "+i+"번째 원소 : "+config[i]);
////        }
////        for(int i = 0; i< element.length; i++){
////            System.out.println("initElement "+i+"번째 원소 : "+ element[i]);
////        }
////
////        System.out.println("queue : "+deque);
////
////    }
//}
//
//public class boj_24511_ormor {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//        StringTokenizer st;
//
//        int N = Integer.parseInt(in.readLine());
//        st = new StringTokenizer(in.readLine());
//        int[] A = new int[N];
//        for(int i=0; i<N; i++){
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//
//        st = new StringTokenizer(in.readLine());
//        int[] B = new int[N];
//        for(int i=0; i<N; i++){
//            B[i] = Integer.parseInt(st.nextToken());
//        }
//
//        QueueStack test = new QueueStack(N,A,B);
////        test.printQS();
//
//        int M = Integer.parseInt(in.readLine());
//        st = new StringTokenizer(in.readLine());
//        int[] C = new int[M];
//        for(int i=0; i<M; i++){
//            C[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int[] answer = test.operation(C);
//        for(int i=0; i<M; i++){
//            ans.append(answer[i]);
//            if(i<M-1){
//                ans.append(" ");
//            }
//        }
//
//        out.write(ans.toString());
//        out.flush();
//        in.close();
//        out.close();
//    }
//}
