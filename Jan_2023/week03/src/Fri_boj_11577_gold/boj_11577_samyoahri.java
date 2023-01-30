package Fri_boj_11577_gold;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_11577_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //전구의개수
        int n = Integer.parseInt(st.nextToken());
        //반전시킬 수 있는 전구의 개수
        int k = Integer.parseInt(st.nextToken());

        int[] initLight = new int[n];
        int[] light = new int[n];
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < n; i++) {
            light[i] = Integer.parseInt(st.nextToken());
            initLight[i] = light[i];
        }

//        ans.append(cnt);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
        //시간초과코드
//    static void printArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("[i = " + i + "]   ");
//            System.out.println("arr[i] = " + arr[i]);
//        }
//    }
//    static void toggle(int i, int k, int[] arr){
//        if(i+k <= arr.length){
//            for (int j = i; j<i+k ; j++) {
//                if(j>=arr.length)
//                    break;
//                if (arr[j] == 1) {
//                    arr[j] = 0;
//                }
//                else if(arr[j] == 0){
//                    arr[j] = 1;
//                }
////                System.out.println("i = " + i);
////                System.out.println("j = " + j);
////                System.out.print("arr = ");
////                for (int integer : arr) {
////                    System.out.print(integer);
////                    System.out.print(" ");
////                }
////                System.out.println();
//            }
//        }
//
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        //전구의개수
//        int n = Integer.parseInt(st.nextToken());
//        //반전시킬 수 있는 전구의 개수
//        int k = Integer.parseInt(st.nextToken());
//
//        int[] initLight = new int[n];
//        int[] light = new int[n];
//        st = new StringTokenizer(in.readLine(), " ");
//        for (int i = 0; i < n; i++) {
//            light[i] = Integer.parseInt(st.nextToken());
//            initLight[i] = light[i];
//        }
////        printArr(light);
////        toggle(2, 3, light);
////        System.out.println("After Toggle");
////        printArr(light);
//        boolean possible = true;
//        for (int i = 0; i < n; i++) {
//            if(light[i]==1){
//                toggle(i, k, light);
//            }
//        }
////        System.out.println("initLight");
////        printArr(initLight);
////        System.out.println("light");
////        printArr(light);
//        for (int i = 0; i < n; i++) {
//            if (light[i] == 1) {
//                possible = false;
//                break;
//            }
//        }
//        if (!possible) {
//            ans.append("Insomnia");
//        }
//        else{
//            Queue<Integer> indexQueue = new LinkedList<>();
//            Queue<Integer> valueQueue = new LinkedList<>();
//            int cnt = 0;
//            int start = 0;
//            int integer = 0;
//            for (int i = 0; i < initLight.length; i++) {
//
//                //pop 조건
//                if (indexQueue.size() == k) {
//                    if (initLight[0] == valueQueue.peek()) {
//                        toggle(indexQueue.peek(), k, initLight);
//                    }
//                    indexQueue.clear();
//                    valueQueue.clear();
//                    cnt++;
//                    indexQueue.add(i);
//                    valueQueue.add(initLight[i]);
//                }
//                //push조건
//                else{
//                    if (indexQueue.isEmpty()) {
//                        indexQueue.add(i);
//                        valueQueue.add(initLight[i]);
//                    }
//                    else{
//                        if (valueQueue.peek() == initLight[i]) {
//                            indexQueue.add(i);
//                            valueQueue.add(initLight[i]);
//                        }
//                        else{
//                            indexQueue.clear();
//                            valueQueue.clear();
//                            indexQueue.add(i);
//                            valueQueue.add(initLight[i]);
//                        }
//                    }
//                }
//            }
//            if(light[0]==0){
//                for (int i = 0; i < initLight.length; i++) {
//
//                    //pop 조건
//                    if (indexQueue.size() == k) {
//                        if (initLight[0] == valueQueue.peek()) {
//                            toggle(indexQueue.peek(), k, initLight);
//                        }
//                        indexQueue.clear();
//                        valueQueue.clear();
//                        cnt++;
//                        indexQueue.add(i);
//                        valueQueue.add(initLight[i]);
//                    }
//                    //push조건
//                    else{
//                        if (indexQueue.isEmpty()) {
//                            indexQueue.add(i);
//                            valueQueue.add(initLight[i]);
//                        }
//                        else{
//                            if (valueQueue.peek() == initLight[i]) {
//                                indexQueue.add(i);
//                                valueQueue.add(initLight[i]);
//                            }
//                            else{
//                                indexQueue.clear();
//                                valueQueue.clear();
//                                indexQueue.add(i);
//                                valueQueue.add(initLight[i]);
//                            }
//                        }
//                    }
//                }
//            }
//            ans.append(cnt);
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }

