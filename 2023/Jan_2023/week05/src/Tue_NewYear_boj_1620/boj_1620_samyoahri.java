package Tue_NewYear_boj_1620;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj_1620_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] strArr = new String[N+1];
        for (int i = 1; i <= N; i++) {
            String poketmonName = in.readLine();
            hashMap.put(poketmonName, i);
            strArr[i] = poketmonName;
        }

        for (int i = 1; i <= M; i++) {
            String str = in.readLine();
            int index;
//            System.out.println(Integer.parseInt(str));
            try{
                index = Integer.parseInt(str);
                ans.append(strArr[index]+"\n");
            }
            catch (NumberFormatException numberFormatException){
                ans.append(hashMap.get(str)+"\n");
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
