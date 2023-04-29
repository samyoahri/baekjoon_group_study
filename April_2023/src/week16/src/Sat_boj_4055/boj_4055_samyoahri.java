package Sat_boj_4055;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Party implements Comparable<Party>{
    int start;
    int end;
    public Party(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Party o1) {
        if (this.end > o1.end) {
            return 1;
        } else if (this.end < o1.end) {
            return -1;
        } else{
            if (this.start > o1.start) {
                return 1;
            } else if (this.start < o1.start) {
                return -1;
            } else{
                return 0;
            }
        }
    }
}
public class boj_4055_samyoahri {
    static boolean timeTable[];

    static int findIndexPossibleToJoin(int start, int end) {
        for (int i = end - 1; i >= start; --i) {
            if(!timeTable[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N;
        int d = 0;
        while ((N = Integer.parseInt(in.readLine())) != 0) {
            ArrayList<Party> parties = new ArrayList<>();
            for (int i = 0; i < N; ++i) {
                StringTokenizer st = new StringTokenizer(in.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                parties.add(new Party(start, end));
            }
//            Collections.sort(parties, Collections.reverseOrder());
            Collections.sort(parties);
//            System.out.println("[" + (d+1) + "번째 for문]");
//            for (Party party : parties) {
//                System.out.println("party.start = " + party.start);
//                System.out.println("party.end = " + party.end);
//            }
            int cnt = 0;
            for (int hour = 8; hour < 24; ++hour) {
                for (int minute = 0; minute < 2; ++minute) {
                    for (int i = 0; i < parties.size(); ++i) {
                        Party curr = parties.get(i);
                        if (curr.start <= hour && curr.end - 1 >= hour) {
                            ++cnt;
                            parties.remove(i);
                            break;
                        }
                    }
                }
            }

            ans.append("On day " + (++d) + " Emma can attend as many as " + cnt + " parties.\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
