package Free;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj_15997_samyoahri {
    static HashMap<String, Integer> nameBuffer;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        nameBuffer = new HashMap<>();
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int idx = 0;
        while (st.hasMoreTokens()) {
            ++idx;
            nameBuffer.put(st.nextToken(), idx);
        }
//        for(Map.Entry<String, Integer> entry:nameBuffer.entrySet()){
//            System.out.print("entry.getKey() = " + entry.getKey() + " ");
//            System.out.println("entry.getValue() = " + entry.getValue());
//        }
        double[][] winRateTable = new double[5][5];
        double[][] drawRateTable = new double[5][5];
        double[][] loseRateTable = new double[5][5];

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            String country1 = st.nextToken();
            String country2 = st.nextToken();
            int country1Num = nameBuffer.get(country1);
            int country2Num = nameBuffer.get(country2);
            double winRate = Double.parseDouble(st.nextToken());
            double drawRate = Double.parseDouble((st.nextToken()));
            double loseRate = Double.parseDouble((st.nextToken()));
            winRateTable[country1Num][country2Num] = winRate;
//            loseRateTable[country2Num][country1Num] = winRate;
            drawRateTable[country1Num][country2Num] = drawRate;
            drawRateTable[country2Num][country1Num] = drawRate;
//            loseRateTable[country1Num][country2Num] = loseRate;
            winRateTable[country2Num][country1Num] = loseRate;
        }

        System.out.println("winRateTable");
        for (double[] arr : winRateTable) {
            for (double fl : arr) {
                System.out.print(fl+ " ");
            }
            System.out.println();
        }
        System.out.println("drawRateTable");
        for (double arr[] : drawRateTable) {
            for (double fl : arr) {
                System.out.print(fl+ " ");
            }
            System.out.println();
        }
////        System.out.println("loseRateTable");
////        for (float arr[] : loseRateTable) {
////            for (float fl : arr) {
////                System.out.print(fl+ " ");
////            }
////            System.out.println();
////        }
//        nameBuffer.put("WWW", 1);
//        nameBuffer.put("WWL", 2);
//        nameBuffer.put("WLW", 3);
//        nameBuffer.put("LWW", 4);
////        nameBuffer.put("WLL", 5);
////        nameBuffer.put("LWL", 6);
////        nameBuffer.put("LLW", 7);
////        nameBuffer.put("LLL", 8);
//        int[][] totalTable = new int[5][9];
        double[][] expectTable = new double[5][5];
        double[] totalArr = new double[5];
        for (int i = 1; i < 5; i++) {
            double res = 0.000;
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    continue;
                }
                expectTable[i][j] = winRateTable[i][j] * 3.000 + drawRateTable[i][j] * 1.000;
                res+=expectTable[i][j];
            }
            totalArr[i] = res;
//            ans.append(res + "\n");
        }
        System.out.println("expectTable");
        for (double arr[] : expectTable) {
            for (double fl : arr) {
                System.out.print(fl+ " ");
            }
            System.out.println();
        }
        System.out.println("totalArr");
        for (double dob : totalArr) {
            System.out.print(dob + " ");
        }
        System.out.println();
        int cnt9 = 0, cnt0 = 0;
        int[] cnt9Arr = new int[5];
        int[] cnt0Arr = new int[5];
        for (int i = 1; i <= 4; i++) {
            if (totalArr[i] == 0.0) {
                ++cnt0;
                cnt0Arr[i] = i;
            } else if (totalArr[i] == 9.0) {
                ++cnt9;
                cnt9Arr[i] = i;
            }
        }
        System.out.println("cnt0 = " + cnt0);
        System.out.println("cnt9 = " + cnt9);
        if (cnt9 == 4) {
            ans.append(1.0000000000 + "\n");
            ans.append(1.0000000000 + "\n");
            ans.append(1.0000000000 + "\n");
            ans.append(1.0000000000 + "\n");
        } else if (cnt9 == 3 && cnt0 == 0) {

        } else if(cnt0==3 && cnt0 == 1) {

        }
        else if (cnt0 == 4) {
            ans.append(0.0000000000 + "\n");
            ans.append(0.0000000000 + "\n");
            ans.append(0.0000000000 + "\n");
            ans.append(0.0000000000 + "\n");
        }


        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
