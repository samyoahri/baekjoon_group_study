package Sun_boj_2910;

import java.io.*;
import java.security.Key;
import java.util.*;

class Info implements Comparable<Info>{
    int idx;
    int freq;

    public Info(int idx, int freq) {
        this.idx = idx;
        this.freq = freq;
    }

    @Override
    public int compareTo(Info o) {
        if (this.freq == o.freq) {
            return (this.idx - o.idx);
        }
        return -(this.freq - o.freq);
    }
}
public class boj_2910_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        String[] strings = in.readLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int C = Integer.parseInt(strings[1]);

        strings = in.readLine().split(" ");
        Map<Integer, Info> freqMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(strings[i]);
            if (!freqMap.containsKey(key)) {
                freqMap.put(key, new Info(i, 1));
            }
            else{
                Info value = freqMap.get(key);
//                value.freq++;
                freqMap.put(key, new Info(value.idx, value.freq+1));
            }
//            System.out.println("[i = " + i +"]");
//            for (Map.Entry<Integer, Freq> entry : freqMap.entrySet()) {
//                System.out.println("<key:" + entry.getKey() + "> =>" + " freq:" + entry.getValue().freq + " idx:" + entry.getValue().idx );
//            }
        }
        List<Integer> list = new ArrayList<>(freqMap.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (freqMap.get(o1).freq == freqMap.get(o2).freq) {
                    return freqMap.get(o1).idx - freqMap.get(o2).idx;
                }
                else{
                    return -(freqMap.get(o1).freq - freqMap.get(o2).freq);
                }
            }
        });
//        for (Map.Entry<Integer, Freq> entry : freqMap.entrySet()) {
//            System.out.println("<key:" + entry.getKey() + "> =>" + " freq:" + entry.getValue().freq + " idx:" + entry.getValue().idx );
//        }

//        List<Integer> list = new ArrayList<Integer>(freqMap.keySet());
//        Collections.sort(list);

//        Collections.sort(list, new Comparator<>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (freqMap.get(o1.intValue()).freq == freqMap.get(o2.intValue()).freq) {
//                    return compare(freqMap.get(o1.intValue()).idx, freqMap.get(o2.intValue()).idx);
//                }
//                else{
//                    return compare(freqMap.get(o1.intValue()).freq, freqMap.get(o2.intValue()).freq);
//                }
//            }
//        });

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            int key = iter.next();
            for (int i = 0; i < freqMap.get(key).freq; i++) {
                ans.append(key + " ");
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
    //메모리 초과
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        //메시지 길이
//        int N = Integer.parseInt(st.nextToken());
//        //
//        int C = Integer.parseInt(st.nextToken());
//        int[] buf = new int[C+1];
//        Arrays.fill(buf, -1);
//
//        Map<Integer, Integer> freqMap = new HashMap<>();
//
////        String[] strings = in.readLine().split(" ");
//        st = new StringTokenizer(in.readLine(), " ");
//        for (int i = 0; i < N; i++) {
//            int num = Integer.parseInt(st.nextToken());
////            int num = Integer.parseInt(strings[i]);
//            if (buf[num] == -1) {
//                buf[num] = i;
//            }
//
//            if (!freqMap.containsKey(num)) {
//                freqMap.put(num, 1);
//            }
//            else{
////                freqMap.put(num, freqMap.get(num) + 1);
//                freqMap.replace(num, freqMap.get(num) + 1);
//            }
//        }
//
//////        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
//////            System.out.println("entry => " + entry);
//////        }
////        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
//////        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
////        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
////            @Override
////            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
////                if (o1.getValue() == o2.getValue()) {
////                    return Integer.compare(buf[o1.getKey()], buf[o2.getKey()]);
////                }
////                else{
////                    return -Integer.compare(o1.getValue(), o2.getValue());
////                }
////            }
////        });
////        for(Map.Entry<Integer, Integer> entry : entryList){
////            int key = entry.getKey();
////            int value = entry.getValue();
////            while (value-- > 0) {
////                ans.append(key + " ");
////            }
////        }
//        List<Integer> keyset = new ArrayList<>(freqMap.keySet());
//        Collections.sort(keyset, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (freqMap.get(o1.intValue()) == freqMap.get(o2.intValue())) {
//                    return Integer.compare(buf[o1.intValue()], buf[o2.intValue()]);
//                }
//                else{
//                    return -Integer.compare(freqMap.get(o1), freqMap.get(o2));
//                }
//            }
//        });
//        Iterator<Integer> iter = keyset.iterator();
//        while (iter.hasNext()) {
//            Integer key = iter.next();
//            for (int i = 0; i < freqMap.get(key); i++) {
//                ans.append(key + " ");
//            }
//        }
//
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
