import java.util.*;
import java.io.*;

public class page220 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			String[] s_values = br.readLine().split(" ");
			int[] DP = new int[101];
			
			DP[0] = Integer.parseInt(s_values[0]);
			DP[1] = Math.max(Integer.parseInt(s_values[0]), Integer.parseInt(s_values[1]));
			for (int i = 2; i < cycle; i++) {
				DP[i] = Math.max(DP[i - 1], DP[i - 2] + Integer.parseInt(s_values[i]));
			}
			bw.write(String.valueOf(DP[cycle - 1]));
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
