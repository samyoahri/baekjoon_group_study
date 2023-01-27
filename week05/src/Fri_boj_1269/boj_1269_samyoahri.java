package Fri_boj_1269;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class boj_1269_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        //집합 A의 원소개수
        int A_n = Integer.parseInt(st.nextToken());
        //집합 B의 원소 개수
        int B_n = Integer.parseInt(st.nextToken());

        HashSet<Integer> Aset = new HashSet<>();
        HashSet<Integer> Bset = new HashSet<>();

        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < A_n; i++) {
            Aset.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < B_n; i++) {
            Bset.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;
        for (int A_element : Aset) {
            if (!Bset.contains(A_element)) {
                cnt++;
            }
        }

        Iterator<Integer> Biter = Bset.iterator();
        while (Biter.hasNext()) {
            int B_element = Biter.next();
            if (!Aset.contains(B_element)) {
                cnt++;
            }
        }

        ans.append(cnt);

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
