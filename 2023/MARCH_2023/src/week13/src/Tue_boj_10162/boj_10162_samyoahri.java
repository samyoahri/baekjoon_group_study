package Tue_boj_10162;

import java.io.*;

public class boj_10162_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int[] buttons = new int[3];
        //button[0]: 60 //button[1]: 10 //button[2]: 1
        int T = Integer.parseInt(in.readLine());
        boolean possible = true;
        if (T % 10 != 0) {
            possible = false;
        }
        if (!possible) {
            ans.append(-1);
        }
        else{
            buttons[0] = T / 300;
            T = T % 300;
            buttons[1] = T / 60;
            T = T % 60;
            buttons[2] = T / 10;
            ans.append(buttons[0] + " " + buttons[1] + " " + buttons[2]);
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
