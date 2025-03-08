package boj_1931_Thu;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
class Meeting{
    private int start;
    private int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getLen(){
        return end - start;
    }

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class boj_1931_samyoahri_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st;
        ArrayList<Meeting> schedule = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            schedule.add(new Meeting(start, end));
        }
        schedule.sort(new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if (o1.getEnd() < o2.getEnd()) {
                    return -1;
                } else if (o1.getEnd() == o2.getEnd()) {
                    if (o1.getStart() < o2.getStart()) {
                        return -1;
                    } else if (o1.getStart() == o2.getStart()) {
                        return 0;
                    } else{
                        return 1;
                    }
                } else{
                    return 1;
                }
            }
        });

        int cnt = 0, prevEndTime = 0;
        for (int i = 0; i < schedule.size(); ++i) {
            if (prevEndTime <= schedule.get(i).getStart()) {
                ++cnt;
                prevEndTime = schedule.get(i).getEnd();
            }
        }
        ans.append(cnt);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
