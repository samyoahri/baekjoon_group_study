package week01.Tue_boj_11256;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
class Box implements Comparable<Box>{
    int width;
    int length;

    public Box(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int compareTo(Box o1) {
        return -((width * length) - (o1.width * o1.length));
    }
}
public class boj_11256_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(in.readLine());
        StringTokenizer st;
        for (int i1 = 0; i1 < T; ++i1) {
            st = new StringTokenizer(in.readLine());
            //사탕의 개수
            int J = Integer.parseInt(st.nextToken());
            //상자의 개수
            int N = Integer.parseInt(st.nextToken());
            Box[] boxes = new Box[N];
            for (int i = 0; i < N; ++i) {
                st = new StringTokenizer(in.readLine());
                int length = Integer.parseInt(st.nextToken());
                int width = Integer.parseInt(st.nextToken());
                boxes[i] = new Box(width, length);
            }
            Arrays.sort(boxes);
//            for (Box box : boxes) {
//                System.out.println("box.length = " + box.length);
//                System.out.println("box.width = " + box.width);
//                System.out.println("box.area = " + box.length * box.width);
//            }
            int cnt = 0;
            for (int i = 0; i < N; ++i) {
                if (J <= 0) {
                    cnt = i;
                    break;
                }
                int area = boxes[i].length * boxes[i].width;
                J -= area;
            }
            ans.append(cnt + "\n");
        }
        

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
