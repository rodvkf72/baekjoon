import java.util.*;
import java.io.*;

public class page217 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		int[] DP = new int[30001];
		
		try {
			int value = Integer.parseInt(br.readLine());
			
			for (int i = 2; i < value + 1; i++) {
				DP[i] = DP[i - 1] + 1;
				
				if (i % 5 == 0) {
					DP[i] = Math.min(DP[i], DP[i/5] + 1);
				}
				
				if (i % 3 == 0) {
					DP[i] = Math.min(DP[i], DP[i/3] + 1);
				}
				
				if (i % 2 == 0) {
					DP[i] = Math.min(DP[i], DP[i/3] + 1);
				}
			}

			bw.write(String.valueOf(DP[value]));
			bw.flush();
			br.close();
			in.close();
			bw.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
