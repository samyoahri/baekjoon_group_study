package week01.Wed_boj_2800_gold;

import java.io.*;
import java.util.*;
/*비트마스킹*/
class Pair{
    char ch;
    int idx;

    public Pair(char ch, int idx) {
        this.ch = ch;
        this.idx = idx;
    }
}
class Index{
    int start;
    int end;

    public Index(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class boj_2800_samyoahri {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        String str = in.readLine();
        Stack<Pair> stack = new Stack<>();
        ArrayList<Index> indexArrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(new Pair(ch, i));
            } else if (ch == ')') {
                Pair openedBracket = stack.pop();
                int start = openedBracket.idx;
                int end = i;
                indexArrayList.add(new Index(start, end));
            } else{
                continue;
            }
        }
        Set<String> set = new HashSet<>();
        int setSize = indexArrayList.size();
        for (int i = 1; i < 1 << setSize; ++i) {
            StringBuilder sb = new StringBuilder();
            Map<Integer, Integer> subset = new HashMap<>();
            //부분집합
            for (int j = 0; j < setSize; ++j) {
                if ((1 & i >> j) == 0) continue;
                subset.put(indexArrayList.get(j).start, indexArrayList.get(j).end);
            }

            for (int k = 0; k < str.length(); ++k) {
                if(subset.containsKey(k) || subset.containsValue(k)) continue;
                sb.append(str.charAt(k));
            }
            set.add(sb.toString());
        }
        List<String> output = new ArrayList<>(set);

        output.sort(Comparator.naturalOrder());
        for (int i = 0; i < output.size(); ++i) {
            ans.append(output.get(i) + "\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
//class Index{
//    int start;
//    int end;
//
//    public Index(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }
//}
//public class boj_2800_samyoahri {
//    static List<Index> brackets;
//    static boolean[] visited;
//    static Set<String> result;
//
//    static void dfs(int current) {
//        //중단조건
//
//    }
//    static String str;
//    public static void main(String[] args) throws IOException{
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder ans = new StringBuilder();
//
//        str = in.readLine();
//        Stack<Integer> stack = new Stack<>();
//        brackets = new ArrayList<>();
//        for (int i = 0; i < str.length(); ++i) {
//            char ch = str.charAt(i);
//            if (ch == '(') {
//                stack.push(i);
//            } else if (ch == ')') {
////                brackets.add(new int[]{stack.pop(), i});
//                brackets.add(new Index(stack.pop(), i));
//            }
//        }
//        visited = new boolean[str.length()];
////        Arrays.fill(visited, true);
//        result = new HashSet<>();
//        dfs(0);
//        List<String> list = new ArrayList<>(result);
//        list.sort(Comparator.naturalOrder());
//        for (int i = 0; i < list.size(); ++i) {
//            ans.append(list.get(i));
//        }
//
//
//        out.write(ans.toString());
//        out.flush();
//        in.close();
//        out.close();
//    }
//}