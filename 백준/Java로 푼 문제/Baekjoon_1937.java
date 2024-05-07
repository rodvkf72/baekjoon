import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1937 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int[][] arr;
	static int[][] dp;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int input = Integer.parseInt(br.readLine());
			
			arr = new int[input][input];
			dp = new int[input][input];
			
			for (int i = 0; i < input; i++) {
				String[] values = br.readLine().split(" ");
				
				for (int j = 0; j < input; j++) {
					arr[i][j] = Integer.parseInt(values[j]);
				}
			}
			
			int result = 0;
			for (int i = 0; i < input; i++) {
				for (int j = 0; j < input; j++) {
					result = Math.max(result, DFS(i, j, input, input));
				}
			}
			
			bw.write(String.valueOf(result));
			
			bw.flush();
			
			bw.close();
			br.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int DFS(int row, int col, int maxRow, int maxCol) {
		if (dp[row][col] != 0) {
			return dp[row][col];
		}
		
		dp[row][col] = 1;
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (arr[x][y] > arr[row][col]) {
					dp[row][col] = Math.max(dp[row][col], DFS(x, y, maxRow, maxCol) + 1);
				}
			}
		}
		
		return dp[row][col];
	}
}
