import java.util.*;
import java.io.*;

public class Baekjoon_2751 {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            OutputStreamWriter out = new OutputStreamWriter(System.out);
            BufferedWriter bw = new BufferedWriter(out);
            
            int num = Integer.parseInt(br.readLine());
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);
            for (int j = 0; j < num; j++) {
                bw.write(String.valueOf(arr[j]) + "\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch(Exception e) {
            
        }
    }
}