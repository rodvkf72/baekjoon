import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_17626 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			
			int[] dp = new int[n+1];
			
			dp[0] = 0;
			dp[1] = 1;
			
			for (int i = 2; i <= n; i++) {
				int min = Integer.MAX_VALUE;
				
				for (int j = 1; j * j <= i; j++) {
					int temp = i - (j * j);
					min = Math.min(min, dp[temp]);
				}
				dp[i] = min + 1;
			}
			
			bw.write(String.valueOf(dp[n]) + "\n");
			
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
