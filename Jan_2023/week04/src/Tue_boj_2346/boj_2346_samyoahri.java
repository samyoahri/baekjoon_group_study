package Tue_boj_2346;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

class Ballon{
    int idx;
    int command;

    public Ballon(int idx, int command) {
        this.idx = idx;
        this.command = command;
    }
}
public class boj_2346_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        //풍선의 갯수
        int n = Integer.parseInt(in.readLine());
        //명령어
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int[] commands = new int[n+1];
        int idx = 1;
        while (st.hasMoreTokens()) {
            commands[idx++] = Integer.parseInt(st.nextToken());
        }

        Deque<Ballon> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.add(new Ballon(i, commands[i]));
//            System.out.print("[i = " + i + "]  ");
//            System.out.println("commands[i] = " + commands[i]);
        }
        for (int i = 1; i < n; i++) {
            Ballon ballon = deque.peek();
            int ballonNum = ballon.idx;
            int ballonCommand = ballon.command;
            ans.append(ballonNum + " ");
            int cnt = 0;
            if (ballonCommand > 0) {
                while (ballonCommand > 0) {
                    if (++cnt == 1) {
                        deque.poll();
                    }
                    else{
                        deque.addLast(deque.pollFirst());
                    }
                    ballonCommand--;
                }
            }
            else if (ballonCommand < 0) {
                while (ballonCommand < 0) {
                    if (++cnt == 1) {
                        deque.poll();
                        deque.addFirst(deque.pollLast());
                    }
                    else{
                        deque.addFirst(deque.pollLast());
                    }
                    ballonCommand++;
                }
            }
        }
        while (!deque.isEmpty()) {
            Ballon ballon1 = deque.poll();
            ans.append(ballon1.idx);
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
