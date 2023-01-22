package Sun_NewYear_boj_11286;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

import static java.lang.Math.abs;

class absAsceding implements Comparator {
    public int compare(Object o1, Object o2) {
        int a = (int)o1;
        int b = (int)o2;

        if (abs(a) > abs(b)) {
            return 1;
        } else if (abs(a) == abs(b)) {
            if (a > b) {
                return 1;
            }
            else if(a<b){
                return -1;
            } else if (a == b) {
                return 0;
            }
        }
        else if(abs(a) < abs(b)){
            return -1;
        }
        return -2;
    }
}
public class boj_11286_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        PriorityQueue<Integer> heap = new PriorityQueue<>(new absAsceding());

        int N = Integer.parseInt(in.readLine());
        int x;
        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(in.readLine());
            if (x == 0) {
                if (heap.isEmpty()) {
                    ans.append("0\n");
                }
                else{
                    ans.append(heap.poll() + "\n");
                }

            }
            else{
                heap.add(x);
            }
        }

        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}
