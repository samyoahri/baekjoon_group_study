package Fri_boj_5585;

import java.io.*;
import java.nio.Buffer;

public class boj_5585_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int changes = 1000 - N;

        int changes500Num = 0, changes100Num = 0, changes50Num = 0, changes10Num = 0,changes5Num = 0, changes1Num = 0;
        if (changes / 500 != 0) {
            changes500Num = changes / 500;
            changes = changes % 500;
        }
        if (changes / 100 != 0) {
            changes100Num = changes / 100;
            changes = changes % 100;
        }
        if (changes / 50 != 0) {
            changes50Num = changes / 50;
            changes = changes % 50;
        }
        if (changes / 10 != 0) {
            changes10Num = changes / 10;
            changes = changes % 10;
        }
        if (changes / 5 != 0) {
            changes5Num = changes / 5;
            changes = changes % 5;
        }
        changes1Num = changes;
        int res = changes500Num + changes100Num + changes50Num + changes10Num + changes5Num + changes1Num;
        ans.append(res);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
