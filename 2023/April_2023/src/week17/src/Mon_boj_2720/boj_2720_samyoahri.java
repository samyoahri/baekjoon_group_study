package Mon_boj_2720;

import java.io.*;

public class boj_2720_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(in.readLine());
            int quarterNum = 0, dimeNum = 0, nickelNum = 0, pennyNum = 0;
            quarterNum = money / 25;
            money = money % 25;
            dimeNum = money / 10;
            money = money % 10;
            nickelNum = money / 5;
            money = money % 5;
            pennyNum = money;
            ans.append(quarterNum + " " + dimeNum + " " + nickelNum + " " + pennyNum + "\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
