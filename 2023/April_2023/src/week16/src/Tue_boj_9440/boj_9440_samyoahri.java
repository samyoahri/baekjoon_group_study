package Tue_boj_9440;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_9440_samyoahri {

    static void swap(int[] arr, int zeroCnt) {
        if (zeroCnt == 1) {
            int tmp = arr[0];
            arr[0] = arr[2];
            arr[2] = tmp;
        } else if (zeroCnt >= 2) {
            int tmp1 = arr[0];
            int tmp2 = arr[1];
            arr[0] = arr[zeroCnt];
            arr[1] = arr[zeroCnt + 1];
            arr[zeroCnt] = tmp1;
            arr[zeroCnt+1] = tmp2;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) {
                break;
            }
            int[] arr = new int[N];
            int zeroCnt = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i]==0) zeroCnt++;
            }
            Arrays.sort(arr);
            swap(arr, zeroCnt);
//            for (int integer : arr) {
//                System.out.print(integer + " ");
//            }
//            System.out.println();

            StringBuilder tmp1 = new StringBuilder();
            StringBuilder tmp2 = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    tmp1.append(arr[i]);
                }
                else{
                    tmp2.append(arr[i]);
                }
            }
            long res = Long.parseLong(tmp1.toString()) + Long.parseLong(tmp2.toString());
            ans.append(res + "\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
