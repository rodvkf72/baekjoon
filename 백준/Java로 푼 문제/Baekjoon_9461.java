import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_9461 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			long[] dp = new long[101];
			
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = 1;
			
			for (int i = 0; i < cycle; i++) {
				int target = Integer.parseInt(br.readLine());
				
				for (int j = 3; j < target; j++) {
					dp[j] = dp[j-3] + dp[j-2];
				}
				bw.write(String.valueOf(dp[target-1]) + "\n");
			}
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
