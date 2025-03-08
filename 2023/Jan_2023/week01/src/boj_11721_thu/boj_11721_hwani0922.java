package boj_11721_thu;
import java.io.*;

public class boj_11721_hwani0922 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strValue = "";
        strValue = br.readLine();

        int fixLength = 10;
        int strArraySize = (int)Math.ceil((double)strValue.length() / fixLength);

        String[] subStringArray = new String[strArraySize];
        int index = 0;
        for(int startIndex = 0; startIndex < strValue.length(); startIndex += fixLength) {
            subStringArray[index++] = strValue.substring(startIndex, Math.min(startIndex + fixLength, strValue.length()));
        }
        for(int i=0; i<subStringArray.length; i++){
            System.out.println(subStringArray[i]);
        }
    }
}

