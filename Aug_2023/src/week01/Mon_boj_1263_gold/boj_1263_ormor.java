package week01.Mon_boj_1263_gold;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_1263_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(in.readLine());
        int T, S;
        ArrayList<taskInfo> taskList = new ArrayList<>();
        while(N-- >0){
            st = new StringTokenizer(in.readLine());
            T = Integer.parseInt(st.nextToken()); // 소요시간
            S = Integer.parseInt(st.nextToken()); // 마감시각
            taskInfo task = new taskInfo(T,S);
            taskList.add(task);
        }

        Collections.sort(taskList);
//        System.out.println("입력 받은 회의 목록");
//        System.out.println(taskList);

        int nowTaskStart;
        int preTaskStart;
        for(int i=1; i<taskList.size(); i++){
            nowTaskStart = taskList.get(i).deadline - taskList.get(i).workingTime;
            preTaskStart = taskList.get(i-1).deadline - taskList.get(i-1).workingTime;
//            System.out.println("--------------------------------");
//            System.out.println(i-1+"번째 작업 시작시간 : "+preTaskStart);
//            System.out.println(i-1+"번째 작업 마감시간 : "+taskList.get(i-1).deadline);
//            System.out.println(i+"번째 작업 시작시간 : "+nowTaskStart);
//            System.out.println(i+"번째 작업 마감시간 : "+taskList.get(i).deadline);
//            System.out.println("--------------------------------");
            if(preTaskStart < taskList.get(i).deadline){
                taskList.get(i).setDeadline(preTaskStart);
//                System.out.println(i+"번째 작업 마감시간 수정 -> "+taskList.get(i).deadline);
            }
        }
        int answer = taskList.get(taskList.size()-1).deadline - taskList.get(taskList.size()-1).workingTime;
        if(answer < 0){
            ans.append(-1);
        }
        else{
            ans.append(answer);
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}

class taskInfo implements Comparable<taskInfo>{
    int workingTime; // T
    int deadline; // S

    public taskInfo(int workingTime, int deadline) {
        this.workingTime = workingTime;
        this.deadline = deadline;
    }
    public void setDeadline(int deadline){
        this.deadline = deadline;
    }
    @Override
    public int compareTo(taskInfo task) {
        if (task.deadline < deadline) { return -1; }
        else if (task.deadline > deadline) { return 1; }
        return 0;
    }
    @Override
    public String toString() {
        return "[ " + this.workingTime + " - " + this.deadline + " ]";
    }
}