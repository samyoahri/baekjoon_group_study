package Fri_boj_2839;

import java.io.*;

public class boj_2839_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int sugarKg = N;
        int bag3kgNum = 0;
        int bag5kgNum = 0;
        boolean check = false;
        while (sugarKg % 5 != 0) {
            sugarKg -= 3;
            ++bag3kgNum;
            if (sugarKg < 3 && sugarKg != 0) {
                check = true;
                break;
            }
        }
        if (check) {
            ans.append(-1);
        }
        else{
            bag5kgNum = sugarKg / 5;
            ans.append((bag3kgNum + bag5kgNum));
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
