package Mon_boj_3078_gold;

import java.io.*;
import java.util.*;
class Student{
    int idx;
    String name;
    int length;
    public Student(int idx, String name) {
        this.idx = idx;
        this.name = name;
        this.length = name.length();
    }
    public int len(){
        return name.length();
    }
}
public class boj_3078_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Student> friendFilter = new LinkedList<>();
        StringBuilder res = new StringBuilder();

        StringTokenizer integer = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(integer.nextToken());
        int k = Integer.parseInt(integer.nextToken());

        long bfCnt = 0;
        int[] buf = new int[21];

        //친구란 반 등수차이가 k이하여야 친구이다
        //좋은친구란 이름길이까지 같은 친구가 좋은 친구이다.
        Student student = new Student(1, in.readLine());
        for(int i = 2; i <=n; i++){
            Student friend = new Student(i, in.readLine());
            if (friendFilter.size() != k) {
                friendFilter.add(friend);
                buf[friend.length]++;
            }
//            else if (friendFilter.size() == k){
            else{
                int stdBufIdx = student.len();
                bfCnt += buf[stdBufIdx];

                int frFilterBufIdx =friendFilter.peek().length;
                buf[frFilterBufIdx]--;
                student = friendFilter.poll();

                int frBufIdx = friend.len();
                friendFilter.add(friend);
                buf[frBufIdx]++;
            }
        }
        while(!friendFilter.isEmpty()){
            int stdBufIdx = student.len();
            bfCnt += buf[stdBufIdx];

            int frFilterBufIdx =friendFilter.peek().length;
            buf[frFilterBufIdx]--;
            student = friendFilter.poll();
        }
        res.append(bfCnt);

        out.write(res.toString());
        out.flush();

        in.close();
        out.close();
    }
    //시간 초과코드
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Queue<String> friendFilter = new LinkedList<>();
//        Iterator<String> iter = null;
//        StringBuilder res = new StringBuilder();
//
//        StringTokenizer integer = new StringTokenizer(in.readLine());
//
//        int n = Integer.parseInt(integer.nextToken());
//        int k = Integer.parseInt(integer.nextToken());
////        System.out.println("n = " + n);
////        System.out.println("k = " + k);
//
//        StringBuilder student = new StringBuilder(in.readLine());
//        int bfCnt = 0;
//        //친구란 반 등수차이가 k이하여야 친구이다
//        //좋은친구란 이름길이까지 같은 친구가 좋은 친구이다.
//        for(int i = 1; i < n; i++){
//            String name = in.readLine();
//            if(friendFilter.size() < k){
//                friendFilter.add(name);
//            }
//            else if (friendFilter.size() == k) {
//                iter = friendFilter.iterator();
//                while(iter.hasNext()){
//                    if(iter.next().length() == student.length()){
//                        bfCnt++;
//                    }
//                }
//                student.delete(0, student.length());
//                student.append(friendFilter.poll());
//                friendFilter.add(name);
//            }
//            else{
//                break;
//            }
////            System.out.println("i = " + i);
////            System.out.println("friendFilter = " + friendFilter);
////            System.out.println();
//        }
//        while(!friendFilter.isEmpty()){
//            iter = friendFilter.iterator();
//            while(iter.hasNext()){
//                if(iter.next().length() == student.length()){
//                    bfCnt++;
//                }
//            }
//            student = new StringBuilder(friendFilter.poll());
////            System.out.println("i = ");
////            System.out.println("friendFilter = " + friendFilter);
////            System.out.println();
//        }
////        for(String str : friendFilter){
////            System.out.println(str);
////        }
//        res.append(bfCnt);
//
//        out.write(res.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
}
