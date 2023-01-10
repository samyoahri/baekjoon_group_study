package Tue_boj_2161;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Card{
    int num;

    public Card(int num) {
        this.num = num;
    }
}
public class boj_2161_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder thrownCard = new StringBuilder();
        StringBuilder remain = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        //덱 생성
        Queue<Card> deck = new LinkedList<>();
        int n = Integer.parseInt(in.readLine());
        for(int i = 1; i <= n; i++){
            deck.add(new Card(i));
        }

        //카드 작업
        while (deck.size() != 1) {
            thrownCard.append(deck.poll().num + " ");
            deck.add(deck.poll());
        }

        remain.append(deck.poll().num);

        ans.append(thrownCard);
        ans.append(remain);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();

    }
}
