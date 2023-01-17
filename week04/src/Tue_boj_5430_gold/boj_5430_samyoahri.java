package Tue_boj_5430_gold;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj_5430_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        //테스트케이스 수
        int T = Integer.parseInt(in.readLine());
        String[] func;

        for (int i = 0; i < T; i++) {
            //수행할 함수
            func = in.readLine().split("");
            //배열에 들어있는 수의 개수
            int n = Integer.parseInt(in.readLine());

            //배열
            String str = in.readLine();

            str = str.substring(1, str.length()-1);
            String[] strArr = str.split(",");

            Deque<Integer> deque = new ArrayDeque<>();
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].equals("")) {
                    break;
                }
                deque.add(Integer.parseInt(strArr[j]));
            }

            //reverseCheck가 true면 뒤쪽을 손대고, reverseCheck가 false이면
            boolean reverseCheck = false;
            boolean errorCheck = false;
            for (int j = 0; j < func.length; j++) {
                String command = func[j];
                if (command.equals("R")) {
                    reverseCheck = !reverseCheck;
                } else if (command.equals("D")) {
                    if (strArr[0].equals("")) {
                        ans.append("error\n");
                        errorCheck = true;
                        break;
                    }
                    //뒤쪽
                    if (reverseCheck) {
//                        deque.pollLast();
                        try {
                            deque.removeLast();
                        } catch (Exception e) {
                            ans.append("error\n");
                            errorCheck = true;
                            break;
                        }
                    }
                    //앞쪽
                    else{
//                        deque.pollFirst();
                        try {
                            deque.removeFirst();
                        } catch (Exception e) {
                            ans.append("error\n");
                            errorCheck = true;
                            break;
                        }

                    }
                }else{
                    System.out.println("명령어 오류");
                }
            }

            int dequeSize = deque.size();
            if(!deque.isEmpty()){
                for (int j = 0; j < dequeSize; j++) {
                    if (j == 0) {
                        ans.append("[");
                    }

                    if(reverseCheck){
                        int tmp = deque.removeLast();
                        ans.append(tmp);
                        ans.append(",");
                    }
                    else{
                        int tmp = deque.remove();
                        ans.append(tmp);
                        ans.append(",");
                    }

                    if (j == dequeSize - 1) {
                        ans.replace(ans.length() - 1, ans.length(), "]\n");
                    }
                }
            }
            else{
                if(!errorCheck){
                    ans.append("[]\n");
                }
            }

        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
