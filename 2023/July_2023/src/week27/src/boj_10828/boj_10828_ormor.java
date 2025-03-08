package week27.src.boj_10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class boj_10828_ormor {

    public static ArrayList<Integer> bojStack = new ArrayList<>();
    public static int N = 0; // 명령의 수(=스택 크기)

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(in.readLine());
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        N = Integer.parseInt(in.readLine());

        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(in.readLine());
            switch (st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    ans.append(pop()).append("\n");
                    break;
                case "size":
                    ans.append(size()).append("\n");
                    break;
                case "empty":
                    ans.append(empty()).append("\n");
                    break;
                case "top":
                    ans.append(top()).append("\n");
                    break;
            }
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }

    public static void push(int x){
        bojStack.add(x);
    }
    public static int pop(){
        if (bojStack.isEmpty()){
            return -1;
        }
        else
            return bojStack.remove(bojStack.size()-1);
    }
    public static int size(){
        return bojStack.size();
    }
    public static int empty(){
        if(bojStack.isEmpty())
            return 1;
        else
            return 0;
    }
    public static int top(){
        if(bojStack.isEmpty())
            return -1;
        else
            return bojStack.get(bojStack.size()-1);
    }
}
