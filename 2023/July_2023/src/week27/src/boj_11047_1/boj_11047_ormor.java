package week27.src.boj_11047_1;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class boj_11047_ormor{
    public static void main(String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());

        int coinNumber = Integer.parseInt(st.nextToken());
        int coinPrice = Integer.parseInt(st.nextToken());

        ArrayList<Integer> coinValue = new ArrayList<>();

        while(coinNumber-- > 0){
            coinValue.add(Integer.parseInt(in.readLine()));
        }

        int coinCounter = 0;

        for(int i=coinValue.size()-1; i>=0; i--){
            if(coinValue.get(i)<=coinPrice){
                coinCounter = coinCounter + coinPrice/coinValue.get(i);
                coinPrice = coinPrice - (coinPrice/coinValue.get(i)) * coinValue.get(i);
            }
        }
        ans.append(coinCounter);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
