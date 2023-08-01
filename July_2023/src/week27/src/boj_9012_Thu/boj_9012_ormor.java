package week27.src.boj_9012_Thu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class boj_9012_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());

        int T = Integer.parseInt(st.nextToken());
        // Stack<Character> checkPS = new Stack<Character>();
        StringBuilder test = new StringBuilder();
        String test1 = " ";

        while(T-- > 0){
            Stack<Character> checkPS = new Stack<Character>();
            // test.append(in.readLine());
            test1 = in.readLine();
            // System.out.println(test1.length());
            for(int i=0; i<test1.length(); i++){
                if(test1.charAt(i) == '('){
                    checkPS.push(test1.charAt(i));
                    //System.out.println("경우 1 괄호 열기: push(");
                }
                else if(test1.charAt(i) == ')' && !checkPS.isEmpty()){
                    checkPS.pop();
                    //System.out.println("경우 2 괄호 닫기: pop(");
                }
                else if(test1.charAt(i) == ')' && checkPS.isEmpty()){

                    checkPS.push(test1.charAt(i));
                    //System.out.println("무조껀 NO");
                    break;
                }
            }



            if(checkPS.isEmpty()){
                ans.append("YES").append("\n");
            }
            else{
                ans.append("NO").append("\n");
            }
            //System.out.println("while"+T+"번남음");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
