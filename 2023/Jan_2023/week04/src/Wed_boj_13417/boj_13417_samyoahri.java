package Wed_boj_13417;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class boj_13417_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        //테스트 케이스 수
        int T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            //카드의 수
            int n = Integer.parseInt(in.readLine());
            Deque<Character> deque = new ArrayDeque<>();
            String[] str = in.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                char c = str[j].charAt(0);
                if (deque.isEmpty()) {
                    deque.add(c);
                }
                else{
                    if(deque.peek()<c){
                        deque.addLast(c);
                    }
                    else{
                        deque.addFirst(c);
                    }
                }
            }
            while (!deque.isEmpty()) {
                ans.append(deque.poll());
            }
            ans.append("\n");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
