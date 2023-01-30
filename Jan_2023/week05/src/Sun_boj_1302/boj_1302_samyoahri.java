package Sun_boj_1302;

import java.io.*;
import java.util.*;

public class boj_1302_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        Map<String, Integer> bestSeller = new HashMap<>();

        int N = Integer.parseInt(in.readLine());
        String str = "";
        int max = -2147000000;
        for (int i = 0; i < N; i++) {
            String bookName = in.readLine();
            if (!bestSeller.containsKey(bookName)) {
                bestSeller.put(bookName, 1);
            }
            else{
                bestSeller.put(bookName, bestSeller.get(bookName)+1);
//                bestSeller.replace(bookName, bestSeller.get(bookName)+1);
            }
//            bestSeller.put(bookName, bestSeller.getOrDefault(bookName, 0) + 1);
//            max = Math.max(max, bestSeller.get(bookName));

        }
        for (Map.Entry<String, Integer> entry : bestSeller.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value > max) {
                max = value;
                str = entry.getKey();
            } else if (value == max) {
                if (str.compareTo(key) > 0) {
                    str = entry.getKey();
                }
            }
        }
        ans.append(str);
//        List<String> list = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : bestSeller.entrySet()) {
//            if(entry.getValue() == max) list.add(entry.getKey());
//        }
//        Collections.sort(list);
//        ans.append(list.get(0));


        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
