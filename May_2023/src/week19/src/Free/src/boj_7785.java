import java.io.*;
import java.util.*;

public class boj_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        LinkedHashMap<String, Boolean> list = new LinkedHashMap<>();
        StringTokenizer st;
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine(), " ");
            String name = st.nextToken();
            String state = st.nextToken();
            if (state.equals("enter")) {
                list.put(name, true);
            }
            else if (state.equals("leave")) {
                list.remove(name);
            }
            else{
                System.out.println("Error");
            }
        }
        List<String> keyList = new ArrayList<>(list.keySet());
        Collections.sort(keyList, Collections.reverseOrder());
        for (int i = 0; i < keyList.size(); ++i) {
            ans.append(keyList.get(i) + "\n");
        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
