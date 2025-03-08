package Free;

import java.io.*;
import java.util.Scanner;

public class boj_2745_samyoahri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int N = sc.nextInt();
        int tmp = 1;
        int ans = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);

            if('A'<= c && c <= 'Z') {
                ans += (c-'A'+10)*tmp;
            }else {
                ans += (c-'0')*tmp;
            }
            tmp *= N;
        }

        System.out.println(ans);
    }
}
