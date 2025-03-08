package Free;

import java.io.*;
import java.util.*;

class Gorilla{
    String name;
    List<Integer> information;

    public Gorilla(String name, List<Integer> information) {
        this.name = name;
        this.information = information;
        Collections.sort(this.information, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1-o2);
            }
        });
    }
}
public class boj_22252_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;

        Map<String, Gorilla> gorillas = new HashMap<>();

        int Q = Integer.parseInt(in.readLine());

        long result = 0;
        for (int i = 0; i < Q; i++) {
            String[] strings = in.readLine().split(" ");
            int queryStart = Integer.parseInt(strings[0]);
            String name = strings[1];
            //
            int k = Integer.parseInt(strings[2]);
            if (queryStart == 1) {
                List<Integer> information = new ArrayList<>();
                for (int j = 3; j < k+3; j++) {
                    information.add(Integer.parseInt(strings[j]));
                }
                if (!gorillas.containsKey(name)) {
                    gorillas.put(name ,new Gorilla(name, information));
                }
                else{
                    gorillas.get(name).information.addAll(information);
                    Collections.sort(gorillas.get(name).information, new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return -(o1 - o2);
                        }
                    });
//                    System.out.println("gorillas.get(name).information = " + gorillas.get(name).information);
                }
            } else if (queryStart == 2) {
                int infoCnt = Integer.parseInt(strings[2]);
                if (gorillas.containsKey(name)) {
                    List<Integer> info  = gorillas.get(name).information;
                    while (infoCnt-- > 0 && !info.isEmpty()) {
                        result+=gorillas.get(name).information.remove(0);
//                        System.out.println("result = " + result);
                    }
                }
//                System.out.println("queryStart = " + queryStart);
            }else{
                System.out.println("Error");
                break;
            }
        }
//        for( Gorilla gorilla : gorillas.values()){
//            System.out.println("gorilla.name = " + gorilla.name);
//            System.out.println("gorilla.information = " + gorilla.information);
//        }

        ans.append(result);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
