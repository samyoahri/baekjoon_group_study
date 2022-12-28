package boj_3003_mon;
import java.util.ArrayList;
import java.util.Scanner;

class Chess_pieces{
    private int king, queen;
    private int rock, bishop,knight;
    private int pawn;

    private Chess_pieces() {
    }

    public Chess_pieces(int king, int queen, int rock, int bishop, int knight, int pawn) {
        this.king = king;
        this.queen = queen;
        this.rock = rock;
        this.bishop = bishop;
        this.knight = knight;
        this.pawn = pawn;
    }

    public int getKing() {
        return king;
    }

    public int getQueen() {
        return queen;
    }

    public int getRock() {
        return rock;
    }

    public int getBishop() {
        return bishop;
    }

    public int getKnight() {
        return knight;
    }

    public int getPawn() {
        return pawn;
    }

    public void setKing(int king) {
        this.king = king;
    }

    public void setQueen(int queen) {
        this.queen = queen;
    }

    public void setRock(int rock) {
        this.rock = rock;
    }

    public void setBishop(int bishop) {
        this.bishop = bishop;
    }

    public void setKnight(int knight) {
        this.knight = knight;
    }

    public void setPawn(int pawn) {
        this.pawn = pawn;
    }
    public void neededShow(){
        System.out.print(-(getKing()-1)+ " " + -(getQueen()-1) + " ");
        System.out.print(-(getRock()-2)+ " " + -(getBishop()-2) + " " + -(getKnight()-2)+ " ");
        System.out.println(-(getPawn()-8));
    }
}
public class boj_3003_samyoahri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rock = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();
        Chess_pieces chess_pieces = new Chess_pieces(king, queen, rock, bishop, knight, pawn);

        chess_pieces.neededShow();

    }
}

