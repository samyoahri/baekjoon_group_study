package week27.src.boj_1874_Sat;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class boj_1874_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int n = Integer.parseInt(in.readLine());

        ArrayList<Integer> anslist = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int stackCount = 1;
        int inputCheck = 0;
        stack.push(stackCount);
        ans.append("+\n");

        while(anslist.size() < n){
            if(inputCheck == 0){
                inputCheck = Integer.parseInt(in.readLine());
            }

            if(!stack.isEmpty() && stack.peek() == inputCheck){
                anslist.add(stack.peek());
                stack.pop();
                ans.append("-\n");
                inputCheck = 0;
            }
            else if(stack.isEmpty() || stack.peek() < inputCheck){
                stackCount++;
                stack.push(stackCount);
                ans.append("+\n");
            }
            else if(stack.peek() > inputCheck || stack.contains(inputCheck)){
                ans.setLength(0);
                ans.append("NO");
                break;
            }
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
