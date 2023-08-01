package week27.src.boj_9012_Thu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_9012_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());

        int T = Integer.parseInt(st.nextToken());

        String linePS = " ";

        while(T-- > 0){
            Stack<Character> checkPS = new Stack<Character>();
            linePS = in.readLine();

            for(int i=0; i<linePS.length(); i++){
                if(linePS.charAt(i) == '('){
                    checkPS.push(linePS.charAt(i));
                }
                else if(linePS.charAt(i) == ')' && !checkPS.isEmpty()){
                    checkPS.pop();
                }
                else if(linePS.charAt(i) == ')' && checkPS.isEmpty()){
                    checkPS.push(linePS.charAt(i));
                    break;
                }
            }

            if(checkPS.isEmpty()){
                ans.append("YES").append("\n");
            }
            else{
                ans.append("NO").append("\n");
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
