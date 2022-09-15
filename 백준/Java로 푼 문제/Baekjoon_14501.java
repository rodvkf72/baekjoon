import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Baekjoon_14501 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int days = Integer.parseInt(br.readLine());
			int[] dp = new int[days+1];
			int[] day = new int[days+1];
			int[] pay = new int[days+1];
			
			for (int i = 0; i < days; i++) {
				String[] inputs = br.readLine().split(" ");
				day[i] = Integer.parseInt(inputs[0]);
				pay[i] = Integer.parseInt(inputs[1]);
			}
			
			int result = Integer.MIN_VALUE;
			for (int i = 0; i <= days; i++) {
				dp[i] = Math.max(dp[i], result);
				if (i + day[i] <= days) {
					dp[i+day[i]] = Math.max(dp[i+day[i]], pay[i] + dp[i]);
				}
				result = Math.max(result, dp[i]);
			}
			
			bw.write(String.valueOf(result));
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
