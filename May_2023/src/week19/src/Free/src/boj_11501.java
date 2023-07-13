import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //팀의 수
        int N = Integer.parseInt(st.nextToken());
        //카약이 손상된 팀의 수
        int S = Integer.parseInt(st.nextToken());
        //카약을 더 가져온 팀의 수
        int R = Integer.parseInt(st.nextToken());
        boolean spareShip[] = new boolean[N + 1];
        boolean brokenShip[] = new boolean[N + 1];

//        Arrays.fill(spareShip, 1);
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < S; ++i) {
            int idx = Integer.parseInt(st.nextToken());
//            --spareShip[idx];
            brokenShip[idx] = true;
        }
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < R; ++i) {
            int idx = Integer.parseInt(st.nextToken());
//            ++spareShip[idx];
            spareShip[idx] = true;
        }
        int impossibleToParticipate = 0;
        if (brokenShip[1] && !spareShip[1]) {
            if (!brokenShip[2] && spareShip[2]) {
                spareShip[2] = false;
            }
            else{
                ++impossibleToParticipate;
            }
        }
        for (int i = 2; i <= N - 1; ++i) {
            if (!brokenShip[i]) {
                continue;
            }
            else{
                if (spareShip[i]) {
                    spareShip[i] = false;
                    continue;
                }
                else{
                    if (spareShip[i - 1] && !brokenShip[i - 1]) {
                        spareShip[i - 1] = false;
                        continue;
                    } else if (spareShip[i + 1] && !brokenShip[i + 1]) {
                        spareShip[i + 1] = false;
                        continue;
                    } else {
                        ++impossibleToParticipate;
                    }
                }
            }
        }
        if (brokenShip[N] && !spareShip[N]) {
            if (!brokenShip[N - 1] && spareShip[N - 1]) {
                spareShip[N - 1] = false;
            } else {
                ++impossibleToParticipate;
            }
        }

        ans.append(impossibleToParticipate);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
