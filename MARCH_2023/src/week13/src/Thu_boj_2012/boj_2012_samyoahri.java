package Thu_boj_2012;

import java.io.*;
import java.util.*;

public class boj_2012_samyoahri {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        int[] real = new int[N + 1];
        int[] expected = new int[N + 1];
        long res = 0;
        for (int i = 1; i <= N; i++) {
            real[i] = i;
            expected[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(expected);
        for (int i = 1; i <= N; i++) {
            res += Math.abs(real[i] - expected[i]);
        }
        ans.append(res);

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
//class Person{
//    int expectedRank;
//    int realRank;
//    int idx;
//
//    public Person(int expectedRank, int realRank, int idx) {
//        this.expectedRank = expectedRank;
//        this.realRank = realRank;
//        this.idx = idx;
//    }
//
//    public Person(int expectedRank, int realRank) {
//        this.expectedRank = expectedRank;
//        this.realRank = realRank;
//    }
//}
//public class boj_2012_samyoahri {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int N = Integer.parseInt(in.readLine());
//        boolean[] checkRank = new boolean[N + 1];
//        int[] expectedRank = new int[N + 1];
//        int[] realRank = new int[N + 1];
//        ArrayList<Person> people = new ArrayList<>();
//        Queue<Integer> remainRank = new ArrayDeque<>();
//        for (int i = 1; i <= N; i++) {
//            int rank = Integer.parseInt(in.readLine());
//            expectedRank[i] = rank;
//            if (!checkRank[rank]) {
//                realRank[i] = rank;
//                checkRank[rank] = true;
//            }
//            people.add(new Person(expectedRank[i], realRank[i], i));
//        }
//        for (int i = 1; i <= N; i++) {
//            if (!checkRank[i]) {
//                remainRank.add(i);
//            }
//        }
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                if (o1.realRank > o2.realRank) {
//                    return 1;
//                } else if (o1.realRank < o2.realRank) {
//                    return -1;
//                }
//                else{
//                    return 0;
//                }
//            }
//        });
//        long res = 0;
//        int i = 0;
//        while (!remainRank.isEmpty()) {
//            int remain = remainRank.poll();
//            res += Math.abs(people.get(i).expectedRank -  remain);
//            ++i;
//        }
//        ans.append(res);
//
//        out.write(ans.toString());
//        out.flush();
//        in.close();
//        out.close();
//    }
//}
