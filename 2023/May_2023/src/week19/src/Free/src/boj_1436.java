import java.io.*;

public class boj_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int cnt = 1;
        int num = 666;
        while (cnt != N) {
            ++num;
            if (String.valueOf(num).contains("666")) {
                ++cnt;
            }
        }
        ans.append(num);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
