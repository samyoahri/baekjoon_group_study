package week01.Mon_boj_17413;

import java.io.*;
import java.util.Stack;
// import java.util.StringTokenizer;

public class boj_17413_ormor{
    static char check;
    static int tag = 0;
    static StringBuilder ans;
    static Stack<Character> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        ans = new StringBuilder();

        String line = in.readLine();
        stack = new Stack<Character>();

        for(int i=0; i<line.length(); i++){
            check = line.charAt(i);

            if(check == '<'){
                tag = 1;
                appendStackpop();
                ans.append('<');
                continue;
            }
            else if(check == '>'){
                tag = 0;
                ans.append('>');
                continue;
            }

            if(tag == 0){
                if(check == ' ' ){
                    appendStackpop();
                    ans.append(' ');
                }
                else{
                    stack.push(check);
                }

                if(i==line.length()-1){
                    appendStackpop();
                }
            }
            else{
                ans.append(check);
            }
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
    private static void appendStackpop(){
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
    }
}