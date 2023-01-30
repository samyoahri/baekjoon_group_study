package Fri_boj_1966;

import java.io.*;
import java.util.*;

class Documentation{
    int idx;
    int priority;

    public Documentation(int idx, int priority) {
        this.idx = idx;
        this.priority = priority;
    }
}
public class boj_1966_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            //문서의 개수
            int N;
            //궁금한 문서의 현재위치
            int K;
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(in.readLine(), " ");
            Queue<Documentation> queue = new LinkedList<>();

//            int[] priorBuf = new int[N];
            //우선순위를 저장할 버퍼
            Integer[] priorBuf = new Integer[N];
            for (int j = 0; j < N; j++) {
                int prior = Integer.parseInt(st.nextToken());
                Documentation docu = new Documentation(j, prior);
                queue.add(docu);
                priorBuf[j] = prior;
            }
            //버퍼를 내림차순 정렬
            Arrays.sort(priorBuf, Comparator.reverseOrder());
            int idx = 0;
            //우선순위별로 정리
            while (!queue.isEmpty()) {
                Documentation docu = queue.peek();
                if (docu.priority == priorBuf[idx]) {
                    priorBuf[idx] = -1;
                    idx++;
                    docu = queue.remove();
                    if (docu.idx == K) {
//                        System.out.println(idx);
                        ans.append(idx + "\n");
                        queue.clear();
                        break;
                    }
                }
                else{
                    docu = queue.remove();
                    queue.add(docu);
                }
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
