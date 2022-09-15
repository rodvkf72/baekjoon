import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1904 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int value = Integer.parseInt(br.readLine());
			
			int[] dp = new int[value];
			
			if (value == 1) {
				bw.write("1");
			} else if (value == 2) {
				bw.write("2");
			} else if (value == 3) {
				bw.write("3");
			} else {
				dp[0] = 1;	//1개
				dp[1] = 2;	//2개
				dp[2] = 3;	//3개
				
				for (int i = 3; i < value; i++) {
					dp[i] = (dp[i-2] + dp[i-1]) % 15746;
				}
				bw.write(String.valueOf(dp[value-1]));
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
