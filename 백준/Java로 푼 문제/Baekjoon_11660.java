import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_11660 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int size = Integer.parseInt(inputs[0]);
			int cycle = Integer.parseInt(inputs[1]);
			
			int[][] arr = new int[size][size];
			
			for (int i = 0; i < size; i++) {
				String[] arrValues = br.readLine().split(" ");
				for (int j = 0; j < size; j++) {
					arr[i][j] = Integer.parseInt(arrValues[j]);
				}
			}
			
			int[][] dp = new int[size+1][size+1];
			dp[0][0] = arr[0][0];
			
			for (int i = 1; i <= size; i++) {
				for (int j = 1; j <= size; j++) {
					dp[i][j] =  dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + arr[i-1][j-1];
				}
			}
			
			for (int i = 0; i < cycle; i++) {
				String[] xy = br.readLine().split(" ");
				
				int x1 = Integer.parseInt(xy[0]);
				int y1 = Integer.parseInt(xy[1]);
				int x2 = Integer.parseInt(xy[2]);
				int y2 = Integer.parseInt(xy[3]);
				
				int result = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1]; 
						
				bw.write(String.valueOf(result) + "\n");
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
