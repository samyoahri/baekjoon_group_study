package Free;
import java.io.*;
public class boj_1978_samyoahri {
    static boolean isPrime(int num) {
        int i;
        if (num != 1) {
            i = 0;
            while (++i <= num) {
                //약수인지 확인
                if (num % i != 0) {
                    continue;
                }
                if (i != 1 && i != num) {
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int cnt = 0;
        int N = Integer.parseInt(in.readLine());
        int[] arr = new int[N];
        String[] strings = in.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strings[i]);
            if (isPrime(arr[i])) {
                ++cnt;
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
