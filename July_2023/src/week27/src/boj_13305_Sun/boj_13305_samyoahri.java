package boj_13305_Sun;

import java.io.*;
import java.util.*;

class City{
    long len;
    long oilPrice;

    public City() {
    }
}
public class boj_13305_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        City[] cities = new City[N - 1];
        for (int i = 0; i < N - 1; ++i) {
            cities[i] = new City();
        }
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < N - 1; ++i) {
            cities[i].len = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < N; ++i) {
            //도착도시의 기름값은 필요없음
            if (i == N - 1) {
                break;
            }
            cities[i].oilPrice = Long.parseLong(st.nextToken());
        }
        long totalExpense = 0;

        //구현 쉬운 코드
        long minOil = Long.MAX_VALUE;
        for (int i = 0,j = i + 1; i < N - 1 && j < N; ++i, ++j) {
            minOil = Math.min(minOil, cities[i].oilPrice);
            totalExpense += minOil * cities[i].len;
        }
        //구현이 어려운 코드
//        int i;
//        for (i = 0; i < N - 1; i++) {
//            int j;
//            for (j = i; j < N - 1 && cities[j].oilPrice >= prevOilPrice; j++) {
//                totalExpense += prevOilPrice * cities[j].len;
//            }
//            if (j == N - 1) {
//                break;
//            }
//            prevOilPrice = cities[j].oilPrice;
//            i = j - 1;
//        }
        ans.append(totalExpense);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();

    }
}
