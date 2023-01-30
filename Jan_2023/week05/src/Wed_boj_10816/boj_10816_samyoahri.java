package Wed_boj_10816;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj_10816_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;

        //상근이 숫자 카드 수
        int N = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine(), " ");
        //상근이 카드(카드번호, 카드개수)
        HashMap<Integer, Integer> sangeonCardDeque = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int cardNum = Integer.parseInt(st.nextToken());
            if (sangeonCardDeque.containsKey(cardNum)) {
                int quantity = sangeonCardDeque.remove(cardNum).intValue();
                sangeonCardDeque.put(cardNum, ++quantity);
            }
            else{
                sangeonCardDeque.put(cardNum, 1);
            }
        }

        int M = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int cardNum = Integer.parseInt(st.nextToken());
            if (sangeonCardDeque.containsKey(cardNum)) {
                ans.append(sangeonCardDeque.get(cardNum)+ " ");
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
}
