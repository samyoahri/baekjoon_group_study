package Free;

import java.io.*;

public class boj_1543_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        char[] documentation = in.readLine().toCharArray();
        char[] word = in.readLine().toCharArray();

        int cnt = 0;
        boolean check = false;
//        System.out.println("documentation.length = " + documentation.length);
//        System.out.println("word.length = " + word.length);

        for (int i = 0; i < documentation.length; i++) {
//            System.out.println("i = " + i);
//            System.out.println("documentation[i] = " + documentation[i]);
            if (documentation[i] == word[0] && i+word.length <= documentation.length) {
                for (int j = 0; j < word.length; j++) {
                    if (documentation[i + j] != word[j]) {
                        check = false;
                        break;
                    }
                    check = true;
                }
            }
            if (check) {
                cnt++;
                i += word.length - 1;
                check = false;
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
