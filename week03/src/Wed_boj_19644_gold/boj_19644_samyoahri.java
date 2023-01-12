package Wed_boj_19644_gold;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Soldier{
    int gunRange;
    int gunPower;
    int bombNum;
    int[] maxAtkNum;

    public Soldier(int gunRange, int gunPower, int bombNum, int L) {
        this.gunRange = gunRange;
        this.gunPower = gunPower;
        this.bombNum = bombNum;
        maxAtkNum = new int[L+1];
        for (int i = 1; i <= L; i++) {
            if (i < gunRange) {
                maxAtkNum[i] = i;
            }
            else{
                maxAtkNum[i] = gunRange;
            }
        }
    }
}
class Zombie{
    int hp;
    int dis;

    public Zombie(int hp, int dis) {
        this.hp = hp;
        this.dis = dis;
    }
}
public class boj_19644_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int L = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int gunRange = Integer.parseInt(st.nextToken());
        int gunPower = Integer.parseInt(st.nextToken());
        int bombNum = Integer.parseInt(in.readLine());

        Soldier soldier = new Soldier(gunRange, gunPower, bombNum, L);
        Queue<Zombie> zombies = new LinkedList<>();
//        Zombie[] zombies = new Zombie[L + 1];
        for (int i = 1; i <= L; i++) {
            int hp = Integer.parseInt(in.readLine());
            int dis = i;
            zombies.add(new Zombie(hp, dis));
        }

        Queue<Integer> queue = new LinkedList<>();
        int start = 1;
        int end = 1;
        int i = 1;

        for (i = 1; i <= L; i++) {
            Zombie zombie = zombies.peek();
            if (!queue.isEmpty() && queue.peek() < i) {
                queue.remove();
            }
            int debuf = queue.size();
            int maxDamage = soldier.gunPower * soldier.maxAtkNum[i];
            int realDamage = maxDamage - (debuf * soldier.gunPower);
            //죽는경우 ->      폭탄이 없고, 최대 공격력보다 좀비 체력이 많을 때
            if(soldier.bombNum ==0){
//                if(zombies[i].hp > realDamage){
                if(zombie.hp > realDamage){
                    break;
                }
                //실제데미지가 큰 경우는 위의 for문 계속 돌면됨
                else{
                    zombie = zombies.remove();
                }
            }
            //죽지 않는 경우
            else{
//                if(zombies[i]. hp > realDamage){
                if(zombie.hp > realDamage){
                    //어떻게 해야할까? 여기가 중요하네
                    end = i+ soldier.gunRange-1;
                    queue.add(end);
                    soldier.bombNum--;
                    zombie = zombies.remove();
                }
                //실제데미지가 큰 경우는 for문 계속 돌면됨
                else{
                    zombie = zombies.remove();
                }
            }
//            System.out.println("[i = " + i+"]");
//            System.out.println("soldier.bombNum = " + soldier.bombNum);
//            System.out.println("realDamage = " + realDamage);
//            System.out.println("maxDamage = " + maxDamage);
//            System.out.println("debuf = " + debuf);
//            System.out.println("zombie.hp = " + zombie.hp);
//            System.out.println("zombie.dis = " + zombie.dis);
        }

        if(zombies.isEmpty())
            ans.append("YES");
        else
            ans.append("NO");

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
//시간초과코드
//package Wed_boj_19644_gold;
//
//import java.io.*;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//class Soldier{
//    int gunRange;
//    int gunPower;
//    int bombNum;
//    int[] maxAtkNum;
//
//    public Soldier(int gunRange, int gunPower, int bombNum, int L) {
//        this.gunRange = gunRange;
//        this.gunPower = gunPower;
//        this.bombNum = bombNum;
//        maxAtkNum = new int[L+1];
//        for (int i = 1; i <= L; i++) {
//            if (i < gunRange) {
//                maxAtkNum[i] = i;
//            }
//            else{
//                maxAtkNum[i] = gunRange;
//            }
//        }
//    }
//}
//class Zombie{
//    int hp;
//    int dis;
//
//    public Zombie(int hp, int dis) {
//        this.hp = hp;
//        this.dis = dis;
//    }
//}
//public class boj_19644_gold {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int L = Integer.parseInt(in.readLine());
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        int gunRange = Integer.parseInt(st.nextToken());
//        int gunPower = Integer.parseInt(st.nextToken());
//        int bombNum = Integer.parseInt(in.readLine());
//
//        Soldier soldier = new Soldier(gunRange, gunPower, bombNum, L);
//        Queue<Zombie> road = new LinkedList<>();
////        for (int i = 1; i <= L; i++) {
////            System.out.println("i:"+i+"  soldier.maxAtkNum[i] = " + soldier.maxAtkNum[i]);
////        }
//        for (int i = 1; i <= L; i++) {
//            int hp = Integer.parseInt(in.readLine());
//            int dis = i;
//            road.add(new Zombie(hp, dis));
//        }
//        for (int i = 1; i <= L; i++) {
//            Zombie zombie = road.peek();
//            int maxDamage = soldier.maxAtkNum[i] * soldier.gunPower;
//            //폭탄이 없는 경우
//            if (soldier.bombNum == 0) {
//                if (maxDamage < zombie.hp) {
//                    break;
//                }
//                else{
//                    road.remove();
//                }
//            }
//            //폭탄이 있는 경우
//            else{
//                if (maxDamage < zombie.hp) {
//                    soldier.bombNum--;
//                    road.remove();
//                    for(int j = i; j < (L+1) && j < i + gunRange; j++){
//                        soldier.maxAtkNum[j]--;
//                    }
//                }
//                else{
//                    road.remove();
//                }
//            }
//        }
//        if(road.isEmpty())
//            ans.append("YES");
//        else
//            ans.append("NO");
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
//리팩토링하다 뇌절한 코드
//class Soldier{
//    int gunRange;
//    int gunPower;
//    int bombNum;
//    int[] maxAtkNum;
//
//    public Soldier(int gunRange, int gunPower, int bombNum, int L) {
//        this.gunRange = gunRange;
//        this.gunPower = gunPower;
//        this.bombNum = bombNum;
//        maxAtkNum = new int[L+1];
//        for (int i = 1; i <= L; i++) {
//            if (i < gunRange) {
//                maxAtkNum[i] = i;
//            }
//            else{
//                maxAtkNum[i] = gunRange;
//            }
//        }
//    }
//}
//class Zombie{
//    int hp;
//    int dis;
//
//    public Zombie(int hp, int dis) {
//        this.hp = hp;
//        this.dis = dis;
//    }
//}
//public class boj_19644_gold {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int L = Integer.parseInt(in.readLine());
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        int gunRange = Integer.parseInt(st.nextToken());
//        int gunPower = Integer.parseInt(st.nextToken());
//        int bombNum = Integer.parseInt(in.readLine());
//
//        Soldier soldier = new Soldier(gunRange, gunPower, bombNum, L);
//        Queue<Zombie> road = new LinkedList<>();
////        for (int i = 1; i <= L; i++) {
////            System.out.println("i:"+i+"  soldier.maxAtkNum[i] = " + soldier.maxAtkNum[i]);
////        }
//        for (int i = 1; i <= L; i++) {
//            int hp = Integer.parseInt(in.readLine());
//            int dis = i;
//            road.add(new Zombie(hp, dis));
//        }
//        for (int i = 1; i <= L; i++) {
//            Zombie zombie = road.peek();
//            int maxDamage = soldier.maxAtkNum[i] * soldier.gunPower;
//            //폭탄이 없는 경우
//            if (soldier.bombNum == 0) {
//                if (maxDamage < zombie.hp) {
//                    break;
//                }
//                else{
//                    road.remove();
//                }
//            }
//            //폭탄이 있는 경우
//            else{
//                if (maxDamage < zombie.hp) {
//                    soldier.bombNum--;
//                    road.remove();
//                    for(int j = i; j < (L+1) && j < i + gunRange; j++){
//                        soldier.maxAtkNum[j]--;
//                    }
//                }
//                else{
//                    road.remove();
//                }
//            }
//        }
//        if(road.isEmpty())
//            ans.append("YES");
//        else
//            ans.append("NO");
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
