package Free;

import java.io.*;

public class boj_10988_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String str = in.readLine();
        int N = str.length();
        String str1;
        if (N % 2 != 0) {
             str1 = str.substring(0, N / 2 + 1);
        }
        else{
            str1 = str.substring(0, N / 2);
        }
        String str2;
        StringBuilder str2b = new StringBuilder();
        for (int i = N - 1; i >= N / 2; i--) {
            str2b.append(str.charAt(i));
        }
        str2 = str2b.toString();
//        ans.append(str1 + "\n" + str2 + "\n");
        if (str1.equals(str2)) {
            ans.append(1);
        }
        else{
            ans.append(0);
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
