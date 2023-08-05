package week01.Tue_boj_25497;

import java.io.*;

public class boj_25497_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int count = 0;
        int linkSK = 0;
        int linkLR = 0;
        String inputSkill = in.readLine();

        for(int i=0; i<N; i++){
            if(Character.isDigit(inputSkill.charAt(i))){
                count++;
            }
            else{
                if(inputSkill.charAt(i) == 'S' ){
                    linkSK++;
                }
                else if (inputSkill.charAt(i) == 'K') {
                    if(linkSK>0){
                        linkSK--;
                        count++;
                    }
                    else
                        break;
                }
                else if(inputSkill.charAt(i) == 'L'){
                    linkLR++;
                }
                else if(inputSkill.charAt(i) == 'R'){
                    if(linkLR>0){
                        linkLR--;
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        ans.append(count);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}