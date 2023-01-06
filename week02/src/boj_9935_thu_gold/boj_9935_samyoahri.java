package boj_9935_thu_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_9935_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String string = in.readLine();
        String explodingStr = in.readLine();
    }
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
