import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_11726 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int len = Integer.parseInt(br.readLine());
			int[] dp = new int[len+2];
			
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			
			for (int i = 3; i <= len; i++) {
				dp[i] = (dp[i-1] + dp[i-2]) % 10007;
			}
			
			bw.write(String.valueOf(dp[len]));
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