package Tue_boj_11034;

import java.io.*;
import java.util.StringTokenizer;

public class boj_11034_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

//        String str;
//        StringTokenizer st;
//        while ((str = in.readLine()) != null ) {
//            st = new StringTokenizer(str);
//            int start = Integer.parseInt(st.nextToken());
//            int mid = Integer.parseInt(st.nextToken());
//            int end = Integer.parseInt(st.nextToken());
//            int midLeft = mid - 1;
//            int midRight = mid + 1;
//            ans.append(Math.max((midLeft - start), (end - midRight)) + "\n");
//    }
//        String str;
//        StringTokenizer st;
//        while ((st = new StringTokenizer(in.readLine(), " ")) != null ) {
//            int start = Integer.parseInt(st.nextToken());
//            int mid = Integer.parseInt(st.nextToken());
//            int end = Integer.parseInt(st.nextToken());
//            int midLeft = mid - 1;
//            int midRight = mid + 1;
//            ans.append(Math.max((midLeft - start), (end - midRight)) + "\n");
//        }
        String str;
        while ((str = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int start = Integer.parseInt(st.nextToken());
            int mid = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int midLeft = mid - 1;
            int midRight = mid + 1;
            ans.append(Math.max((midLeft - start), (end - midRight)) + "\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
