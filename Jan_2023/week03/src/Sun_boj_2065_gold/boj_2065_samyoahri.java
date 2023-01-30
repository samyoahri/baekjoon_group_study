package Sun_boj_2065_gold;


public class boj_2065_samyoahri {
    public static void main(String[] args) {

    }
}
//실패코드
//import java.io.*;
//import java.util.*;
//class ClientArriveTimeComparator implements Comparator<Client>{
//    @Override
//    public int compare(Client o1, Client o2) {
//        if (o1.arriveTime < o2.arriveTime) {
//            return -1;
//        } else if (o1.arriveTime == o2.arriveTime) {
//            return 0;
//        }
//        else if (o1.arriveTime > o2.arriveTime){
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }
//}
//class Client implements Comparable<Client>{
//    int arriveTime;
//    int idx;
//
//    public Client(int arriveTime, int idx) {
//        this.arriveTime = arriveTime;
//        this.idx = idx;
//    }
//
//    @Override
//    public int compareTo(Client o) {
//        if (o.arriveTime < arriveTime) {
//            return 1;
//        } else if (o.arriveTime > arriveTime) {
//            return -1;
//        }
//        else{
//            return 0;
//        }
//    }
//    public int getArriveTime() {
//        return arriveTime;
//    }
//
//    public int getIdx() {
//        return idx;
//    }
//
//    public void setArriveTime(int arriveTime) {
//        this.arriveTime = arriveTime;
//    }
//
//    public void setIdx(int idx) {
//        this.idx = idx;
//    }
//
//    @Override
//    public String toString() {
//        return "Client{" +
//                "arriveTime=" + arriveTime +
//                ", idx=" + idx +
//                '}';
//    }
//}
//class Ship{
//    boolean direction;
//    Queue<Client> room;
//
//    public Ship(boolean direction) {
//        this.room = new LinkedList<>();
//        this.direction = direction;
//    }
//    public void move(boolean dirc){
//        this.direction = dirc;
//    }
//}
//
//public class boj_2065_samyoahri {
//    static boolean LEFT = false;
//    static boolean RIGHT = true;
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//
//        //나룻배에 실을 수 있는 최대 사람 수
//        int M = Integer.parseInt(st.nextToken());
//        //다른방향 나룻터로 이동하는데 걸리는 시간
//        int t = Integer.parseInt(st.nextToken());
//        //손님수
//        int N = Integer.parseInt(st.nextToken());
//
//        ArrayList<Integer> res = new ArrayList();
//        for (int i = 0; i < N; i++) {
//            res.add(-1);
//        }
//
//        ArrayList<Client> left = new ArrayList<>();
//        ArrayList<Client> right = new ArrayList<>();
//
//        //고객생성
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            int arriveTime = Integer.parseInt(st.nextToken());
//            String direction = st.nextToken();
//            if (direction.equals("left")) {
//                left.add(new Client(arriveTime, i));
//            }
//            else if (direction.equals("right")) {
//                right.add(new Client(arriveTime, i));
//            }
//            else{
//                System.out.println("Error, 방향입력값이 잘못 되었습니다.");
//                break;
//            }
//        }
////        System.out.println("[Left]");
////        for (Client o : left) {
////            System.out.println("o.arriveTime = " + o.arriveTime);
////            System.out.println("o.idx = " + o.idx);
////        }
////        System.out.println("[right]");
////        for (Client o : right) {
////            System.out.println("o.arriveTime = " + o.arriveTime);
////            System.out.println("o.idx = " + o.idx);
////        }
//
//        Collections.sort(left, new ClientArriveTimeComparator());
//        Collections.sort(right, new ClientArriveTimeComparator());
////        Collections.sort(left);
////        Arrays.sort(right, );
//
////        System.out.println("[Left]");
////        for (Client o : left) {
////            System.out.println("o.arriveTime = " + o.arriveTime);
////            System.out.println("o.idx = " + o.idx);
////        }
////        System.out.println("[right]");
////        for (Client o : right) {
////            System.out.println("o.arriveTime = " + o.arriveTime);
////            System.out.println("o.idx = " + o.idx);
////        }
//
//        Queue<Client> leftDock = new LinkedList<>();
//        Queue<Client> rightDock = new LinkedList<>();
//        for (int i = 0; i < left.size(); i++) {
//            leftDock.add(left.get(i));
//        }
//        for (int i = 0; i < right.size(); i++) {
//            rightDock.add(right.get(i));
//        }
//
//
//        Ship ship = new Ship(LEFT);
//        int time = 0;
//        int cnt = 0;
//
//        while (!leftDock.isEmpty() || !rightDock.isEmpty() || !ship.room.isEmpty()) {
////            if (cnt++ == 30) {
////                break;
////            }
//            boolean nowPos = ship.direction;
//            boolean nextPos = !nowPos;
////            System.out.println("-----[cnt = " + cnt + "]-----");
////            System.out.println("time = " + time);
////            System.out.println("nowPos = " + nowPos);
////            System.out.println("ship.direction = " + ship.direction);
////            System.out.println("ship.room.size() = " + ship.room.size());
////            System.out.println("leftDock.size() = " + leftDock.size());
////            System.out.println("rightDock.size() = " + rightDock.size());
//
//            //현재 dock에 손님이 없는경우
//            if((nowPos==LEFT && !leftDock.isEmpty() && time < leftDock.peek().arriveTime)
//                    || (nowPos== RIGHT && !rightDock.isEmpty() && time < rightDock.peek().arriveTime)){
//                //반대쪽 정박장에 손님이 도착한 경우
//                if((nowPos==LEFT && !rightDock.isEmpty() && time >= rightDock.peek().arriveTime)
//                        || (nowPos==RIGHT && !leftDock.isEmpty() && time >= leftDock.peek().arriveTime)){
//                    ship.move(nextPos);
//                    time += t;
//                    continue;
//                }
//                //계속기다리는 경우
//                else{
//                    time += 1;
//                    continue;
//                }
////                System.out.println("Dock에 손닙없어요");
//            }
//            //dock에 손님이 있는 경우
//            else{
//                //pop 경우
//                if (!ship.room.isEmpty()) {
////                    System.out.println("[pop]");
////                    time += t;
//                    while(true){
////                        System.out.println("pop1");
//                        if (ship.room.isEmpty()) {
//                            break;
//                        }
//                        Client client = ship.room.poll();
//                        int clidentIdx = client.idx;
////                        res[idx] = t;
//                        res.set(clidentIdx, time);
////                        System.out.println("clidentIdx = " + clidentIdx);
////                        System.out.println("t = " + t);
//                    }
//                }
//                //push 경우
//                while (true) {
//                    if (ship.room.size() == M) {
//                        ship.move(nextPos);
//                        time+=t;
//                        break;
//                    }
////                    System.out.println("push");
//                    if (nowPos == LEFT) {
//                        if (leftDock.isEmpty()) {
//                            ship.move(nextPos);
//                            time+=t;
//                            break;
//                        }
//                        else{
//                            if (leftDock.peek().arriveTime <= time) {
//                                Client client = leftDock.poll();
//                                ship.room.add(client);
//                            }
//                            else{
//                                ship.move(nextPos);
//                                time+=t;
//                                break;
//                            }
//                        }
//                    }
//                    else if (nowPos == RIGHT) {
//                        if (rightDock.isEmpty()) {
//                            ship.move(nextPos);
//                            time+=t;
//                            break;
//                        }
//                        else{
//                            if (rightDock.peek().arriveTime <= time) {
//                                Client client = rightDock.poll();
//                                ship.room.add(client);
//                            }
//                            else{
//                                ship.move(nextPos);
//                                time+=t;
//                                break;
//                            }
//                        }
//                    }
//                }
//
//            }
//
//        }
//
//
//        for (int integer : res) {
////            System.out.println("integer = " + integer);
//            ans.append(integer + "\n");
//        }
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
