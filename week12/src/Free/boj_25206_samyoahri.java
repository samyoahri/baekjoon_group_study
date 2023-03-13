package Free;

import java.io.*;
import java.util.StringTokenizer;

public class boj_25206_samyoahri {
    static double gradize(String gradeStr) {
        double grade = 0.0;
        if (gradeStr.equals("A+")) {
            grade = 4.5;
        } else if (gradeStr.equals("A0")) {
            grade = 4.0;
        } else if (gradeStr.equals("B+")) {
            grade = 3.5;
        } else if (gradeStr.equals("B0")) {
            grade = 3.0;
        } else if (gradeStr.equals("C+")) {
            grade = 2.5;
        } else if (gradeStr.equals("C0")) {
            grade = 2.0;
        } else if (gradeStr.equals("D+")) {
            grade = 1.5;
        } else if (gradeStr.equals("D0")) {
            grade = 1.0;
        } else if (gradeStr.equals("F")) {
            grade = 0.0;
        }else{
            grade = 0.0;
        }
        return grade;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        double avg = 0.0, tot = 0.0, totCredit = 0.0;
        StringTokenizer st;
        for (int o = 0; o < 20; o++) {
            st = new StringTokenizer(in.readLine(), " ");
            String title = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String gradeStr = st.nextToken();
            if (!gradeStr.equals("P")) {
                totCredit += credit;
            }
            double grade = gradize(gradeStr);
            tot += credit * grade;
        }
        avg = tot / totCredit;
        ans.append(avg);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
