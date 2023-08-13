package week01.Fri_boj_2258_gold;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
class Meat{
    int weight;
    int price;

    public Meat(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
}
public class boj_2258_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //덩어리의 개수
        int N = Integer.parseInt(st.nextToken());
        Meat[] meats = new Meat[N];
        //필요한 고기의 양
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            meats[i] = new Meat(weight, price);
        }
        Arrays.sort(meats, new Comparator<Meat>() {
            @Override
            public int compare(Meat o1, Meat o2) {
//                return o1.price - o2.price;
                if (o1.price < o2.price) {
                    return -1;
                } else if (o1.price == o2.price) {
                    return -(o1.weight - o2.weight);
                } else{
                    return 1;
                }
            }
        });
        int totalPrice = 0, totalWeight = 0;
        int samePrice = 0;
        int output = Integer.MAX_VALUE;
        boolean falg = false;
        for (int i = 0; i < N; ++i) {
            totalWeight += meats[i].weight;
            if (i > 0 && meats[i].price == meats[i - 1].price) {
                samePrice += meats[i].price;
            }
            else{
                samePrice = 0;
            }
            if (totalWeight >= M) {
                falg = true;
                output = Math.min(output, meats[i].price + samePrice);
            }
        }

        if (falg) {
            ans.append(output);
        }
        else{
            ans.append(-1);
        }


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
