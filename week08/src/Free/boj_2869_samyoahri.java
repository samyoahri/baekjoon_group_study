package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_2869_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int meterPerDayOfSnail = Integer.parseInt(st.nextToken());
        int meterPerDayGravity = Integer.parseInt(st.nextToken());
        int meterOfTree = Integer.parseInt(st.nextToken());

        int neededDay = (meterOfTree - meterPerDayGravity) / (meterPerDayOfSnail - meterPerDayGravity);
        if ((meterOfTree - meterPerDayGravity) % (meterPerDayOfSnail - meterPerDayGravity) != 0) {
            neededDay++;
        }
        ans.append(neededDay);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
