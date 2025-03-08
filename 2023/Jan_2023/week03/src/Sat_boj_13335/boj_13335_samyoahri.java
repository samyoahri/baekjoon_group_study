package Sat_boj_13335;

import java.io.*;
import java.util.*;

class Truck{
    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }
}
public class boj_13335_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //다리를 건너는 트럭의 수
        int n = Integer.parseInt(st.nextToken());
        //다리의 길이
        int w = Integer.parseInt(st.nextToken());
        //다리의 최대하중
        int L = Integer.parseInt(st.nextToken());

        Queue<Truck> waitList = new LinkedList<>();
        Queue<Truck> bridge = new LinkedList<>();

        st = new StringTokenizer(in.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int weight = Integer.parseInt(st.nextToken());
            waitList.add(new Truck(weight));
        }

        int totWeightInBridge = 0;
        int shortestTime = 0;
        int cnt = 0;

        Truck waitTime = new Truck(0);
        while (!waitList.isEmpty()) {
            Truck firstTruck = waitList.peek();
            //pop조건
            if (L < firstTruck.weight + totWeightInBridge) {
                while(true){
                    if (bridge.size() >= w) {
                        break;
                    }
                    bridge.add(waitTime);
                }
                firstTruck = bridge.poll();
                totWeightInBridge -= firstTruck.weight;
                cnt++;

            }
            //push조건
            else{
                firstTruck = waitList.poll();
                bridge.add(firstTruck);
                totWeightInBridge += firstTruck.weight;
            }
        }
        while (!bridge.isEmpty()) {
            Truck firstTruck = bridge.poll();
            totWeightInBridge -= firstTruck.weight;
            cnt++;
        }
        shortestTime = cnt + w;
        ans.append(shortestTime);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
    //틀린코드
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        //다리를 건너는 트럭의 수
//        int n = Integer.parseInt(st.nextToken());
//        //다리의 길이
//        int w = Integer.parseInt(st.nextToken());
//        //다리의 최대하중
//        int L = Integer.parseInt(st.nextToken());
//
//        Queue<Truck> waitList = new LinkedList<>();
//        Queue<Truck> bridge = new LinkedList<>();
//
//        st = new StringTokenizer(in.readLine(), " ");
//
//        for (int i = 0; i < n; i++) {
//            int weight = Integer.parseInt(st.nextToken());
//            waitList.add(new Truck(weight));
//        }
////        Truck truck = waitList.remove();
////        bridge.add(truck);
//        int totWeightInBridge = 0;
//        int shortestTime = 1;
//        while (!waitList.isEmpty()) {
//            Truck firstTruck = waitList.peek();
//            boolean check = false;
//            //pop조건
//            if (L < firstTruck.weight + totWeightInBridge) {
////                //대기줄에서 다리건널때까지 기다려야하는 경우
//
////                //기다리지 않아도 되는경우
//                int cnt = 0;
//                while (!bridge.isEmpty()) {
//                    firstTruck = bridge.poll();
//                    totWeightInBridge -= firstTruck.weight;
//                    cnt++;
//                }
//                //한대만 다리를 지나가믄거면 w만큼만 기다리면됨
//                if (cnt == 1) {
//                    shortestTime += w;
//                }
//                //2대이상일 때는 w + (자동차대수 - 1)만큼 기다리면
//                else{
//                    shortestTime += (w + (cnt - 1));
//                }
//            }
//            //push조건
//            else{
//                firstTruck = waitList.poll();
//                bridge.add(firstTruck);
//                totWeightInBridge += firstTruck.weight;
//            }
//        }
//        int cnt = 0;
//        while (!bridge.isEmpty()) {
//            Truck firstTruck = bridge.poll();
//            totWeightInBridge -= firstTruck.weight;
//            cnt++;
//        }
//        //한대만 다리를 지나가믄거면 w만큼만 기다리면됨
//        if (cnt == 1) {
//            shortestTime += w;
//        }
//        //2대이상일 때는 w + (자동차대수 - 1)만큼 기다리면
//        else{
//            shortestTime += (w + (cnt - 1));
//        }
//        ans.append(shortestTime);
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
