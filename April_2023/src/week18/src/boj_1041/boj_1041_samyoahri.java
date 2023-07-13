package boj_1041;

import java.io.*;
import java.util.StringTokenizer;

public class boj_1041_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int minNumInDice = Integer.MAX_VALUE;
        int maxNumInDice = Integer.MIN_VALUE;
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        int[] dice = new int[6];
        for (int i = 0; i < 6; ++i) {
            dice[i] = Integer.parseInt(st.nextToken());
            if (minNumInDice > dice[i]) {
                minNumInDice = dice[i];
            }
            if (maxNumInDice < dice[i]) {
                maxNumInDice = dice[i];
            }
        }
//        System.out.println("minNumInDice = " + minNumInDice);
//        System.out.println("maxNumInDice = " + maxNumInDice);
        int min2D = Integer.MAX_VALUE;
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                if ((i == j)
                        || (i == 0 && j == 5) || (i == 1 && j == 4) || (i == 2 && j == 3)
                        || (i == 5 && j == 0) || (i == 4 && j == 1) || (i == 3 && j == 2)) {
                    continue;
                }
                min2D = Math.min(min2D, dice[i] + dice[j]);
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
//                System.out.println("dice[i] = " + dice[i]);
//                System.out.println("dice[j] = " + dice[j]);
//                System.out.println("(dice[i]+dice[j]) = " + (dice[i]+dice[j]));
            }
        }
//        System.out.println("min2D = " + min2D);
        int min3D = Integer.MAX_VALUE;
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                if ((i == j)
                        || (i == 0 && j == 5) || (i == 1 && j == 4) || (i == 2 && j == 3)
                        || (i == 5 && j == 0) || (i == 4 && j == 1) || (i == 3 && j == 2)) {
                    continue;
                }
                for (int k = 0; k < 6; ++k) {
                    if (k == i || k == j
                            || (k == 0 && j == 5) || (k == 1 && j == 4) || (k == 2 && j == 3)
                            || (k == 5 && j == 0) || (k == 4 && j == 1) || (k == 3 && j == 2)
                            || (i == 0 && k == 5) || (i == 1 && k == 4) || (i == 2 && k == 3)
                            || (i == 5 && k == 0) || (i == 4 && k == 1) || (i == 3 && k == 2)) {
                        continue;
                    }
                    min3D = Math.min(min3D, dice[i] + dice[j] + dice[k]);
                }
            }
        }
//        System.out.println("min3D = " + min3D);
        long minSquare = 0;
        if (N == 1) {
            for (int i = 0; i < 6; ++i) {
                minSquare += dice[i];
            }
            minSquare -= maxNumInDice;
        }
        else{
            //꼭지접
            minSquare += (min2D * 4L) + (min3D * 4L);
            if (N >= 3) {
                //가운데
                minSquare += (minNumInDice * (long)Math.pow(N - 2, 2) * 5);
                //꼭지점과 아래층을 제외한 사이드
//                System.out.println("(min2D * N - 2 * 8) = " + (min2D * N - 2 * 8));
                minSquare += (min2D * (N - 2) * 8L);
                //아래층 사이드
                minSquare += (minNumInDice * (N - 2) * 4L);
            }
        }
        ans.append(minSquare);


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
