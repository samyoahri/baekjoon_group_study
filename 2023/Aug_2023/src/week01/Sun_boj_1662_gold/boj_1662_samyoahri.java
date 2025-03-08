package week01.Sun_boj_1662_gold;

import java.io.*;
import java.util.*;

class Data{
    int K;
    int beforeCnt;

    public Data(int k, int cnt) {
        this.K = k;
        this.beforeCnt = cnt;
    }
}
public class boj_1662_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String string = in.readLine();
        Stack<Data> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < string.length(); ++i) {
            char ch = string.charAt(i);
            if (ch == '(') {
                int k = string.charAt(i - 1) - 48;
                stack.push(new Data(k, cnt - 1));
                cnt = 0;
            } else if (ch == ')') {
                Data data = stack.pop();
                cnt = cnt * data.K + data.beforeCnt;
            } else{
                ++cnt;
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }

}
