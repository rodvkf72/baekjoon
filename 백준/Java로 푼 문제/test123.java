import java.util.*;
import java.io.*;

public class test123 {

	public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
			OutputStreamWriter out = new OutputStreamWriter(System.out);
			BufferedReader br = new BufferedReader(in);
			BufferedWriter bw = new BufferedWriter(out);
            
            int cycle = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < cycle; i++) {
                int result = 0;
                String[] values = br.readLine().split(" ");
                int f_value = Integer.parseInt(values[0]);
                int s_value = Integer.parseInt(values[1]);
                
                result = f_value + s_value;
                bw.write(String.valueOf(result) + "\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (Exception e) {
            
        }
    }
}