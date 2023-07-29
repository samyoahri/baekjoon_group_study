package week27.src.boj_10773_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class boj_10773_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());

        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> KValue = new ArrayList<>();

        int checkNumber = 0;
        while(K-- > 0){
            checkNumber = Integer.parseInt(in.readLine());
            if(checkNumber != 0){
                KValue.add(checkNumber);
            }
            else{
                KValue.remove(KValue.size()-1);
            }
        }

        int sum = 0;
        for(int i : KValue)
            sum += i;

        // 한 줄 작성
        // int sum = KValue.stream().mapToInt(Integer::intValue).sum();

        ans.append(sum);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}