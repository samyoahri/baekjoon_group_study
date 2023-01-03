package boj_17298_tue_gold;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class boj_17298_samyoahri {

    //초창기 코드
    //성능제일 안좋음
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        String[] input = in.readLine().split(" ");
        int[] sequence = new int[n + 1];
        for(int i = 1; i <= n; i++){
            sequence[i] = Integer.parseInt(input[i-1]);
        }

        Stack indexStack = new Stack<>();
        Stack valueStack = new Stack<>();
        int[] neg = new int[n + 1];
        Arrays.fill(neg, -1);
        for(int i = 1; i <=n; i++){
            if(indexStack.isEmpty()||valueStack.isEmpty()){
                indexStack.push(i);
                valueStack.push(sequence[i]);
//                System.out.println("<Empty push>" + "   i: " + i);
//                System.out.println("i = " + i);
//                System.out.println("sequence[i] = " + sequence[i]);
            }
            else{
                int index = i;
                int value = sequence[i];
                int stackValue = (int)valueStack.peek();
                int stackIndex = (int)indexStack.peek();
                if((int)valueStack.peek() >= sequence[i]){
                    indexStack.push(index);
                    valueStack.push(value);
//                    System.out.println("<push>" + "   i: " + i);
//                    System.out.println("i = " + i);
//                    System.out.println("sequence[i] = " + sequence[i]);
                }
                else{
                    while(true){
                        if(valueStack.isEmpty() || (int)valueStack.peek() >= value ){
                            indexStack.push(index);
                            valueStack.push(value);
                            break;
                        }

                        stackIndex = (int) indexStack.pop();
                        stackValue = (int) valueStack.pop();
                        neg[stackIndex] = value;
//                        System.out.println("<pop>" + "   i: " + i);
//                        System.out.println("i = " + i);
//                        System.out.println("sequence[i] = " + sequence[i]);
//                        indexStack.pop();
//                        valueStack.pop();
                    }
                }
            }

        }
        for(int i = 1; i <= n; i++){
//            System.out.print(neg[i]+ " ");
            out.write(neg[i] + " ");
        }
        out.flush();
        out.close();
    }
    //제일 성능 좋은 코드
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(in.readLine());
//        //tokenizer보다 split이 더빠름
//        String[] input = in.readLine().split(" ");
//
//        int[] sequence = new int[n];
//        Stack<Integer> indexStack = new Stack<>();
//
////        int[] neg = new int[n];
////        Arrays.fill(neg, -1);
//
//        for(int i = 0; i < n; i++){
//            sequence[i] = Integer.parseInt(input[i]);
//        }
//        for(int i = 0; i < n; i++){
//            while(!indexStack.isEmpty() && sequence[indexStack.peek()] < sequence[i]){
////                neg[indexStack.pop()] = sequence[i];
//                sequence[indexStack.pop()] = sequence[i];
//            }
//            indexStack.push(i);
//
//        }
//        while(!indexStack.isEmpty()){
//            sequence[indexStack.pop()] = -1;
//        }
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < n; i++){
//            sb.append(sequence[i]).append(' ');
//        }
////        out.write();
//        System.out.println(sb);
////        for(int i = 0; i < neg.length; i++){
//////            System.out.print(neg[i] + " ");
////            out.write(neg[i] + " ");
////        }
//        out.flush();
//        out.close();
//    }
    //성능 조금 좋아진 코드
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(in.readLine());
//        String[] input = in.readLine().split(" ");
//        int[] sequence = new int[n];
//        Stack<Integer> indexStack = new Stack<>();
//        int[] neg = new int[n];
//        Arrays.fill(neg, -1);
//        for(int i = 0; i < n; i++){
//            sequence[i] = Integer.parseInt(input[i]);
//        }
//        for(int i = 0; i < n; i++){
//            while(!indexStack.isEmpty() && sequence[indexStack.peek()] < sequence[i]){
//                neg[indexStack.pop()] = sequence[i];
//            }
//            indexStack.push(i);
//
//        }
//        for(int i = 0; i < neg.length; i++){
////            System.out.print(neg[i] + " ");
//            out.write(neg[i] + " ");
//        }
//        out.flush();
//        out.close();
//    }
    //시간초과
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(in.readLine());
//        String[] input = in.readLine().split(" ");
//        int[] sequence = new int[n];
//        Stack<Integer> indexStack = new Stack<>();
//        int[] neg = new int[n];
//        Arrays.fill(neg, -1);
//        for(int i = 0; i < n; i++){
//            sequence[i] = Integer.parseInt(input[i]);
//        }
//        for(int i = 0; i < n; i++){
////            int idx = indexStack.peek();
//            if(!indexStack.isEmpty() && sequence[indexStack.peek()] < sequence[i]){
//                while(true){
//                    if(indexStack.isEmpty() || sequence[indexStack.peek()] >= sequence[i]){
//                        indexStack.push(i);
//                        break;
//                    }
////                    System.out.println("i:"+i+"   indexStack.pop()"+indexStack.peek());
//                    neg[indexStack.pop()] = sequence[i];
//                }
//            }
//            else{
//                indexStack.push(i);
//            }
//        }
//        for(int i = 0; i < neg.length; i++){
//            System.out.print(neg[i] + " ");
//        }
//    }
    //시간초과
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(in.readLine());
//        String[] input = in.readLine().split(" ");
//        int[] sequence = new int[n + 1];
//        for(int i = 1; i <= n; i++){
//            sequence[i] = Integer.parseInt(input[i-1]);
//        }
//
//        Stack indexStack = new Stack<>();
//        Stack valueStack = new Stack<>();
//        int[] neg = new int[n + 1];
//        Arrays.fill(neg, -1);
//        for(int i = 1; i <=n; i++){
//            if(indexStack.isEmpty()||valueStack.isEmpty()){
//                indexStack.push(i);
//                valueStack.push(sequence[i]);
////                System.out.println("<Empty push>" + "   i: " + i);
////                System.out.println("i = " + i);
////                System.out.println("sequence[i] = " + sequence[i]);
//            }
//            else{
//                int index = i;
//                int value = sequence[i];
//                int stackValue = (int)valueStack.peek();
//                int stackIndex = (int)indexStack.peek();
//                if((int)valueStack.peek() >= sequence[i]){
//                    indexStack.push(index);
//                    valueStack.push(value);
////                    System.out.println("<push>" + "   i: " + i);
////                    System.out.println("i = " + i);
////                    System.out.println("sequence[i] = " + sequence[i]);
//                }
//                else{
//                    while(true){
//                        if(valueStack.isEmpty() || (int)valueStack.peek() >= value ){
//                            indexStack.push(index);
//                            valueStack.push(value);
//                            break;
//                        }
//
//                        stackIndex = (int) indexStack.pop();
//                        stackValue = (int) valueStack.pop();
//                        neg[stackIndex] = value;
////                        System.out.println("<pop>" + "   i: " + i);
////                        System.out.println("i = " + i);
////                        System.out.println("sequence[i] = " + sequence[i]);
////                        indexStack.pop();
////                        valueStack.pop();
//                    }
//                }
//            }
//
//        }
//        for(int i = 1; i <= n; i++){
//            System.out.print(neg[i]+ " ");
//        }
//    }
}
