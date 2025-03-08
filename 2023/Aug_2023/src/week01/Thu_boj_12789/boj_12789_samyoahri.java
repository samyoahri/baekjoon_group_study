package week01.Thu_boj_12789;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_12789_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> emptySpace = new Stack<>();
        int order = 1;
        for (int i = 0; i < N; ++i) {
            if (arr[i] == order) {
                ++order;
            }
            else{
                if (!emptySpace.isEmpty() && emptySpace.peek() == order) {
                    emptySpace.pop();
                    --i;
                    ++order;
                }
                else{
                    emptySpace.push(arr[i]);
                }

            }
        }
        for (int i = 0; i < N; ++i) {
            if (!emptySpace.isEmpty() && emptySpace.peek() == order) {
                emptySpace.pop();
                ++order;
            }
        }
        if (emptySpace.isEmpty()) {
            ans.append("Nice");
        }
        else{
            ans.append("Sad");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
