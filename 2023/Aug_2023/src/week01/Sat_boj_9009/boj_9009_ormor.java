package week01.Sat_boj_9009;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class boj_9009_ormor{
    static ArrayList<Integer> fiboList = new ArrayList<>();
    public static void makeFiboList(int n){
        fiboList.add(0,0);
        fiboList.add(1,1);
        int index = 2;
        while ( fiboList.get(fiboList.size()-1) + fiboList.get(fiboList.size()-2) <= n ){
            fiboList.add(index,fiboList.get(index-1) + fiboList.get(index-2));
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for(int i=0; i<T; i++){
            int testData = scanner.nextInt();
            fiboList.clear();
            ArrayList<Integer> ansList = new ArrayList<>();
            makeFiboList(testData);
            // System.out.println("테스트데이터(테스트케이스) : "+testData);
            // System.out.println("fiboList : "+fiboList);

            for(int j=fiboList.size()-1; j>0; j--){
                int check = fiboList.get(j);
                if(check < testData){
                    ansList.add(0,check);
                    testData = testData - check;
                    // System.out.println("테스터데이터 수정 : "+testData);
                }
                else if(check == testData){
                    ansList.add(0,check);
                    break;
                }
            }
            // System.out.println("ansList : "+ansList);
            for(int k=0; k<ansList.size(); k++){
                System.out.print(ansList.get(k));
                if(k==ansList.size()-1){
                    System.out.println();
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
}


//public class boj_9009_ormor {
//    static ArrayList<Integer> fiboList = new ArrayList<>();
//    public static void fibo(int num){
//        int index = 2;
//        fiboList.add(0,0);
//        fiboList.add(1,1);
//        while ( fiboList.get(fiboList.size()-1) + fiboList.get(fiboList.size()-2) < num ){
//            fiboList.add(index,fiboList.get(index-1)+fiboList.get(index-2));
//            index++;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        int T = scanner.nextInt();
//        int[] inputList = new int[T];
//
//        for(int i=0; i<T; i++){
//            inputList[i] = scanner.nextInt();
//        }
//
//        // fibo(Arrays.stream(inputList).max().getAsInt());
//
//        for(int i=0; i<inputList.length; i++){
//            int inputNum = inputList[i];
//            ArrayList<Integer> ans = new ArrayList<>();
//
//            // fibo(inputNum);
//            for(int index=fiboList.size()-1; index>=0; index--){
//                int fiboNum = fiboList.get(index);
//
//                if(fiboNum < inputNum){
//                    inputNum = inputNum - fiboNum;
//                    ans.add(0,fiboNum);
//                }
//                else if(fiboNum == inputNum){
//                    ans.add(0,fiboNum);
//                    break;
//                }
//            }
//            for(int j=0; j<ans.size(); j++){
//                System.out.print(ans.get(j)+" ");
//            }
//            System.out.println();
//
//        }
//    }
//}
