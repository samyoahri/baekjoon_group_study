package boj_11719_thu;
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class boj_11719_samyoahri {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String buffer = "";
        ArrayList<String> output = new ArrayList<>();
        for(int i=0;i<100;i++){
            buffer=in.readLine();
            if(buffer==null){
                output.add("");
            }else{
                output.add(buffer);
            }
        }
        for(String str : output) {
            System.out.println(str);
        }
        in.close();
    }
}
