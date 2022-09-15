import java.util.*;
import java.io.*;

public class page223 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		
		try {
			
			int[] DP = new int[1001];
			
			int cycle = Integer.parseInt(br.readLine());
			
			DP[0] = 1;
			DP[1] = 3;
			
			for (int i = 2; i < cycle; i++) {
				DP[i] = 2 * DP[i-2] + DP[i-1]; 
			}
			bw.write(String.valueOf(DP[cycle-1] % 796796));

			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
