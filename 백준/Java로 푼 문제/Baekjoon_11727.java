import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_11727 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int num = Integer.parseInt(br.readLine());
			int[] dp = new int[1001];
			
			if (num == 0) {
				bw.write("0");
			} else if (num == 1) {
				bw.write("1");
			} else if (num == 2) {
				bw.write("3");
			} else {
				dp[0] = 0;
				dp[1] = 1;
				dp[2] = 3;
				
				for (int i = 3; i <= num; i++) {
					dp[i] = (dp[i-2] * 2 + dp[i-1]) % 10007;
				}
				bw.write(String.valueOf(dp[num]));
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
