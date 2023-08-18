package week27.src.boj_1931_Thu;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_1931_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(in.readLine());
        ArrayList<MeetingInfo> meetingList = new ArrayList<>();

        while(N-- >0){
            st = new StringTokenizer(in.readLine());
            int startTime = Integer.parseInt(st.nextToken());;
            int endTime = Integer.parseInt(st.nextToken());
            MeetingInfo meet = new MeetingInfo(startTime,endTime);
            meetingList.add(meet);
        }

        Collections.sort(meetingList);
        // System.out.println("입력 받은 회의 목록");
        // System.out.println(meetingList);

        int checkEnd = 0; // 회의 종료 시간 임시 저장
        int confirmedMeeting = 0; // 확정된 회의 개수
        for(int i=0; i<meetingList.size(); i++){
            int indexStart = meetingList.get(i).startTime;
            int indexEnd = meetingList.get(i).endTime;
//            System.out.println("--------------------------------");
//            System.out.println((i+1)+"번째 회의 시작시간 : "+indexStart);
//            System.out.println((i+1)+"번째 회의 종료시간 : "+indexEnd);
//            System.out.println("--------------------------------");
            if(checkEnd <= indexStart){
                checkEnd = indexEnd;
                confirmedMeeting++;
//                System.out.println("확정된 전체회의 종료시간 업데이트 -> "+checkEnd);
//                System.out.println("확정된 회의 개수 : "+confirmedMeeting);
            }
        }
        // System.out.println("최종 답안 : "+confirmedMeeting);

        ans.append(confirmedMeeting);
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}

class MeetingInfo implements Comparable<MeetingInfo>{
    int startTime;
    int endTime;
    public MeetingInfo(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    // 해당 객체의 Comparable을 구현한 compareTo() 메소드를 참조하여, 정렬 순서를 재결정
    // 즉, 정렬할 객체가 Comparable interface를 구현하고, compareTo() 메소드 안에 정렬 기준이 정의된다면,
    // Collections.sort() 메소드를 사용하여 객체를 원하는 기준으로 정렬할 수 있음.
    @Override
    public int compareTo(MeetingInfo meet) {
        if (meet.endTime < endTime) { return 1; }
        else if (meet.endTime > endTime) { return -1; }
        else {
            if (this.startTime < meet.startTime) {
                return -1;
            } else if (this.startTime > meet.startTime) {
                return 1;
            }
            return 0;
        }
    }
    @Override
    public String toString() {
        return "[ " + this.startTime + " - " + this.endTime + " ]";
    }
}

