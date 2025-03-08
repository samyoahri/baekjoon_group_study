package Free;

import java.io.*;
import java.util.*;

class Pair1{
    int num;
    int cnt;
    public Pair1(int num, int cnt) {
        this.num = num;
        this.cnt = cnt;
    }
}
public class boj_2644_samyoahri {
    static List<Integer>[] people;
    static int cnt = 0;
    static boolean visited[];
    static int bfs1(int person1, int person2) {
        Arrays.fill(visited, false);
        Queue<Pair1> queue = new ArrayDeque<>();
        queue.offer(new Pair1(person1, -1));
        visited[person1] = true;
        while (!queue.isEmpty()) {
            Pair1 pair1 = queue.poll();
            int now = pair1.num;
            int cnt = pair1.cnt + 1;
//            System.out.println("now = " + now);
            if (now == person2) {
                return cnt;
            }
//            System.out.println("people[now].size() = " + people[now].size());
            for (int j = 0; j < people[now].size(); j++) {
                int next = people[now].get(j);
//                System.out.println("next = " + next);
                if (!visited[next]) {
                    queue.offer(new Pair1(next, cnt));
                    visited[next] = true;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;
        int N = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine(), " ");
        int person1 = Integer.parseInt(st.nextToken());
        int person2 = Integer.parseInt(st.nextToken());
//        int[] people = new int[N + 1];
        people = new List[N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < people.length; i++) {
            people[i] = new ArrayList<>();
        }

        //부모 자식들 간의 관계 수
        int M = Integer.parseInt(in.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            //자식번호
            int x = Integer.parseInt(st.nextToken());
            //부모번호
            int y = Integer.parseInt(st.nextToken());
            people[x].add(y);
            people[y].add(x);
        }
        int res = bfs1(person1, person2);
        ans.append(res);


        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
