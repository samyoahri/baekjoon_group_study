package Sun_boj_17609;

import java.io.*;

public class boj_17609_samyoahri {
    static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isSimilarPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                StringBuilder tmp1 = new StringBuilder(str);
                StringBuilder tmp2 = new StringBuilder(str);
                tmp1.deleteCharAt(i);
                tmp2.deleteCharAt(len - i - 1);
                return isPalindrome(tmp1.toString()) || isPalindrome(tmp2.toString());
            }
        }
        return true;
//        for (int i = 0; i < str.length(); ++i) {
//            StringBuilder tmp = new StringBuilder(str);
//            tmp.delete(i, i + 1);
//            if (isPalindrome(tmp.toString())) {
//                return true;
//            }
//        }
//        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            String str = in.readLine();
            if (isPalindrome(str)) {
                ans.append(0+"\n");
            }
            else if (isSimilarPalindrome(str)) {
                ans.append(1+"\n");
            }
            else {
                ans.append(2+"\n");
            }
        }


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
