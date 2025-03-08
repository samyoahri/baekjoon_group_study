package week01.Thu_boj_12789;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_12789_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(in.readLine()); // (입력) 대기 학생 수
        st = new StringTokenizer(in.readLine()); // (입력) 대기 학생들이 가진 번호표 순서 입력

        int turnNumber = 1;                      // 지금 호출 번호
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> student = new ArrayList<>(); // 대기 학생 번호표 순서 저장

        for(int i=0; i<N; i++) {
            student.add(Integer.parseInt(st.nextToken()));
        }

        while(true){
            if(turnNumber > N){
                ans.append("Nice");
                break;
            }
            if(!student.isEmpty() && student.get(0) == turnNumber){
                student.remove(0);
                turnNumber++;
                continue;
            }
            if(!stack.isEmpty() && stack.peek() == turnNumber){
                stack.pop();
                turnNumber++;
                continue;
            }
            if(!student.isEmpty()){
                stack.push(student.get(0));
                student.remove(0);
                continue;
            }
            ans.append("Sad");
            break;
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
