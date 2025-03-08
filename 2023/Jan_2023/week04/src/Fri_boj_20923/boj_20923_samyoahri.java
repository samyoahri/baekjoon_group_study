package Fri_boj_20923;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj_20923_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> dequeInDo = new ArrayDeque<>();
        Deque<Integer> groundDequeInDo = new ArrayDeque<>();

        Deque<Integer> dequeInSu = new ArrayDeque<>();
        Deque<Integer> groundDequeInSu = new ArrayDeque<>();

        //
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            int cardDodo = Integer.parseInt(st.nextToken());
            int cardSuyoeon = Integer.parseInt(st.nextToken());
            dequeInDo.add(cardDodo);
            dequeInSu.add(cardSuyoeon);
        }

        //게임시작
        for (int i = 1; i <= M; i++) {
            int checkWin = 0;
            int cardDodo;
            int cardSuyeon;
            //도도턴
            if (i % 2 == 1) {
                cardDodo = dequeInDo.removeLast();
                if(dequeInDo.isEmpty())
                    break;
                groundDequeInDo.addFirst(cardDodo);
                if (groundDequeInDo.peekFirst() == 5
                        || (!groundDequeInSu.isEmpty() && groundDequeInSu.peekFirst() == 5)) {
                    //그라운드덱 가져오기
                     while (!groundDequeInSu.isEmpty()) {
                        dequeInDo.addFirst(groundDequeInSu.removeLast());
                    }
                    while (!groundDequeInDo.isEmpty()) {
                        dequeInDo.addFirst(groundDequeInDo.removeLast());
                    }
                }
                else if (!groundDequeInDo.isEmpty() && !groundDequeInSu.isEmpty()
                        && (groundDequeInDo.peekFirst() + groundDequeInSu.peekFirst() == 5)) {
                    //그라운드덱 가져오기
                    while (!groundDequeInDo.isEmpty()) {
                        dequeInSu.addFirst(groundDequeInDo.removeLast());
                    }
                    while (!groundDequeInSu.isEmpty()) {
                        dequeInSu.addFirst(groundDequeInSu.removeLast());
                    }
                }
            }
            //수연턴
            else{
                cardSuyeon = dequeInSu.removeLast();
                if (dequeInSu.isEmpty())
                    break;
                groundDequeInSu.addFirst(cardSuyeon);
                if (!groundDequeInDo.isEmpty() && !groundDequeInSu.isEmpty()
                        && (groundDequeInDo.peekFirst() + groundDequeInSu.peekFirst() == 5)) {
                    //그라운드덱 가져오기
                    while (!groundDequeInDo.isEmpty()) {
                        dequeInSu.addFirst(groundDequeInDo.removeLast());
                    }
                    while (!groundDequeInSu.isEmpty()) {
                        dequeInSu.addFirst(groundDequeInSu.removeLast());
                    }
                }
                else if ((!groundDequeInDo.isEmpty() && groundDequeInDo.peekFirst() == 5)
                        || (!groundDequeInSu.isEmpty() && groundDequeInSu.peekFirst() == 5)) {
                    //그라운드덱 가져오기
                    while (!groundDequeInSu.isEmpty()) {
                        dequeInDo.addFirst(groundDequeInSu.removeLast());
                    }
                    while (!groundDequeInDo.isEmpty()) {
                        dequeInDo.addFirst(groundDequeInDo.removeLast());
                    }
                }
            }
        }
        if (dequeInDo.size() > dequeInSu.size()) {
            ans.append("do");
        } else if (dequeInDo.size() < dequeInSu.size()) {
            ans.append("su");
        }
        else if(dequeInDo.size() == dequeInSu.size()){
            ans.append("dosu");
        }
        else{
            System.out.println("있을 수 없는 일");
        }
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();

    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        Deque<Integer> dequeInDo = new ArrayDeque<>();
//        Deque<Integer> groundDequeInDo = new ArrayDeque<>();
//
//        Deque<Integer> dequeInSu = new ArrayDeque<>();
//        Deque<Integer> groundDequeInSu = new ArrayDeque<>();
//
//        //
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            int cardDodo = Integer.parseInt(st.nextToken());
//            int cardSuyoeon = Integer.parseInt(st.nextToken());
//            dequeInDo.add(cardDodo);
//            dequeInSu.add(cardSuyoeon);
//        }
//
//        System.out.println("[deque In Dodo]");
//        for (int integer : dequeInDo) {
//            System.out.print(integer + " ");
//        }
//        System.out.println();
//
//        System.out.println("[deque in Suyeon]");
//        for (int integer : dequeInSu) {
//            System.out.print(integer + " ");
//        }
//        System.out.println();
//
//        //게임시작
//        for (int i = 1; i <= M; i++) {
//            //도도 승리시 1, 수연 승리시 2, 승부가 나지않았을시 0;
//            int checkWin = 0;
//            int cardDodo;
//            cardDodo = dequeInDo.removeLast();
//            if (dequeInDo.size() == 0) {
//                break;
//            }
//
//            groundDequeInDo.addFirst(cardDodo);
//            if(groundDequeInDo.peekFirst()==5
//                    ||  (!groundDequeInSu.isEmpty() &&  groundDequeInSu.peekFirst()==5)){
//                checkWin = 1;
//            }
//            if (checkWin == 1) {
//                while (!groundDequeInSu.isEmpty()) {
//                    dequeInDo.addFirst(groundDequeInSu.removeLast());
//                }
//                while (!groundDequeInDo.isEmpty()) {
//                    dequeInDo.addFirst(groundDequeInDo.removeLast());
//                }
//                continue;
//            }
//            ///////////////////
//            int cardSuyeon;
//            cardSuyeon = dequeInSu.removeLast();
//            if (dequeInSu.size() == 0) {
//                break;
//            }
//
//            groundDequeInSu.addFirst(cardSuyeon);
//            if(!groundDequeInSu.isEmpty() && !groundDequeInDo.isEmpty()
//                    && (groundDequeInSu.peekFirst()+groundDequeInDo.peekFirst()==5) ){
//                checkWin = 2;
//            }
//            if (checkWin == 2) {
//                while (!groundDequeInDo.isEmpty()) {
////                    dequeInDo.addFirst(groundDequeInSu.removeLast());
//                    dequeInSu.addFirst(groundDequeInDo.removeLast());
//                }
//                while (!groundDequeInSu.isEmpty()) {
////                    dequeInDo.addFirst(groundDequeInDo.removeLast());
//                    dequeInSu.addFirst(groundDequeInSu.removeLast());
//                }
//                continue;
//            }
//
//        }
//        if (dequeInDo.size() > dequeInSu.size()) {
//            ans.append("do");
//        } else if (dequeInDo.size() < dequeInSu.size()) {
//            ans.append("su");
//        }
//        else if(dequeInDo.size() == dequeInSu.size()){
//            ans.append("dosu");
//        }
//        else{
//            System.out.println("있을 수 없는 일");
//        }
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//
//    }
}
