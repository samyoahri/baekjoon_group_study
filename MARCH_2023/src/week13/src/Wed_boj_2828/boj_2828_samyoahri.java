package Wed_boj_2828;

import java.io.*;
import java.util.StringTokenizer;

class Basket{
    int left;
    int right;

    public Basket(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void changeCoordinate(int size) {
        this.left += size;
        this.right += size;
    }
}
public class boj_2828_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //스크린 크기
        int N = Integer.parseInt(st.nextToken());
        //바구니 크기
        int M = Integer.parseInt(st.nextToken());
        //사과의 개수
        int J = Integer.parseInt(in.readLine());
        Basket basket = new Basket(1, M);
        int dis;
        int res = 0;
        for (int j = 0; j < J; j++) {
            int coordinate = Integer.parseInt(in.readLine());
            //왼쪽으로 갈지 결정
            if (coordinate < basket.left) {
                dis = basket.left - coordinate;
                basket.left = coordinate;
                basket.right = basket.left + M - 1;
                res += dis;
//                continue;
            }
            //오른쪽으로 갈지 결정
            if (coordinate > basket.right) {
                dis = coordinate - basket.right;
                basket.left = coordinate - M + 1;
                basket.right = basket.left + M - 1;
                res += dis;
//                continue;
            }
        }
        ans.append(res);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
