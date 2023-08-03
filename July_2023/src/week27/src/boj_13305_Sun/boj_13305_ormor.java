package week27.src.boj_13305_Sun;

import java.io.*;
import java.util.StringTokenizer;

public class boj_13305_ormor {
    static int N;
    static long ans = 0;
    static long[] price;

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stDist, stPrice;

        N = Integer.parseInt(in.readLine());

        stDist = new StringTokenizer(in.readLine());
        stPrice = new StringTokenizer(in.readLine());
        price = new long[N];

        for(int i=0; i<N; i++){
            price[i] = Integer.parseInt(stPrice.nextToken());
        }
        for(int i=0; i<price.length-1; i++){
            if(price[i] < price[i+1]){
                price[i+1] = price[i];
            }
        }
        int count = 0;
        while(stDist.hasMoreTokens()){
            ans = ans + price[count] * Integer.parseInt(stDist.nextToken());
            count++;
        }
        out.write(String.valueOf(ans));
        out.flush();
        in.close();
        out.close();
    }
}