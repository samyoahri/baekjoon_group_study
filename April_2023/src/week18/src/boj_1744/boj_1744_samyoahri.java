package boj_1744;

import java.io.*;
import java.util.Arrays;

public class boj_1744_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int[] arr = new int[N];
        int negativeNumCnt = 0, positiveNumCnt = 0, zeroNumCnt = 0;
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(in.readLine());
            if (arr[i] > 0) {
                ++positiveNumCnt;
            } else if (arr[i] < 0) {
                ++negativeNumCnt;
            } else{
                ++zeroNumCnt;
            }
        }
        Arrays.sort(arr);
        int tot = 0;
        int oddNegativeIdx = -1;
        int oddPositiveIdx = -1;
//        System.out.println("positiveNumCnt = " + positiveNumCnt);
//        System.out.println("negativeNumCnt = " + negativeNumCnt);
//        System.out.println("zeroNumCnt = " + zeroNumCnt);
        if (negativeNumCnt % 2 == 0) {
            for (int i = 0; i < negativeNumCnt; i = i + 2) {
                tot += arr[i] * arr[i + 1];
//                System.out.println("i = " + i);
//                System.out.println("음수 곱: " + (arr[i] * arr[i + 1]));
            }

        }
        else{
            for (int i = 0; i < negativeNumCnt - 1; i = i + 2) {
                tot += arr[i] * arr[i + 1];
//                System.out.println("i = " + i);
//                System.out.println("음수 곱: " + (arr[i] * arr[i + 1]));
            }
            oddNegativeIdx = negativeNumCnt - 1;
        }
        if (positiveNumCnt % 2 == 0) {
            for (int i = N - 1; i >= negativeNumCnt + zeroNumCnt; i = i - 2) {
                if (arr[i] == 1 || arr[i - 1] == 1) {
                    tot += (arr[i] + arr[i - 1]);
                }
                else{
                    tot += arr[i] * arr[i - 1];
                }

//                System.out.println("[i = " + i + "]");
//                System.out.println("양수 곱: " + (arr[i] * arr[i - 1]));
            }
        }
        else{
            for (int i = N - 1; i >= negativeNumCnt + zeroNumCnt + 1; i = i - 2) {
                if (arr[i] == 1 || arr[i - 1] == 1) {
//                    tot += 2;
                    tot += (arr[i] + arr[i - 1]);
                }
                else{
                    tot += arr[i] * arr[i - 1];
                }
//                System.out.println("[i = " + i + "]");
//                System.out.println("양수 곱: " + (arr[i] * arr[i - 1]));
            }
            oddPositiveIdx = negativeNumCnt + zeroNumCnt;
        }
//        System.out.println("oddNegativeIdx = " + oddNegativeIdx);
//        System.out.println("oddPositiveIdx = " + oddPositiveIdx);
//        System.out.println("zeroNumCnt = " + zeroNumCnt);
        if (oddNegativeIdx != -1) {
            if (oddPositiveIdx != -1) {
                if (zeroNumCnt != 0) {
                    tot += arr[oddNegativeIdx] * 0;
                    tot += arr[oddPositiveIdx];
                }
                else{
                    tot += arr[oddNegativeIdx];
                    tot += arr[oddPositiveIdx];
                }
            }
            else{
                if (zeroNumCnt != 0) {
                    tot += arr[oddNegativeIdx] * 0;
                }
                else{
                    tot += arr[oddNegativeIdx];
                }
            }
        }
        else{
            if (oddPositiveIdx != -1) {
                tot += arr[oddPositiveIdx];
            }
        }
        ans.append(tot);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
