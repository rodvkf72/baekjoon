import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1520_timeover {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int[][] arr;
	static int result = 0;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		try {
			String[] inputs = br.readLine().split(" ");
			int row = Integer.parseInt(inputs[0]);
			int col = Integer.parseInt(inputs[1]);
			
			arr = new int[row][col];
			
			for (int i = 0; i < row; i++) {
				String[] values = br.readLine().split(" ");
				
				for (int j = 0; j < col; j++) {
					arr[i][j] = Integer.parseInt(values[j]);
				}
			}
			
			DFS(0, 0, row, col);
			
			bw.write(String.valueOf(result));
			
			bw.flush();
			
			bw.close();
			br.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void DFS(int row, int col, int maxRow, int maxCol) {
		int current = arr[row][col];
		
		if (row == maxRow-1 && col == maxCol-1) {
			result++;
		}
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (current > arr[x][y]) {
					DFS(x, y, maxRow, maxCol);
				}
			}
		}
	}
}
