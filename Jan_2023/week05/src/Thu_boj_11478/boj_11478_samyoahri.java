package Thu_boj_11478;

import java.io.*;
import java.util.HashMap;

public class boj_11478_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String str = in.readLine();
        char[] strCharArr = str.toCharArray();
        int len = strCharArr.length;

        int cnt = 0;
        int start = 0; int end = 0;
        int totalCnt = (len)*(len+1)/2;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= len; i++) {
            for (start=0, end = start+i; end <= len; start++, end++) {
                String substring = str.substring(start, end);
                if (!hashMap.containsKey(substring)) {
                    hashMap.put(substring, 1);
                    cnt++;
                }
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
