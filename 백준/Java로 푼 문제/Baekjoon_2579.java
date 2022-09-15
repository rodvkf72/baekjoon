import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2579 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			int[] values = new int[cycle+1];
			values[0] = 0;
			
			int[] dp = new int[cycle+1];
			
			for (int i = 1; i <= cycle; i++) {
				values[i] = Integer.parseInt(br.readLine());
			}
			
			dp[0] = 0;
			dp[1] = values[1];
			
			if (cycle >= 2) {
				dp[2] = values[1] + values[2];
			}
			
			for (int i = 3; i <= cycle; i++) {
				dp[i] = Math.max(dp[i-2], dp[i-3] + values[i-1]) + values[i]; 
			}
			bw.write(String.valueOf(dp[cycle]));
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
