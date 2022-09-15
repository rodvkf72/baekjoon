import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1912 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			br.readLine();
			
			String[] strValues = br.readLine().split(" ");
			int[] intValues = new int[strValues.length];
			int[] dp = new int[strValues.length];
			
			for (int i = 0; i < intValues.length; i++) {
				intValues[i] = Integer.parseInt(strValues[i]);
			}
			
			dp[0] = intValues[0];
			int max = intValues[0];
			
			for (int i = 1; i < intValues.length; i++) {
				dp[i] = Math.max(dp[i-1] + intValues[i], intValues[i]);
				max = Math.max(max, dp[i]);
			}
			bw.write(String.valueOf(max));
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
