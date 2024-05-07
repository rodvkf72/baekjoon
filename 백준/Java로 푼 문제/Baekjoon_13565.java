import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_13565 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int[][] arr;
	static boolean[][] visited;
	static boolean isPossible;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] inputs = br.readLine().split(" ");
			int row = Integer.parseInt(inputs[0]);
			int col = Integer.parseInt(inputs[1]);
			
			arr = new int[row][col];
			visited = new boolean[row][col];
			
			for (int i = 0; i < row; i++) {
				String[] values = br.readLine().split("");
				
				for (int j = 0; j < col; j++) {
					arr[i][j] = Integer.parseInt(values[j]);
				}
			}
			
			for (int i = 0; i < col; i++) {	// 바깥쪽에서 전류 공급
				if (!visited[0][i] && arr[0][i] == 0) {
					DFS(0, i, row, col);
				}
			}
			
			if (isPossible) {
				bw.write("YES");
			} else {
				bw.write("NO");
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void DFS(int row, int col, int maxRow, int maxCol) {
		visited[row][col] = true;
		
		if (row == maxRow-1) {
			isPossible = true;
		}
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (!visited[x][y] && arr[x][y] == 0) {
					DFS(x, y, maxRow, maxCol);
				}
			}
		}
	}
}
