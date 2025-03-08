package boj_1764_sat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_1764_samyoahri {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static HashMap <String, Boolean> dict = new HashMap<>();
    public static void main(String[] args) throws IOException {
//        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n, m;
        String[] input = bf.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        int count = 0;
        for(int i = 0; i < n; i++){
            String personNotHeard = bf.readLine();
            dict.put(personNotHeard, false);
        }
        for(int j = 0; j < m; j++){
            String personNotSeen = bf.readLine();
            if(dict.get(personNotSeen)==null){
                continue;
            }
            if(!dict.get(personNotSeen)){
                dict.replace(personNotSeen, true);
                count++;
            }
        }
        System.out.println(count);

        ArrayList<String> result = new ArrayList<>();
        for(String key: dict.keySet()){
            if(dict.get(key)==true) {
                result.add(key);
            }
        }
        Collections.sort(result);
        for(String str : result){
            System.out.println(str);
        }
        bf.close();
    }
}
