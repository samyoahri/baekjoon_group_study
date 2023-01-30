package Wed_boj_2164;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

class Card{
    int num;

    public Card(int num) {
        this.num = num;
    }
}
class Deck{
    private Queue<Card> deck;

    public Deck(){

    }
    public Deck(int n){
        deck = new LinkedList<>();
        for(int i =1; i <= n; i++){
            deck.add(new Card(i));
        }
    }
    public void generate(int n){
        deck = new LinkedList<>();
        for(int i =1; i <= n; i++){
            deck.add(new Card(i));
        }
    }
    public void insert(Card card){
        deck.add(card);
    }
    public Card pick(){
        return deck.poll();
    }

    public void remainOneCard(){
        int n = deck.size();
        for(int i = 0; i < n; i++){
            if (deck.size() == 1) {
                break;
            }
            deck.poll();
            deck.add(deck.poll());
        }
    }
}
public class boj_2164_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());

        Deck deck = new Deck();
        deck.generate(n);
        deck.remainOneCard();

        StringBuilder ans = new StringBuilder();

        ans.append(deck.pick().num);
        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
