package week27.src.boj_1541_Sat;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_1541_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder ans = new StringBuilder();
        StringTokenizer stMinus, stPlus;

        stMinus = new StringTokenizer(in.readLine(), "-");
        ArrayList<Integer> minusTokenList = new ArrayList<>();

        while(stMinus.hasMoreTokens()){
            stPlus = new StringTokenizer(stMinus.nextToken(), "+");
            int hap = 0;
            if(stPlus.hasMoreTokens()){
                while(stPlus.hasMoreTokens()){
                    hap += Integer.parseInt(stPlus.nextToken());
                }
                minusTokenList.add(hap);
            }
            else{
                minusTokenList.add(Integer.parseInt(String.valueOf(stPlus)));
            }
        }
        int ans = minusTokenList.get(0);
        for(int i=1; i<minusTokenList.size(); i++){
            ans = ans - minusTokenList.get(i);
        }
//        ans.append();
        out.write(String.valueOf(ans));
        out.flush();
        in.close();
        out.close();
    }
}