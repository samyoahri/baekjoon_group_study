package Mon_boj_6550;

import java.io.*;
import java.util.StringTokenizer;

public class boj_6550_samyoahri {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;
        String str;

        while (true) {
            str = in.readLine();
            if (str == null) {
                break;
            }
//            System.out.println(str);
            st = new StringTokenizer(str);
            String s = st.nextToken();
            String t = st.nextToken();

            int idx = 0;
            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(idx) == t.charAt(i)) {
                    idx++;
                }
                if (idx == s.length()) {
                    break;
                }
            }
            if (idx == s.length()) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
