import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2193 {
	static long[] dp;
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int input = Integer.parseInt(br.readLine());
			
			if (input > 2) {
				dp = new long[input];
				
				dp[0] = 1;
				dp[1] = 1;
				 
				for (int i = 2; i < input; i++) {
					dp[i] = dp[i-2] + dp[i-1];
				}
				
				bw.write(String.valueOf(dp[input-1]));
			} else {
				switch (input) {
				case 1 : 
					bw.write("1");
					break;
				case 2 :
					bw.write("1");
					break;
				default :
					bw.write("0");
					break;
				}
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
