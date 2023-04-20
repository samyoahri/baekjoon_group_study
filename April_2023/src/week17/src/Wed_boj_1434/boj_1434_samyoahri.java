package Wed_boj_1434;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1434_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //박스의 개수
        int N = Integer.parseInt(st.nextToken());
        //책의 개수
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(in.readLine(), " ");
        int boxSize[] = new int[N];
        int boxes[] = new int[N];
        for (int i = 0; i < N; ++i) {
            boxSize[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(in.readLine(), " ");
        int books[] = new int[M];
        for (int i = 0; i < M; ++i) {
            books[i] = Integer.parseInt(st.nextToken());
        }
        int j = 0;
        for (int i = 0; i < M; ++i) {
            if (boxSize[j] >= boxes[j] + books[i]) {
                boxes[j] += books[i];
            }
            else{
                while(true){
                    ++j;
                    if (boxSize[j] >= boxes[j] + books[i]) {
                        boxes[j] += books[i];
                        break;
                    }
                }
            }
        }
        int res = 0;
        for (int i = 0; i < N; ++i) {
            res += (boxSize[i] - boxes[i]);
        }
        ans.append(res);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
