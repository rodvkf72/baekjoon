import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1303 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static String[][] arr;
	static boolean[][] visited;
	static int whiteCnt = 0;
	static int blueCnt = 0;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int row = Integer.parseInt(inputs[1]);
			int col = Integer.parseInt(inputs[0]);
			
			arr = new String[row][col];
			visited = new boolean[row][col];
			
			for (int i = 0; i < row; i++) {
				String[] values = br.readLine().split("");
				
				for (int j = 0; j < col; j++) {
					arr[i][j] = values[j];
				}
			}
			
			int whiteResult = 0;
			int blueResult = 0;
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (!visited[i][j]) {
						DFS(i, j, row, col);
						
						whiteResult += whiteCnt * whiteCnt;
						blueResult += blueCnt * blueCnt;
						
						whiteCnt = 0;
						blueCnt = 0;
					}
				}
			}
			
			bw.write(String.valueOf(whiteResult) + " " + String.valueOf(blueResult));
			
			bw.flush();
			
			bw.close();
			br.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void DFS(int row, int col, int maxRow, int maxCol) {
		visited[row][col] = true;
		String currentValue = arr[row][col];
		
		if (currentValue.equals("W")) {
			whiteCnt++;
		} else {
			blueCnt++;
		}
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (!visited[x][y] && arr[x][y].equals(currentValue)) {
					DFS(x, y, maxRow, maxCol);
				}
			}
			
		}
	}
}
