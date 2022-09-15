import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1463 {
	static Integer[] dp;
	
	public static void main(String[] args) {
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			OutputStreamWriter out = new OutputStreamWriter(System.out);
			BufferedReader br = new BufferedReader(in);
			BufferedWriter bw = new BufferedWriter(out);
			
			int input = Integer.parseInt(br.readLine());
			
			dp = new Integer[input+1];
			dp[0] = 0;
			dp[1] = 0;
			
			bw.write(String.valueOf(method(input)));
			bw.flush();
			
			br.close();
			in.close();
			bw.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int method(int N) {
		if (dp[N] == null) {
			if (N % 3 == 0) {
				dp[N] = Math.min(method(N-1), method(N/3)) + 1;
			} else if (N % 2 == 0) {
				dp[N] = Math.min(method(N-1), method(N/2)) + 1;
			} else {
				dp[N] = method(N-1) + 1;
			}
		}
		return dp[N];
	}
}
