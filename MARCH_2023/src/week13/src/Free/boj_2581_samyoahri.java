package Free;

import java.io.*;
import java.util.ArrayList;

public class boj_2581_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int M = Integer.parseInt(in.readLine());
        int N = Integer.parseInt(in.readLine());
        int len = N - M + 1;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int num = M + i;
            if (num == 1) {
                continue;
            }
            boolean isPrimeNum = true;
            for (int idx = 2; idx < num; idx++) {
                if (num % idx == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum) {
                primeNumbers.add(num);
            }
        }
        int min = -1, res = 0;
        if (primeNumbers.size() == 0) {
            ans.append(min);
        }
        else{
            min = primeNumbers.get(0);
            for (int integer : primeNumbers) {
                res += integer;
            }
            ans.append(res + "\n" + min);
        }



        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
