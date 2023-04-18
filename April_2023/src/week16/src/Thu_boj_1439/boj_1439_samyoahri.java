package Thu_boj_1439;

import java.io.*;

public class boj_1439_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String str = in.readLine();
        int continuousZeroCnt = 0;
        int continuousOneCnt = 0;
        int prev = 0;
        char prevCh, nowCh;
        for (int i = 0; i < str.length(); i++) {
            int now = i;
            if (i > 0) {
                nowCh = str.charAt(now);
                prevCh = str.charAt(prev);
                if (i == str.length() - 1) {
                    if (nowCh == prevCh) {
                        if (nowCh == '0') {
                            ++continuousZeroCnt;
                        } else if (nowCh == '1') {
                            ++continuousOneCnt;
                        }
                    }
                    else{
                        ++continuousOneCnt;
                        ++continuousZeroCnt;
                    }
                }
                else{
                    if (nowCh != prevCh) {
                        if (prevCh == '0') {
                            ++continuousZeroCnt;
                        } else if (prevCh == '1') {
                            ++continuousOneCnt;
                        }
                    }
                }
            }
            prevCh = str.charAt(i);
            prev = i;
        }
        if (continuousZeroCnt < continuousOneCnt) {
            ans.append(continuousZeroCnt);
        }
        else{
            ans.append(continuousOneCnt);
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
