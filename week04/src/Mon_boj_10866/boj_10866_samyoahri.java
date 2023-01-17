package Mon_boj_10866;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj_10866_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int n = Integer.parseInt(in.readLine());

        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            String command = st.nextToken();
            int x = -2147000000;
            if (st.hasMoreTokens()) {
                x = Integer.parseInt(st.nextToken());
            }
            if (command.equals("push_front")) {
                deque.addFirst(x);
            } else if (command.equals("push_back")) {
                deque.addLast(x);
            } else if (command.equals("pop_front")) {
                if (deque.isEmpty()) {
                    ans.append(-1 + "\n");
                }
                else{
                    int output = deque.removeFirst();
                    ans.append(output+ "\n");
                }
            } else if (command.equals("pop_back")) {
                if (deque.isEmpty()) {
                    ans.append(-1 + "\n");
                }
                else{
                    int output = deque.removeLast();
                    ans.append(output + "\n");
                }
            } else if (command.equals("size")) {
                int output = deque.size();
                ans.append(output + "\n");
            } else if (command.equals("empty")) {
                int output;
                if (deque.isEmpty()) {
                    output = 1;
                }
                else{
                    output = 0;
                }
                ans.append(output + "\n");
            } else if (command.equals("front")) {
                int output;
                if (deque.isEmpty()) {
                    output = -1;
                }else{
                    output = deque.peekFirst();
                }
                ans.append(output + "\n");
            } else if (command.equals("back")) {
                int output;
                if (deque.isEmpty()) {
                    output = -1;
                }else{
                    output = deque.peekLast();
                }
                ans.append(output);
                ans.append("\n");
            }
            else{
                System.out.println("명령어 오류");
                break;
            }

        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
