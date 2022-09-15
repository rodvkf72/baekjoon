import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_11053 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			br.readLine();
			
			String[] values = br.readLine().split(" ");
			int[] intValues = new int[values.length];
			int[] dp = new int[values.length];
			
			for (int i = 0; i < values.length; i++) {
				intValues[i] = Integer.parseInt(values[i]);
			}
			
			for (int i = 0; i < values.length; i++) {
				dp[i] = 1;
				
				for (int j = 0; j < i; j++) {
					if (intValues[j] < intValues[i] && dp[i] < dp[j] + 1) {
						dp[i] = dp[j] + 1; 
					}
				}
			}
			Arrays.sort(dp);
			
			bw.write(String.valueOf(dp[dp.length-1]));
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
