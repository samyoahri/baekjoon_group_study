package Thu_boj_14713;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_14713_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());

        ArrayList<Queue<String>> birds = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            Queue<String> sentence = new LinkedList<>();
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                sentence.add(str);
                cnt++;
            }
            birds.add(i, sentence);
        }
        String[] cseteramSentence = in.readLine().split(" ");
        if(cnt==cseteramSentence.length){
            for (int i = 0; i < cseteramSentence.length; i++) {
                String word = cseteramSentence[i];
                boolean check = false;
                for (int j = 0; j < birds.size(); j++) {
                    Queue<String> bird = birds.get(j);
                    if(bird.isEmpty())
                        continue;
                    if (bird.peek().equals(word)) {
                        bird.remove();
                        check = false;
                        break;
                    }
                    else{
                        check = true;
                    }
                }
                if(check)
                    break;

            }
        }

        for (int i = 0; i < birds.size(); i++) {
            if(!birds.get(i).isEmpty()){
                ans.append("Impossible");
                break;
            }
        }
        if (ans.length() == 0) {
            ans.append("Possible");
        }


        out.write(ans.toString());
        out.flush();

        in.close();
        out.close();
    }
}

//맞고 예쁜코드
//public class boj_14713_samyoahri {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int N = Integer.parseInt(in.readLine());
//
//        ArrayList<Queue<String>> birds = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//            Queue<String> sentence = new LinkedList<>();
//            while (st.hasMoreTokens()) {
//                String str = st.nextToken();
//                sentence.add(str);
//            }
//            birds.add(i, sentence);
//        }
////        String[] cseteramSentence = in.readLine().split(" ");
//        Queue<String> cseteram = new LinkedList<>();
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//        while (st.hasMoreTokens()) {
//            cseteram.add(st.nextToken());
//        }
//
//        while (!cseteram.isEmpty()) {
////            String word = cseteram.remove();
//            String word = cseteram.peek();
//            boolean checked = false;
//            for (int i = 0; i < birds.size(); i++) {
//                Queue<String> bird = birds.get(i);
//                if(word.equals(bird.peek())){
//                    bird.remove();
//                    cseteram.remove();
//                    checked = true;
//                    break;
//                }
//            }
//            if(!checked){
//                break;
//            }
//        }
//        for (int i = 0; i < birds.size(); i++) {
//            Queue<String> bird = birds.get(i);
//            if(!cseteram.isEmpty() || !bird.isEmpty()){
//                ans.append("Impossible");
//                break;
//            }
//        }
//        if (ans.length() == 0) {
//            ans.append("Possible");
//        }
//
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}

//틀린코드
//public class boj_14713_samyoahri {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        int N = Integer.parseInt(in.readLine());
//
//        ArrayList<Queue<String>> birds = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
//            Queue<String> sentence = new LinkedList<>();
//            while (st.hasMoreTokens()) {
//                String str = st.nextToken();
//                sentence.add(str);
//            }
//            birds.add(i, sentence);
//        }
//        String[] cseteramSentence = in.readLine().split(" ");
//
//        for (int i = 0; i < cseteramSentence.length; i++) {
//            String word = cseteramSentence[i];
//            boolean check = false;
//            for (int j = 0; j < birds.size(); j++) {
//                Queue<String> bird = birds.get(j);
//                if(bird.isEmpty())
//                    continue;
//                if (bird.peek().equals(word)) {
//                    bird.remove();
//                    check = false;
//                    break;
//                }
//                else{
//                    check = true;
//                }
//            }
//            if(check)
//                break;
//
//        }
//        for (int i = 0; i < birds.size(); i++) {
//            if(!birds.get(i).isEmpty()){
//                ans.append("Impossible");
//                break;
//            }
//        }
//        if (ans.length() == 0) {
//            ans.append("Possible");
//        }
//
//
//        out.write(ans.toString());
//        out.flush();
//
//        in.close();
//        out.close();
//    }
//}
