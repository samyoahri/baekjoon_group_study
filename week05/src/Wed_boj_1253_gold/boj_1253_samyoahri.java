package Wed_boj_1253_gold;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1253_samyoahri {
//안되는코드
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int N = Integer.parseInt(in.readLine());
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        int num[] = new int[N];
//        for (int i = 0; i < N; i++) {
//            num[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(num);
//
//        int cnt = 0;
//        int target = 0;
//        int start, end, mid=0, fix, mid1, mid2;
//        for (int i = 0; i < N; i++) {
//            target = num[i];
//            int idx = 0;
////            System.out.println("[i = " + i+"]");
//            for (int j = 0; j < N; j++) {
//                start = 0; end = N-1;
//                fix = j;
//                if (fix == i) {
////                    fix++;
//                    continue;
//                }
////                System.out.println("j = " + j);
//                idx = 0;
////                if( checkBinSearch(num, target, start, end, fix, i, j) ){
////                    cnt++;
////                    break;
////                }
//                while (true) {
//                    mid = (start+end)/2;
//                    if (start > end) {
//                        break;
//                    }
//                    if (target == num[mid] + num[fix]) {
//                        cnt++;
//                        if (mid == i || mid==j) {
//                            cnt--;
//                            start = mid+2;
//                            continue;
//                        }
//                        break;
//
//                    } else if (target >= num[mid] + num[fix]) {
//                        start = mid+1;
//                    }else{
//                        end = mid-1;
//                    }
//                }
//                if (target == num[mid] + num[fix]) {
////                    System.out.print("mid = " + mid);System.out.print("  fix = " + fix);System.out.println(" =>true");
////                    System.out.println("<cnt = " + cnt+">");
//                    break;
//                }
//            }
////            while (start <= end) {
////                mid = (start+end)/2;
////                if (mid == i) {
////                    mid++;
////                }
////
////
////                if (num[mid] == target) {
////                    cnt++;
////                    break;
////                } else if (num[mid] <= target) {
////                    start = mid+1;
////                } else{
////                    end = mid -1;
////                }
////            }
//
//        }
//
////        while (target != N) {
////            if (num[target] == num[start] + num[end]) {
////                start = 0; end = N-1;
////                target++;
////                cnt++;
////                continue;
////            }
////            else if (start == N - 1) {
////                start = 0; end = N-1;
////                target++;
////                continue;
////            }
////        }
//
//        ans.append(cnt);
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
