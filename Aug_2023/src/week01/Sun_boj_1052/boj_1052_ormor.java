package week01.Sun_boj_1052;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_1052_ormor{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int totalBottle = N;
        int answer;

        while(true){
            if(minBottleNum(totalBottle) <= K){
                answer = totalBottle - N;
                break;
            }
            else{
                totalBottle++;
            }
        }
        ans.append(answer);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }

    public static int minBottleNum(int totalBottleNum){
        int BottleBundle = 0;
        while(totalBottleNum > 0){
            if(totalBottleNum %2 == 1){
                BottleBundle++;
            }
            totalBottleNum /= 2;
        }
        return BottleBundle;
    }
}


//// 1,2번째 시도
//public class boj_1052_ormor {

//    public static int minBuyBottles(int N, int K){
        // 리스트 : 1,2번째 시도에 사용
//        ArrayList<Integer> squareOf2 = new ArrayList<>();
//        ArrayList<Integer> combinedBottle = new ArrayList<>();

        // ---------------------------[ 1번째 시도 ]------------------------------
//                int answer = 0;
//                for(int i=combinedBottle.size()-2; i>K-2; i--){
//                    System.out.println("인덱스(i) : "+i+"번째("+combinedBottle.get(i)+")");
//                    if(i==combinedBottle.size()-2){
//                        System.out.println("가장 처음인 경우 : 인덱스 i번째 값 == size()-2");
//                        answer = combinedBottle.get(i)-combinedBottle.get(i+1);
//                        System.out.println("answer : "+answer);
//                    }
//                    else{
//                        System.out.println("나머지 경우 : 1번째 병합 계산 이후");
//                        answer = answer + (combinedBottle.get(i) - combinedBottle.get(i+1)*2);
//                        System.out.println("answer : "+answer);
//                    }
//                }
//                return answer;

        // ---------------------------[ 2번째 시도 ]------------------------------
//        if(N<=K){
//            return 0;
//        }
//        else{
//            // N보다 작은 2의 n승 리스트 만들기
//            for(int i=0; (int)Math.pow(2,i)<=N; i++){
//                squareOf2.add(0,(int)Math.pow(2,i));
//            }
//            System.out.println("N보다 작은 2의n승 리스트 : "+squareOf2);
//            for (int a : squareOf2) {
//                if (N >= a) {
//                    combinedBottle.add(a);
//                    N = N - a;
//                    if (N == 0) {
//                        break;
//                    }
//                }
//            }
//            System.out.println("병합된 병들에 들어간 물의 양 리스트 : "+combinedBottle);
//
//            if(combinedBottle.size() <= K){
//                return 0;
//            }
//            else{
//                Collections.reverse(combinedBottle);
//                System.out.println("리스트 뒤집기 -> "+combinedBottle);
//                int buybottle = 0;
//                // int i=0;
//                while(combinedBottle.size() > K){
//                    System.out.println("-----------------------------------루프");
//                    System.out.println("이전 루프까지 buybottle : "+buybottle);
//                    buybottle = combinedBottle.get(1)-combinedBottle.get(0)+buybottle;
//                    System.out.println("인덱스1-0을 더한 이후 buybottle : "+buybottle);
//                    combinedBottle.set(1,combinedBottle.get(0)+buybottle+combinedBottle.get(1));
//                    System.out.println("리스트 인덱스1 수정 -> "+combinedBottle);
//                    combinedBottle.remove(0);
//                    System.out.println("리스트 인덱스0 제거 -> "+combinedBottle);
//                    // i++;
//                }
//                return buybottle;
//
//
//            }
//        }
//    }

//// 1,2번째 시도 main class
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(in.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        int answer = minBuyBottles(N,K);
//
//
//        ans.append(answer);
//        out.write(ans.toString());
//        out.flush();
//        in.close();
//        out.close();
//    }
//}
