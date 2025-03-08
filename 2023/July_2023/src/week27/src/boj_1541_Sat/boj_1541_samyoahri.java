package boj_1541_Sat;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_1541_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String str = in.readLine();
        StringTokenizer st = new StringTokenizer(str, "+-", true);

        ArrayList<Integer> operands = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();

        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            if (tmp.equals("+") || tmp.equals("-")) {
                operators.add(tmp);
            }
            else{
                operands.add(Integer.parseInt(tmp));
            }
        }

        boolean negativeChecked = false;
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        sum += operands.get(0);
        for (int i = 1, j = 0; i < operands.size(); ++i, ++j) {
            if (operators.get(j).equals("-")) {
                negativeChecked = true;
            }
            if (negativeChecked) {
                stack.push(operands.get(i));
            }
            else{
                sum += operands.get(i);
            }
        }
        while (!stack.isEmpty()) {
            sum -= stack.pop();
        }
        ans.append(sum);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
