package Sun_boj_12915;

import java.io.*;
import java.util.StringTokenizer;

public class boj_12915_samyoahri {
    static boolean checkEasyQuestion(){
        if (E == 0 && EM == 0) {
            return false;
        }
        return true;
    }
    static boolean checkMediumQuestion(){
        if (EM == 0 && M == 0 && MH==0) {
            return false;
        }
        return true;
    }
    static boolean checkHardQuestion(){
        if (MH == 0 && H == 0) {
            return false;
        }
        return true;
    }
    static int E;
    static int EM;
    static int M;
    static int MH;
    static int H;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        E = Integer.parseInt(st.nextToken());
        EM = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        MH = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        int cnt = 0;
        while(true){
            boolean stop = false;
            if (checkEasyQuestion()) {
                if (E != 0) {
                    --E;
                }
                else{
                    --EM;
                }
            }
            else{
                stop = true;
            }

            if (checkHardQuestion()) {
                if (H != 0) {
                    --H;
                }
                else{
                    --MH;
                }
            }
            else{
                stop = true;
            }

            if (checkMediumQuestion()) {
                if (M != 0) {
                    --M;
                }
                else{
                    if (MH > EM) {
                        --MH;
                    } else if (MH < EM) {
                        --EM;
                    } else if (MH == EM) {
                        if (E > H) {
                            --EM;
                        }
                        else{
                            --MH;
                        }
                    }
                }
            }
            else{
                stop = true;
            }

            if (stop) {
                break;
            } else {
                ++cnt;
            }
        }
        ans.append(cnt);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
