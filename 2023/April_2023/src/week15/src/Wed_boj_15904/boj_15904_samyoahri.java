package Wed_boj_15904;

import java.io.*;

public class boj_15904_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String str = in.readLine();
        //[0]:U, [1]:C, [2]:P, [3]:C
        boolean isPossibleUCPC = false;
        char[] visited = new char[4];
        visited[0] = 'U'; visited[1] = 'C'; visited[2] = 'P'; visited[3] = 'C';
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == visited[j]) {
                ++j;
            }
            if (j == 4) {
                isPossibleUCPC = true;
                break;
            }
        }
        if (isPossibleUCPC) {
            ans.append("I love UCPC");
        }
        else{
            ans.append("I hate UCPC");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
