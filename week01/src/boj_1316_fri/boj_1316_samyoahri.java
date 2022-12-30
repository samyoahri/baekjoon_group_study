package boj_1316_fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class boj_1316_samyoahri {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static boolean check(String word) throws IOException{
        int[] alphabet_list = new int[26];
        Arrays.fill(alphabet_list, 0);
        int j1 = -1, j2 = -1;
        for(int i = 0; i < word.length(); i++){
            j1 = word.charAt(i) - 'a';
            if(alphabet_list[j1]==0){
                alphabet_list[j1]++;
                j2=j1;
            }
            else{
                if(j1==j2){
                    alphabet_list[j1]++;
                    j2 = j1;
                }
                else{
                    alphabet_list[j1] = -1;
                }
            }
        }
        for(int i = 0; i < alphabet_list.length; i++){
            if(alphabet_list[i]==-1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int res = 0;
        for(int i = 0; i < n ; i++){
            String word = bf.readLine();
            if(check(word)==true){
                res++;
            }

        }

        System.out.println(res);
        bf.close();
//        sc.close();
    }
}
