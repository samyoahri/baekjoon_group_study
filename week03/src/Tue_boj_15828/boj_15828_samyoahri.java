package Tue_boj_15828;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class boj_15828_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        Queue<Integer> buf = new LinkedList<>();
        int data;

        int n = Integer.parseInt(in.readLine());

        while(-1 != (data = Integer.parseInt(in.readLine()))){
            //dequeue
            if(data==0){
                buf.poll();
            }
            //enqueue
            else if (data > 0) {
                if (buf.size() >= n) {
                    continue;
                }
                else{
                    buf.add(data);
                }
            }
            else{
                System.out.println("입력값 오류입니다.");
            }
        }
        if(buf.isEmpty()){
            ans.append("empty");
        }
        else{
            while (!buf.isEmpty()) {
                ans.append(buf.poll() + " ");
            }
        }


        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
