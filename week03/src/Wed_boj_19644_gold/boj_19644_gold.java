package Wed_boj_19644_gold;


//틀린코드
//import java.io.*;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//class Soldier{
//    int gunRange;
//    int gunPower;
//    int bombNumber;
//
//    public Soldier(int gunRange, int gunPower, int bombNumber) {
//        this.gunRange = gunRange;
//        this.gunPower = gunPower;
//        this.bombNumber = bombNumber;
//    }
//}
//class Zombie{
//    int distance;
//    int hp;
//
//    public Zombie(int distance, int hp) {
//        this.distance = distance;
//        this.hp = hp;
//    }
//}
//class Field{
//    Queue<Zombie> road;
//    Field(){
//        road = new LinkedList<>();
//    }
//    void generateZombie(Zombie zombie){
//        road = new LinkedList<>();
//        road.add(zombie);
//    }
//}
//public class boj_19644_gold {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        //기관총 진지 앞쪽 길의 거리를 나타내는 정수 L
//        int L = Integer.parseInt(in.readLine());
//        //기관총의 유효 사거리, 살상력
//        StringTokenizer stringTokenizer = new StringTokenizer(in.readLine());
//        int gunRange = Integer.parseInt(stringTokenizer.nextToken());
//        int gunPower = Integer.parseInt(stringTokenizer.nextToken());
//        //수평 세열 지향성 지뢰의 개수
//        int bombNumber = Integer.parseInt(in.readLine());
//
//        Soldier soldier = new Soldier(gunRange, gunPower, bombNumber);
//        Field field = new Field();
//
//        //좀비무리, 배열 인덱가 거리, 값이 체력
////        int zombies[] = new int[L+1];
//        for (int i = 1; i <= L; i++) {
//            int hp = Integer.parseInt(in.readLine());
//            int dis = i;
//            Zombie zombie = new Zombie(dis, hp);
//            field.road.add(zombie);
//        }
////        for (int i = 1; i <= L; i++) {
////            System.out.println("i = " + i);
////            Zombie zombie = field.road.poll();
////            System.out.println("zombie.hp = " + zombie.hp);
////            System.out.println("zombie.distance = " + zombie.distance);
////        }
//        for (int i = 1; i <= L; i++) {
////            System.out.println("i = " + i);
//            int dis = i;
//            int totalGunPower;
//            Zombie zombie = field.road.peek();
//            if (zombie.distance <= gunRange) {
//                totalGunPower = dis * soldier.gunPower;
//                if (totalGunPower < zombie.hp) {
//                    if (soldier.bombNumber == 0) {
//                        break;
//                    }
//                    else{
//                        soldier.bombNumber--;
//                        field.road.remove();
//                    }
//                }
//                else{
//                    field.road.remove();
//                }
//            }
//            else{
//                totalGunPower = soldier.gunPower * soldier.gunRange;
//                if (totalGunPower < zombie.hp) {
//                    if (soldier.bombNumber == 0) {
//                        break;
//                    }
//                    else{
//                        soldier.bombNumber--;
//                        field.road.remove();
//                    }
//                }
//                else{
//                    field.road.remove();
//                }
//            }
////            System.out.println("i = " + i);
////            System.out.println("zombie.distance = " + zombie.distance);
////            System.out.println("zombie.hp = " + zombie.hp);
//        }
//        if (field.road.isEmpty()) {
//            ans.append("YES");
//        }
//        else{
//            ans.append("NO");
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
