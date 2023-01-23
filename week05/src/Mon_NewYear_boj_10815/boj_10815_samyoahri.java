package Mon_NewYear_boj_10815;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

class Card{
    int num;

    public Card(int num) {
        this.num = num;
    }
}
public class boj_10815_samyoahri {
    //해쉬
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;

        //숫자카드의 갯수
        int N = Integer.parseInt(in.readLine());
        //숫자카드
        HashMap<Integer, Boolean> cards = new HashMap<>();
        int cardNum;
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            cardNum = Integer.parseInt(st.nextToken());
            cards.put(cardNum, true);
        }
        //정수의 개수
        int M = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < M; i++) {
            cardNum = Integer.parseInt(st.nextToken());
            if(cards.containsKey(cardNum)){
                ans.append("1 ");
            }
            else{
                ans.append("0 ");
            }
        }
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
    // 이진탐색트리
//    static int binarySearch(int cards[], int N, int target){
//        int first = 0;
//        int last = N-1;
//        int mid = 0;
//        while (first <= last) {
//            mid = (first+last) / 2;
//            if(cards[mid]==target){
//                return 1;
//            }
//
//            if (cards[mid] <= target) {
//                first = mid+1;
//            }
//            else{
//                last = mid-1;
//            }
//        }
//        return 0;
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st;
//
//        //숫자카드의 갯수
//        int N = Integer.parseInt(in.readLine());
//        //숫자카드
//        int cards[] = new int[N];
//        st = new StringTokenizer(in.readLine());
//        for (int i = 0; i < N; i++) {
//            cards[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(cards);
//
//        //정수의 개수
//        int M = Integer.parseInt(in.readLine());
//        st = new StringTokenizer(in.readLine());
//        for (int i = 0; i < M; i++) {
//            int temp = Integer.parseInt(st.nextToken());
//            int res = binarySearch(cards, N, temp);
//            ans.append(res+" ");
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
