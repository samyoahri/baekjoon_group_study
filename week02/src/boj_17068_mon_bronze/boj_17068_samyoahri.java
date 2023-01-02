package boj_17068_mon_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_17068_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int cntBar = Integer.parseInt(in.readLine());
        int[] heightBar = new int[cntBar];
        for(int i = 0; i < cntBar; i++){
            heightBar[i] = Integer.parseInt(in.readLine());
        }
        for(int i = cntBar-1; i>=0; i--){
            if(stack.isEmpty()){
                stack.push(heightBar[i]);
            }
            else{
                if(stack.peek()<heightBar[i])
                    stack.push(heightBar[i]);
                else{
                    continue;
                }
            }
        }
        System.out.println(stack.size());
    }
}
