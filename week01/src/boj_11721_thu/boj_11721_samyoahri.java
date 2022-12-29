package boj_11721_thu;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class boj_11721_samyoahri{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int n = str.length()/10;
        int idx = 0;
        for(int i = 0; i < n; i++){
            System.out.println(str.substring(idx, idx+10));
            idx +=10;
        }
        n = str.length()%10;
        System.out.println(str.substring(idx, str.length()));
    }


}