package Mon_boj_1021;

import java.io.*;
import java.util.*;

public class boj_1021_samyoahri {
    static Deque<Integer> deque;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        //큐의 크기
        int N = Integer.parseInt(st.nextToken());
        //뽑아내려는 수의 개수
        int M = Integer.parseInt(st.nextToken());

        deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(in.readLine(), " ");
        int[] seq = new int[M+1];
        for (int i = 1; i <= M; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 1; i <= M; i++) {
            //지민이가 뽑아내려고 하는 수의 위치
            int pos = seq[i];
            while(true){
                int index = 0;
                Iterator<Integer> iter = deque.iterator();
                while (iter.hasNext()) {
                    if (iter.next() == pos) {
                        break;
                    }
                    index++;
                }
                if (index == 0) {
                    deque.remove();
                    break;
                }
                //2번연산
                else if (index > deque.size() / 2) {
                    deque.addFirst(deque.removeLast());
                    cnt++;
                }
                //3번연산
                else{
                    deque.addLast(deque.removeFirst());
                    cnt++;
                }
            }
        }

        ans.append(cnt);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }


}
