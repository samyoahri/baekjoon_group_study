package boj_10773_wed;

import java.io.*;
import java.util.Stack;

public class boj_10773_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(in.readLine());

        for(int i = 0; i < k; i++){
            int num = Integer.parseInt(in.readLine());
            if(num==0){
                if(stack.isEmpty())
                    out.write("Error");
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            int stackNum = stack.pop();
            sum+=stackNum;
        }
//        StringBuilder sb = new StringBuilder();
//        String res = sb.append(sum);
        String res = Integer.toString(sum);
        out.write(res);
//        System.out.println(res);
        out.flush();
        out.close();
    }
}
