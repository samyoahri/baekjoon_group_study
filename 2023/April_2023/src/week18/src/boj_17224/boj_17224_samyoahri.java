package boj_17224;

import java.io.*;
import java.util.*;


public class boj_17224_samyoahri {
     static class Problem implements Comparable<Problem>{
        int easy;
        int hard;

        public Problem(int easy, int hard) {
            this.easy = easy;
            this.hard = hard;
        }

        @Override
        public int compareTo(Problem o1) {
            if (this.hard != o1.hard) {
                return this.hard - o1.hard;
            }
            else{
                return this.easy - o1.easy;
            }
        }
    }
    static int N;
    static int L;
    static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        //역량
        L = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        List<Problem> problems = new ArrayList<>();
//        Problem problems[] = new Problem[N];
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine(), " ");
            int easy = Integer.parseInt(st.nextToken());
            int hard = Integer.parseInt(st.nextToken());
            problems.add(new Problem(easy, hard));
        }
        Collections.sort(problems);

        int score = 0;
        for (int i = 0; i < N; ++i) {
            if (K == 0) {
                break;
            }
            if (L >= problems.get(i).hard) {
                score += 140;
                K--;
            } else if (L >= problems.get(i).easy) {
                score += 100;
                K--;
            }
        }
        ans.append(score);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
