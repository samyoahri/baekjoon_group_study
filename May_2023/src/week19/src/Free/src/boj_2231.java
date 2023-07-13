import java.io.*;

public class boj_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int sumOfDisassemble = Integer.parseInt(in.readLine());
        int generator = 0;
        boolean check = false;
        int i = 0, k1 = 0 , k2 = 0, k3 = 0;

        for (i = 1; i <= sumOfDisassemble; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == sumOfDisassemble) {
                generator = i;
                break;
            }
        }
        if (generator == 0) {
            ans.append(0);
        }
        else{
            ans.append(generator);
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
