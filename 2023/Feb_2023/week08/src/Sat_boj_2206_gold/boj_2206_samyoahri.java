package Sat_boj_2206_gold;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;
class MatCoordinate{
    int i;
    int j;
    int cnt;
    boolean hamPossible;

    public MatCoordinate(int i, int j, int cnt, boolean hamPossible) {
        this.i = i;
        this.j = j;
        this.cnt = cnt;
        this.hamPossible = hamPossible;
    }
}
public class boj_2206_samyoahri {
    static byte[][] graph;
    static boolean[][][] visited;
    static int N, M;
    static byte[] dx = {1, 0, -1, 0};
    static byte[] dy = {0, 1, 0, -1};
    static int bfs(){
        Queue<MatCoordinate> queue = new ArrayDeque<>();
        queue.offer(new MatCoordinate(1, 1, 1, true));
        visited[1][1][0] = true;
        while (!queue.isEmpty()) {
            MatCoordinate now = queue.poll();
            int nextI = now.i, nextJ = now.j, nextCnt = now.cnt;
            boolean nextPossible;
            if (nextI == N && nextJ == M) {
                return nextCnt;
            }
            for (int l = 0; l < 4; l++) {
                nextI = now.i + dy[l];
                nextJ = now.j + dx[l];
                nextCnt = now.cnt + 1;
                nextPossible = now.hamPossible;
                if (nextI <= 0 || nextJ <= 0 || nextI > N || nextJ > M) {
                    continue;
                }
                //망치를 사용하지 않은 경우
                if (nextPossible) {
                    //벽이 아닐때
                    if (graph[nextI][nextJ]==0 && !visited[nextI][nextJ][0]) {
                        queue.offer(new MatCoordinate(nextI, nextJ, nextCnt, nextPossible));
                        visited[nextI][nextJ][0] = true;
                    }
                    //벽일 때
                    else if (graph[nextI][nextJ]==1 && !visited[nextI][nextJ][0]) {
                            queue.offer(new MatCoordinate(nextI, nextJ, nextCnt, false));
                            visited[nextI][nextJ][0] = true;
                        }
                }
                else{
                    //벽이 아닐때
                    if (graph[nextI][nextJ]==0 && !visited[nextI][nextJ][1]) {
                        queue.offer(new MatCoordinate(nextI, nextJ, nextCnt, nextPossible));
                        visited[nextI][nextJ][1] = true;
                    }
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new byte[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1][2];
        for (int i = 0; i <= N; i++) {
            if (i == 0) {
                for (int j = 0; j <= M; j++) {
                    graph[i][j] = -1;
                }
            }
            else{
                graph[i][0] = -1;
            }
        }
        for (int i = 1; i <= N; i++) {
            String[] strings = in.readLine().split("");
            for (int j = 1; j <= M; j++) {
                graph[i][j] = Byte.parseByte(strings[j - 1]);
            }
        }
        int shortestPathCount = bfs();
        ans.append(shortestPathCount);
//6 6
//011111
//011011
//010010
//010110
//010110
//000110
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
//    //메모리초과 코드
///*메모리 초과 코드*/
//import java.io.*;
//        import java.util.ArrayDeque;
//        import java.util.Queue;
//        import java.util.StringTokenizer;
//class MatCoordinate{
//    int i;
//    int j;
//    int cnt;
//    boolean hamPossible;
//
//    public MatCoordinate(int i, int j, int cnt, boolean hamPossible) {
//        this.i = i;
//        this.j = j;
//        this.cnt = cnt;
//        this.hamPossible = hamPossible;
//    }
//}
//public class Main {
//    /***********다른자리**********/
//    static byte[][] graph;
//    static byte[][] visited;
//    /***************************/
//    static int N, M;
//    static byte[] dx = {1, 0, -1, 0};
//    static byte[] dy = {0, 1, 0, -1};
//    static int bfs(){
//        Queue<MatCoordinate> queue = new ArrayDeque<>();
//        queue.offer(new MatCoordinate(1, 1, 1, true));
//        visited[1][1] = 1;
//        while (!queue.isEmpty()) {
//            MatCoordinate now = queue.poll();
//            int nextI = now.i, nextJ = now.j, nextCnt = now.cnt;
//            boolean nextPossible;
//            if (nextI == N && nextJ == M) {
//                return nextCnt;
//            }
//            for (int l = 0; l < 4; l++) {
//                nextI = now.i + dx[l];
//                nextJ = now.j + dy[l];
//                nextCnt = now.cnt + 1;
//                nextPossible = now.hamPossible;
//                if (nextI <= 0 || nextJ <= 0 || nextI > N || nextJ > M) {
//                    continue;
//                }
//                /***********다른자리**********/
//                //벽이 아닐때
//                if (graph[nextI][nextJ]==0 && visited[nextI][nextJ]<=1) {
//                    queue.offer(new MatCoordinate(nextI, nextJ, nextCnt, nextPossible));
//                    visited[nextI][nextJ] = 1;
//                }
//                //벽일 때
//                else if(graph[nextI][nextJ]==1 && visited[nextI][nextJ] <= 1 && nextPossible){
//                    queue.offer(new MatCoordinate(nextI, nextJ, nextCnt, false));
//                    visited[nextI][nextJ] = 2;
//                }
//                /***************************/
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        /***********다른자리**********/
//        graph = new byte[N + 1][M + 1];
//        visited = new byte[N + 1][M + 1];
//        /**************************/
//        for (int i = 0; i <= N; i++) {
//            if (i == 0) {
//                for (int j = 0; j <= M; j++) {
//                    graph[i][j] = -1;
//                }
//            }
//            else{
//                graph[i][0] = -1;
//            }
//        }
//        for (int i = 1; i <= N; i++) {
//            String[] strings = in.readLine().split("");
//            for (int j = 1; j <= M; j++) {
//                /***********다른자리**********/
//                graph[i][j] = Byte.parseByte(strings[j - 1]);
//                /**************************/
//            }
//        }
//        int shortestPathCount = bfs();
//        ans.append(shortestPathCount);
////6 6
////011111
////011011
////010010
////010110
////010110
////000110
//        out.write(ans.toString());
//        out.flush();
//        in.close();
//        out.close();
//    }
//}
    //틀린코드
//import java.io.*;
//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//class MatCoordinate{
//    int i;
//    int j;
//    int pathCnt;
//    boolean hammerPossible;
//    boolean wallPossible;
//
//    public MatCoordinate(int i, int j, int pathCnt, boolean hammerPossible, boolean wallPossible) {
//        this.i = i;
//        this.j = j;
//        this.pathCnt = pathCnt;
//        this.hammerPossible = hammerPossible;
//        this.wallPossible = wallPossible;
//    }
//
//}
//public class boj_2206_samyoahri {
//    static int[][] graph;
//    static boolean[][] visited;
//
//    private static MatCoordinate calNextIAndJPathCntHam(int l, int nowI, int nowJ, int nowPathCnt, boolean HamPos, boolean wallPos) {
//        MatCoordinate next;
//        int nextI = nowI, nextJ = nowJ, nextPathCnt = nowPathCnt + 1;
//        boolean nextHamPos = HamPos, nextWallPos = wallPos;
//        if ((HamPos) &&
//                (graph[nowI][nowJ + 1] == 1 || graph[nowI + 1][nowJ] == 1
//                        || graph[nowI - 1][nowJ] == 1 || graph[nowI][nowJ - 1] == 1)) {
//            if (l == 1) {
//                nextJ = nowJ + 1;
//                nextHamPos = false;
//                nextWallPos = true;
//            } else if (l == 2) {
//                nextI = nowI + 1;
//                nextHamPos = false;
//                nextWallPos = true;
//            } else if (l == 3) {
//                nextI = nowI - 1;
//                nextHamPos = false;
//                nextWallPos = true;
//            } else if (l == 4) {
//                nextI = nowI - 1;
//                nextHamPos = false;
//                nextWallPos = true;
//            } else {
////                next = new MatCoordinate(0, 0, 0, false, false);
//            }
//        } else {
//            wallPos = false;
//            if (l == 1) {
//                nextJ = nowJ + 1;
//            } else if (l == 2) {
//                nextI = nowI + 1;
//            } else if (l == 3) {
//                nextI = nowI - 1;
//            } else if (l == 4) {
//                nextI = nowI - 1;
//            } else {
////                next = new MatCoordinate(0, 0, 0, false, false);
//            }
//        }
//        if (nextI <= 0 || nextJ <= 0 || nextI > N || nextJ > M) {
////            continue;
//            return new MatCoordinate(1, 1, 0, false, false);
//        }
//        next = new MatCoordinate(nextI, nextJ, nextPathCnt, nextHamPos, nextWallPos);
//        return next;
//    }
//    //    6 6
////            011000
////            111010
////            011010
////            010010
////            010010
////            000010
//    public static int bfs() {
//        Queue<MatCoordinate> queue = new ArrayDeque<>();
//        queue.offer(new MatCoordinate(1, 1, 1, true, false));
//        visited[1][1] = true;
//        visited[0][0] = true;
//        while (!queue.isEmpty()) {
//            MatCoordinate now = queue.poll();
//            int nowI = now.i;
//            int nowJ = now.j;
//            int nowPathCnt = now.pathCnt;
//            boolean nowHamPos = now.hammerPossible;
//            boolean nowWallPos = now.wallPossible;
//            if (nowI == N && nowJ == M) {
//                return nowPathCnt;
//            }
//            System.out.print("[nowI = " + nowI + " ");
//            System.out.println("nowJ = " + nowJ + "]");
//            for (int l = 1; l <= 4; l++) {
//                MatCoordinate next = calNextIAndJPathCntHam(l, nowI, nowJ, nowPathCnt, nowHamPos, nowWallPos);
//                int nextI = next.i;
//                int nextJ = next.j;
////                int nextPathCnt = next.pathCnt;
//                boolean nextHamPos = next.hammerPossible;
//                boolean nextWallPos = next.wallPossible;
//
//                if (!visited[nextI][nextJ]) {
//                    if (nextWallPos && graph[nextI][nextJ] == 1) {
//                        queue.offer(next);
//                        visited[nextI][nextJ] = true;
//                    }
//                    else if((graph[nextI][nextJ] == 0)){
//                        queue.offer(next);
//                        visited[nextI][nextJ] = true;
//                        if (nextHamPos) {
//                            visited[nextI][nextJ] = true;
//                        }
//                    }
//                }
//                System.out.print("nextI = " + nextI + " ");
//                System.out.println("nextJ = " + nextJ);
//            }
//        }
//        return -1;
//    }
//    static int N;
//    static int M;
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        graph = new int[N + 1][M + 1];
//        visited = new boolean[N + 1][M + 1];
//        for (int i = 0; i <= N; i++) {
//            if (i == 0) {
//                for (int j = 0; j <= M; j++) {
//                    graph[i][j] = -1;
//                }
//            }
//            else{
//                graph[i][0] = -1;
//            }
//        }
//        for (int i = 1; i <= N; i++) {
//            String[] strings = in.readLine().split("");
//            for (int j = 1; j <= M; j++) {
//                graph[i][j] = Integer.parseInt(strings[j - 1]);
//            }
//        }
//        int shortestPathCount = bfs();
//        for (int arr[] : graph) {
//            for (int integer : arr) {
//                System.out.print(integer + " ");
//            }
//            System.out.println();
//        }
//        ans.append(shortestPathCount);
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}


    //틀린코드
    //벽을 1번 뚫는 것이 최단길이여서 방문을 했지만, 그로인해 망치가 없어서 더이상 못가게 된 상태에서,
    //돌아가는 루트가 있지만, 이미 벽을 부수면서 벽1개만 부수면 갈 수 있는자리가 방문처리되서 더이상 못가는 코드
//import java.io.*;
//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//class MatCoordinate{
//    int i;
//    int j;
//    int pathCnt;
//    boolean hammerPossible;
//    boolean wallPossible;
//
//    public MatCoordinate(int i, int j, int pathCnt, boolean hammerPossible, boolean wallPossible) {
//        this.i = i;
//        this.j = j;
//        this.pathCnt = pathCnt;
//        this.hammerPossible = hammerPossible;
//        this.wallPossible = wallPossible;
//    }
//
//}
//public class boj_2206_samyoahri {
//    static int[][] graph;
//    static boolean[][] visited;
//
//    private static MatCoordinate calNextIAndJPathCntHam(int l, int nowI, int nowJ, int nowPathCnt, boolean HamPos, boolean wallPos) {
//        MatCoordinate next;
//        try {
//            if ((HamPos) &&
//                    (graph[nowI][nowJ + 1] == 1 || graph[nowI + 1][nowJ] == 1
//                            || graph[nowI - 1][nowJ] == 1 || graph[nowI][nowJ - 1] == 1)) {
//
//                if (l == 1) {
//                    next = new MatCoordinate(nowI, nowJ + 1, nowPathCnt + 1, false, true);
////                    graph[nowI][nowJ + 1] = 0;
//                } else if (l == 2) {
//                    next = new MatCoordinate(nowI + 1, nowJ, nowPathCnt + 1, false, true);
////                    graph[nowI + 1][nowJ] = 0;
//                } else if (l == 3) {
//                    next = new MatCoordinate(nowI - 1, nowJ, nowPathCnt + 1, false, true);
////                    graph[nowI - 1][nowJ] = 0;
//                } else if (l == 4) {
//                    next = new MatCoordinate(nowI, nowJ - 1, nowPathCnt + 1, false, true);
////                    graph[nowI][nowJ - 1] = 0;
//                } else {
//                    next = new MatCoordinate(0, 0, 0, false, false);
//                }
//            } else {
//                if (l == 1) {
//                    next = new MatCoordinate(nowI, nowJ + 1, nowPathCnt + 1, HamPos, false);
//                } else if (l == 2) {
//                    next = new MatCoordinate(nowI + 1, nowJ, nowPathCnt + 1, HamPos, false);
//                } else if (l == 3) {
//                    next = new MatCoordinate(nowI - 1, nowJ, nowPathCnt + 1, HamPos, false);
//                } else if (l == 4) {
//                    next = new MatCoordinate(nowI, nowJ - 1, nowPathCnt + 1, HamPos, false);
//                } else {
//                    next = new MatCoordinate(0, 0, 0, false, false);
//                }
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            next = new MatCoordinate(0, 0, 0, false, false);
//        }
//        return next;
//    }
////    6 6
////            011000
////            111010
////            011010
////            010010
////            010010
////            000010
//    public static int bfs() {
//        Queue<MatCoordinate> queue = new ArrayDeque<>();
//        queue.offer(new MatCoordinate(1, 1, 1, true, false));
//        visited[1][1] = true;
//        while (!queue.isEmpty()) {
//            MatCoordinate now = queue.poll();
//            int nowI = now.i;
//            int nowJ = now.j;
//            int nowPathCnt = now.pathCnt;
//            boolean nowHamPos = now.hammerPossible;
//            boolean nowWallPos = now.wallPossible;
//            if (nowI == N && nowJ == M) {
//                return nowPathCnt;
//            }
//            System.out.print("[nowI = " + nowI + " ");
//            System.out.println("nowJ = " + nowJ + "]");
//            for (int l = 1; l <= 4; l++) {
//                MatCoordinate next = calNextIAndJPathCntHam(l, nowI, nowJ, nowPathCnt, nowHamPos, nowWallPos);
//                int nextI = next.i;
//                int nextJ = next.j;
////                int nextPathCnt = next.pathCnt;
//                boolean nextHamPos = next.hammerPossible;
//                boolean nextWallPos = next.wallPossible;
//                if (nextI <= 0 || nextJ <= 0 || nextI > N || nextJ > M) {
//                    continue;
//                }
//                if (nextWallPos && graph[nextI][nextJ] == 1) {
//                    queue.offer(next);
//                    visited[nextI][nextJ] = true;
//                }
//                else if((graph[nextI][nextJ] == 0 && !visited[nextI][nextJ])){
//                    queue.offer(next);
//                    visited[nextI][nextJ] = true;
//                }
//
//                System.out.print("nextI = " + nextI + " ");
//                System.out.println("nextJ = " + nextJ);
//            }
//        }
//        return -1;
//    }
//    static int N;
//    static int M;
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        graph = new int[N + 1][M + 1];
//        visited = new boolean[N + 1][M + 1];
//        for (int i = 0; i <= N; i++) {
//            if (i == 0) {
//                for (int j = 0; j <= M; j++) {
//                    graph[i][j] = -1;
//                }
//            }
//            else{
//                graph[i][0] = -1;
//            }
//        }
//        for (int i = 1; i <= N; i++) {
//            String[] strings = in.readLine().split("");
//            for (int j = 1; j <= M; j++) {
//                graph[i][j] = Integer.parseInt(strings[j - 1]);
//            }
//        }
//        int shortestPathCount = bfs();
////        for (int arr[] : graph) {
////            for (int integer : arr) {
////                System.out.print(integer + " ");
////            }
////            System.out.println();
////        }
//        ans.append(shortestPathCount);
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//
//
//}
