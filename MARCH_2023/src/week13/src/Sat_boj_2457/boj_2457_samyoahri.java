package Sat_boj_2457;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Flower implements Comparable<Flower>{
    int start;
    int end;

    public Flower(int startMonth, int startDay, int endMonth, int endDay) {
        this.start = changeToNum(startMonth, startDay);
        this.end = changeToNum(endMonth, endDay);
    }

    @Override
    public int compareTo(Flower o) {
        if (this.start > o.start) {
            return 1;
        } else if (this.start == o.start) {
//            return 0;
            if (this.end > o.end) {
                return 1;
            } else if (this.end == o.end) {
                return 0;
            } else{
                return -1;
            }
        } else {
            return -1;
        }
    }

    private int changeToNum(int month, int day) {
        return (month * 100) + day;
//        int tempMonth = month;
//        int tempDay = day;
//        if (tempMonth == 1 || tempMonth == 2) {
//            tempMonth = 3;
//            tempDay = 1;
//        }
//        if (tempMonth == 12) {
//            tempMonth = 11;
//            tempDay = 30;
//        }
//        return (tempMonth * 100) + (tempDay);
    }
}
public class boj_2457_samyoahri {
    static int nov30 = 1131;
    static int dec01 = 1201;
    static int march01 = 301;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        Flower[] flowers = new Flower[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int startMonth = Integer.parseInt(st.nextToken());
            int startDay = Integer.parseInt(st.nextToken());
            int endMonth = Integer.parseInt(st.nextToken());
            int endDay = Integer.parseInt(st.nextToken());
            flowers[i] = new Flower(startMonth, startDay, endMonth, endDay);
        }
        Arrays.sort(flowers);
//        for (int i = 0; i < N; i++) {
//            System.out.println("i = " + i);
//            System.out.println("flowers[i].start = " + flowers[i].start);
//            System.out.println("flowers[i].end = " + flowers[i].end);
//        }
        int startDay = march01;
        int maxEndDay = 0;
        int cnt = 0, idx = 0;
        while (startDay < dec01) {
            boolean isDetected = false;
            //for문에서 시작일을 지킬 수 있고, 꽃이 끝나는일이 가장 긴 꽃을 찾을 예정임
            for (int i = idx; i < N; i++) {
                //시작날짜는 반드시 꽃의 시작날짜이상이어야함
                //즉, 시작날짜가 꽃의 시작날짜보다 작으면 시작일을 지킬 수 없음
                if (startDay < flowers[i].start) {
                    break;
                }
                //최대길이를 찾아야함
                if (maxEndDay < flowers[i].end) {
                    maxEndDay = flowers[i].end;
                    isDetected = true;
                    idx = i + 1;
                }
            }
            if (isDetected) {
                ++cnt;
                startDay = maxEndDay;
            }
            else{
                break;
            }
        }
        if (maxEndDay >= dec01) {
            ans.append(cnt);
        }
        else{
            ans.append(0);
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
