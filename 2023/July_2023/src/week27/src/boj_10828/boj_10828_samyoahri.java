package boj_10828;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_10828_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine());
            String str = st.nextToken();
            int num;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
            else{
                if (str.equals("pop")) {
                    if (!stack.isEmpty()) {
                        ans.append(stack.pop() + "\n");
                    }
                    else{
                        ans.append("-1\n");
                    }
                } else if (str.equals("size")) {
                    ans.append((stack.size() + "\n"));
                } else if (str.equals("empty")) {
                    if (!stack.isEmpty()) {
                        ans.append("0\n");
                    }
                    else{
                        ans.append("1\n");
                    }
                } else if (str.equals("top")) {
                    if (!stack.isEmpty()) {
                        ans.append(stack.peek() + "\n");
                    }
                    else
                        ans.append("-1\n");
                }
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
