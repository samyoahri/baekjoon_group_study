package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_5068_samyoahri {
    static byte check(int num1, int num2) {
        byte res = 0;
        if (num1 > num2) {
            if (num1 % num2 == 0) {
                res = 2;
            }
        }
        else{
            if (num2 % num1 == 0) {
                res = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if (num1 == 0 && num2 == 0) {
                break;
            }

            if (check(num1, num2) == 1) {
                ans.append("factor\n");
            } else if (check(num1, num2) == 2) {
                ans.append("multiple\n");
            }else{
                ans.append("neither\n");
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
