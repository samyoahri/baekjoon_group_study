package Free;

import java.io.*;

public class boj_2661_samyoahri {
    static int[] sst;
    static boolean[] visited;
    static int cnt = 0;
    static void printSST(){
        for (int integer : sst) {
            System.out.print(integer);
        }
        System.out.println();
    }
    static void dfs(int depth) {
//        int[] sst = new int[N];
        //중단조건
        if (depth == N) {
            printSST();
            System.exit(0);
            return;
        }
        //dfs문
        for (int i = 1; i <= 3; i++) {
            if (promising(depth, i)) {
                sst[depth] = i;
                dfs(depth + 1);
                sst[depth] = 0;
            }
        }
    }

    static boolean promising(int idx, int num) {
        sst[idx] = num;
        int len = idx + 1;

        for (int i = len - 1, j = i - 1, cnt = 1
             ; cnt <= len / 2
                ; ++cnt, --i, j = i - cnt) {
            int subSeq1 = makeNum(i, len);
            int subSeq2 = makeNum(j, i);
            if (subSeq2 == subSeq1) {
                sst[idx] = 0;
                return false;
            }
        }
        return true;
    }

    static int makeNum(int start, int end) {
        int res = 0;
        for (int i = start; i < end; i++) {
            res *= 10;
            res += sst[i];
        }
        return res;
    }
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        N = Integer.parseInt(in.readLine());
        sst = new int[N];
        visited = new boolean[N];
        dfs(0);

//        for (int integer : sst) {
//            ans.append(integer);
//        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}

//package Free;
//
//import java.io.*;
//
//public class boj_2661_samyoahri {
//    static int[] sst;
//    static boolean[] visited;
//    static int cnt = 0;
//    static void printSST(){
//        for (int integer : sst) {
//            System.out.print(integer);
//        }
//        System.out.println();
//    }
//    static void dfs(int depth) {
////        int[] sst = new int[N];
//        //중단조건
//        if (depth == N) {
//            printSST();
//            System.exit(0);
//            return;
//        }
//        //dfs문
//        for (int i = 0; i < N; i++) {
//            if (!visited[i]) {
//                int j = 0;
//                boolean check = false;
//                for (j = 1; j <= 3; j++) {
//                    if (promising(i, j)) {
//                        check = true;
//                        break;
//                    }
//                }
//                if (check) {
//                    visited[i] = true;
//                    sst[depth] = j;
//                    dfs(depth + 1);
//                    visited[i] = false;
//                }
//            }
////            for (int j = 1; j <= 3; j++) {
////                if (promising()) {
////                    break;
////                }
////            }
////            if (!visited[i]) {
////                sst[i] = intputSST(i);
////                visited[i] = true;
////                dfs(depth + 1);
////            }
//        }
//    }
//
//    static boolean promising(int idx, int num) {
//        sst[idx] = num;
//        int len = idx + 1;
//
//        for (int i = len - 1, j = i - 1, cnt = 1
//             ; cnt <= len / 2
//                ; ++cnt, --i, j = i - cnt) {
//            int subSeq1 = makeNum(i, len);
//            int subSeq2 = makeNum(j, i);
//            if (subSeq2 == subSeq1) {
//                sst[idx] = 0;
//                return false;
//            }
//        }
//
//
////        for (int i = 1; i <= len / 2; i++) {
////            int subSeq1 = makeNum(len - i * 2, len - i);
////            int subSeq2 = makeNum(len - i, len);
////            if (subSeq2 == subSeq1) {
////                sst[idx] = 0;
////                return false;
////            }
////        }
//
//        return true;
//    }
//
//    static int makeNum(int start, int end) {
//        int res = 0;
//        for (int i = start; i < end; i++) {
//            res *= 10;
//            res += sst[i];
//        }
//        return res;
//    }
//    static int N;
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        N = Integer.parseInt(in.readLine());
//        sst = new int[N];
//        visited = new boolean[N];
//        dfs(0);
//
////        for (int integer : sst) {
////            ans.append(integer);
////        }
//
//        out.write(ans.toString());
//        out.flush();
//        in.close();
//        out.close();
//    }
//}
