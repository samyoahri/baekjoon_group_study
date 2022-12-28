package boj_1000_wed;


import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;

public class boj_1000_samyoahri {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(a+b);

    }

}