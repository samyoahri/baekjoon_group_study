package week01.Tue_boj_11256;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj_11256_ormor {
    static int T, J, N, R, C; // testcase 개수, 사탕 개수, 상자 개수, 상자 세로 길이, 상자 가로 길이
    static ArrayList<Integer> boxSize;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;

        T = Integer.parseInt(in.readLine());

        while(T-- > 0){
            st = new StringTokenizer(in.readLine());
            J = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            boxSize = new ArrayList<>();
            // boxSize = new int[N];

            for(int i=0; i<N; i++){
                st = new StringTokenizer(in.readLine());
                R = Integer.parseInt(st.nextToken());
                C = Integer.parseInt(st.nextToken());
                boxSize.add(R*C);
            }

            boxSize.sort(Comparator.reverseOrder());

            int boxCount = 0;
            while(J>0 && !boxSize.isEmpty()){
                J = J-boxSize.get(boxCount);
                boxCount++;
            }
            ans.append(boxCount).append("\n");
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
