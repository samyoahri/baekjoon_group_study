package week01.Thu_boj_12782;

import java.io.*;
import java.util.StringTokenizer;

public class boj_12782_ormor {
    static StringBuilder N, M;
    static int T;
    // static int score = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;
        T = Integer.parseInt(in.readLine());

        while(T-- >0){
            st = new StringTokenizer(in.readLine());
            N = new StringBuilder(st.nextToken());
            M = new StringBuilder(st.nextToken());
            ans.append(bitFriendshipScore(N,M)).append("\n");
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }

    private static int bitFriendshipScore(StringBuilder N, StringBuilder M){
        int score = 0;

        for(int i=0; i<M.length(); i++){
            if(N.charAt(i) != M.charAt(i)){
                for(int j=i; j<N.length(); j++){
                    if(M.charAt(i) == N.charAt(j) && N.charAt(j) != M.charAt(j)){
                        N.setCharAt(j, N.charAt(i));
                        N.setCharAt(i, M.charAt(i));
                        score++;
                        break;
                    }
                    else{
                        if (j == N.length()-1) {
                            if(N.charAt(i) == '0'){
                                N.setCharAt(i, '1');
                            }
                            else{
                                N.setCharAt(i, '0');
                            }
                            score++;
                            break;
                        }
                    }
                }
            }
        }
        return score;
    }
}