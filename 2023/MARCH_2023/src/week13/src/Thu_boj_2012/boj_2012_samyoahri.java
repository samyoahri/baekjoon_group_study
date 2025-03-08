package Thu_boj_2012;
import java.io.*;
import java.util.*;
public class boj_2012_samyoahri {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int[] real = new int[N + 1];
        int[] expected = new int[N + 1];
        long res = 0;
        for (int i = 1; i <= N; i++) {
            real[i] = i;
            expected[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(expected);
        for (int i = 1; i <= N; i++) {
            res += Math.abs(real[i] - expected[i]);
        }
        ans.append(res);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
