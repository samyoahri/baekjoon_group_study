package Wed_boj_18115;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj_18115_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int commands[] = new int[N+1];
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int idx1 = 0;
        while (st.hasMoreTokens()) {
            commands[++idx1] = Integer.parseInt(st.nextToken());
        }

        //왼쪽==위 //오른쪽==아래
        Deque<Integer> dequeInFloor = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            dequeInFloor.addFirst(i);
        }
//        for (int integer : dequeInFloor) {
//            System.out.println(integer);
//        }
        Deque<Integer> dequeInHands = new ArrayDeque<>();

        for (int i = N; i > 0; i--) {
            int cardNum;
            int command = commands[i];
            if (command == 1) {
                cardNum = dequeInFloor.removeLast();
                dequeInHands.addFirst(cardNum);
            }
            else if (command == 2) {
                cardNum = dequeInFloor.removeLast();
                int tmp = dequeInHands.removeFirst();
                dequeInHands.addFirst(cardNum);
                dequeInHands.addFirst(tmp);
            }
            else if(command == 3){
                cardNum = dequeInFloor.removeLast();
                dequeInHands.addLast(cardNum);
            }
            else{
                System.out.println("명령어 오류");
                break;
            }
        }
        while (!dequeInHands.isEmpty()) {
            ans.append(dequeInHands.removeFirst()+ " ");
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
