package Thu_boj_3190_gold;

import java.io.*;
import java.util.*;

class Coordinate{
    int row;
    int col;

    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Snake{
    int direction;
    int length;
//    Coordinate coordinate;
    Deque<Coordinate> coordinate;

    public Snake(){
        direction = 0;
        length = 1;
        coordinate = new ArrayDeque<>();
        coordinate.add(new Coordinate(1, 1));
//        coordinate = new Coordinate(1, 1);
    }
    public boolean move(int[][] board){
        Coordinate nowPos = coordinate.peekLast();
        int nowRow = nowPos.row;
        int nowCol = nowPos.col;
        Coordinate nextPos;

        if (direction == 0) {
            nextPos = new Coordinate(nowRow, nowCol+1);
            if(board[nowRow][nowCol+1]==0
                    || board[nowRow][nowCol+1]==2){
                if (board[nowRow][nowCol + 1] == 2) {
                    length++;
                }
                coordinate.add(nextPos);
                board[nowRow][nowCol+1] = 1;
//                return true;
            }
            else{
                return false;
            }
        }
        else if (direction == 90) {
            nextPos = new Coordinate(nowRow-1, nowCol);
            if(board[nowRow-1][nowCol]==0
                    || board[nowRow-1][nowCol]==2){
                if (board[nowRow-1][nowCol] == 2) {
                    length++;
                }
                coordinate.add(nextPos);
                board[nowRow-1][nowCol] = 1;
//                return true;
            }
            else{
                return false;
            }
        }
        else if (direction == 180) {
            nextPos = new Coordinate(nowRow, nowCol-1);
            if(board[nowRow][nowCol-1]==0
                    || board[nowRow][nowCol-1]==2){
                if (board[nowRow][nowCol-1] == 2) {
                    length++;
                }
                coordinate.add(nextPos);
                board[nowRow][nowCol-1] = 1;
//                return true;
            }
            else{
                return false;
            }
        }
        else if (direction == 270) {
            nextPos = new Coordinate(nowRow+1, nowCol);
            if(board[nowRow+1][nowCol]==0
                    || board[nowRow+1][nowCol]==2){
                if (board[nowRow+1][nowCol] == 2) {
                    length++;
                }
                coordinate.add(nextPos);
                board[nowRow+1][nowCol] = 1;
//                return true;
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("방향이 잘못되어 움직일 수 없습니다.");
            return false;
        }
        while(coordinate.size() != length) {
            Coordinate coordinate1 = coordinate.remove();
            int prevRow = coordinate1.row;
            int prevCol = coordinate1.col;
            board[prevRow][prevCol] = 0;
        }

        return true;
    }

    public void changeDirection(String command) {
//        if (command.equals("D")) {
//            direction -= 90;
//        } else if (command.equals("L")) {
//            direction += 90;
//        }
        if (command.equals("D")) {
            direction -= 90;
//            System.out.println("direction = " + direction);
        } else if (command.equals("L")) {
            direction += 90;
        }
        else{
            System.out.println("명령어 오류로 인한 방향전환실패");
        }

        if (direction < 0) {
            direction = 360 + direction;
        }
        if (direction >= 360) {
            direction = direction % 360;
        }
    }
}
public class boj_3190_samyoahri {
    static int N;
    static int[][] board;
    static void printBoard(){
        for (int i = 0; i < N + 2; i++) {
            for (int j = 0; j < N + 2; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        //보드의 크기
        N = Integer.parseInt(in.readLine());
        board = new int[N + 2][N + 2];
//        Arrays.fill(board, 0);
        for (int i = 0; i < N + 2; i++) {
            for (int j = 0; j < N + 2; j++) {
                if (i == 0 || j == 0 || i==N+1 || j==N+1) {
                    board[i][j] = 9;
                }
                else{
                    board[i][j] = 0;
                }
            }
        }
//        printBoard();


        //사과의 개수
        int K = Integer.parseInt(in.readLine());
        for (int i = 0; i < K; i++) {
            String[] strArr = in.readLine().split(" ");
            int row, col;
            row = Integer.parseInt(strArr[0]);
            col = Integer.parseInt(strArr[1]);
            board[row][col] = 2;
        }
//        printBoard();

        //방향전환 정보
        int L = Integer.parseInt(in.readLine());
        int times[] = new int[L+1];
        String commands[] = new String[L+1];
        for (int i = 0; i < L; i++) {
            String[] strArr = in.readLine().split(" ");
            int time = Integer.parseInt(strArr[0]);
            String command = strArr[1];
            times[i] = time;
            commands[i] = command;
        }
//        printBoard();


        int lastTime = times[L-1];
//        System.out.println("lastTime = " + lastTime);
        Snake snake = new Snake();
        board[1][1] = 1;
//        printBoard();
        int index = 0;
        boolean moveSuccess = true;
        int tmp = 0;
        for (int i = 1; i <= lastTime; i++) {
            //뱀 이동
            if(moveSuccess = snake.move(board)){
                //이동
            }
            else{
                tmp = i;
                break;
            }
            //방향전환
            if (times[index] == i) {
                snake.changeDirection(commands[index]);
                index++;
            }
//            System.out.println("[i = " + i + "]");
//            System.out.println("snake.direction = " + snake.direction);
//            printBoard();
            if (i == lastTime) {
                tmp = i+1;
            }
        }
        while (moveSuccess) {
            moveSuccess = snake.move(board);
            if (moveSuccess) {
                tmp += 1;
            }
        }
        ans.append(tmp);
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
