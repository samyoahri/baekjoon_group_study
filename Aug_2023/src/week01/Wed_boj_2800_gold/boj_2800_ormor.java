package week01.Wed_boj_2800_gold;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

public class boj_2800_ormor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String inputLine = in.readLine();
        Stack<galhoInfo> stack = new Stack<>();
        ArrayList<galhoInfo> galhoList = new ArrayList<>();

        for(int i=0; i<inputLine.length(); i++){
            if(inputLine.charAt(i) == '('){
                galhoInfo galho = new galhoInfo();
                galho.modOpenIndex(i);
                stack.push(galho);
            }
            else if(inputLine.charAt(i) == ')'){
                stack.peek().modCloseIndex(i);
                galhoList.add(stack.pop());
            }
        }

        // 비트마스크 연산, 부분집합 만들기 연산
        ArrayList<Integer> deleteIndexList = new ArrayList<>();
        ArrayList<String> answerList = new ArrayList<>();
        for(int i=1; i<1<<galhoList.size(); i++){
            // System.out.println("i = " + i + ", 이진수 i = " + Integer.toBinaryString(i));
            deleteIndexList.clear();
            for(int k=0; k<galhoList.size(); k++){
                if((1& i>>k) == 0) continue;
                // System.out.println(galhoList.get(galhoList.size()-1-k));
                deleteIndexList.add(galhoList.get(galhoList.size()-1-k).openIndex);
                deleteIndexList.add(galhoList.get(galhoList.size()-1-k).closeIndex);
            }

            for(int j=0; j<inputLine.length(); j++){
                if(!deleteIndexList.contains(j)){
                    ans.append(inputLine.charAt(j));
                }
            }
            if(!answerList.contains(ans.toString())){
                answerList.add(ans.toString());
            }
            ans.setLength(0);
        }

        answerList.sort(Comparator.naturalOrder());
        for(int i=0; i< answerList.size(); i++){
            ans.append(answerList.get(i));
            if(i!=answerList.size()-1){ans.append("\n");}
        }
        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}

class galhoInfo {
    int openIndex;
    int closeIndex;
    public galhoInfo(){
    }
    public void modOpenIndex(int openIndex){
        this.openIndex = openIndex;
    }
    public void modCloseIndex(int closeIndex){
        this.closeIndex = closeIndex;
    }
    @Override
    public String toString() {
        return "[ open : " + this.openIndex + ", close : " + this.closeIndex + " ]";
    }
}