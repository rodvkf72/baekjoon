import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_9095 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < cycle; i++) {
				int want = Integer.parseInt(br.readLine());
				
				if (want < 4) {
					switch(want) {
					case 0:
						bw.write("0\n");
						break;
					case 1:
						bw.write("1\n");
						break;
					case 2:
						bw.write("2\n");
						break;
					case 3:
						bw.write("4\n");
						break;
					}
				} else {
					int[] dp = new int[want + 1];
					
					dp[0] = 0;
					dp[1] = 1;
					dp[2] = 2;
					dp[3] = 4;
					
					for (int j = 4; j <= want; j++) {
						dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
					}
					
					bw.write(String.valueOf(dp[want]) + "\n");
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
