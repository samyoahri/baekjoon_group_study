package boj_10610;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj_10610_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

//        int N = Integer.parseInt(in.readLine());
        String str = in.readLine();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < str.length(); ++i){
//            list.add((int)str.charAt(i)-48);
            list.add(Character.getNumericValue(str.charAt(i)));
        }
        Collections.sort(list, Collections.reverseOrder());
        int sum = 0;
        if (list.get(list.size() - 1) != 0) {
            ans.append(-1);
        }
        else{
            sum = 0;
            for (int i = 0; i < list.size(); ++i) {
                sum += list.get(i);
            }
            if (sum % 3 == 0) {
//            Collections.sort(list);
                for (int i = 0; i < list.size(); ++i) {
                    ans.append(list.get(i));
                }
            }
            else{
                ans.append(-1);
            }
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
