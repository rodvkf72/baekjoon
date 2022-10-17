import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_11048 {
	static int[] dx = {0, 1, 1};
	static int[] dy = {1, 1, 0};
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);) {
			
			String[] inputs = br.readLine().split(" ");
			int row = Integer.parseInt(inputs[0]);
			int col = Integer.parseInt(inputs[1]);
			
			int[][] arr = new int[row][col];
			int[][] dp = new int[row][col];
			for (int i = 0; i < row; i++) {
				String[] values = br.readLine().split(" ");
				
				for (int j = 0; j < col; j++) {
					arr[i][j] = Integer.parseInt(values[j]);
				}
			}
			
			dp[0][0] = arr[0][0];
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					
					for (int k = 0; k < 3; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						if (nx >= 0 && nx < row && ny >= 0 && ny < col) {
							dp[nx][ny] = Math.max(dp[nx][ny], dp[i][j] + arr[nx][ny]);
						}
					}
				}
			}
			bw.write(String.valueOf(dp[row-1][col-1]));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
