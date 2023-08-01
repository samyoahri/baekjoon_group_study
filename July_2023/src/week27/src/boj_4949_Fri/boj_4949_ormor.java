package week27.src.boj_4949_Fri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_4949_ormor {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(in.readLine(),".");

        while(true){
            String line = in.readLine();

            if(line.equals(".")){
                break;
            }
            else{
                ans.append(balanceString(line)).append("\n");
            }
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }

    private static String balanceString(String line){
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<line.length(); i++){
            if(line.charAt(i) == '(' || line.charAt(i) == '['){
                stack.push(line.charAt(i));
            }
            else if(line.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else
                    return "no";
            }
            else if(line.charAt(i) == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
                else
                    return "no";
            }
        }
        if (stack.isEmpty())
            return "yes";
        else
            return "no";
    }
}
