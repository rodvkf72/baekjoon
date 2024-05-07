import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1743 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int[][] arr;
	static boolean[][] visited;
	static int size;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			
			String[] inputs = br.readLine().split(" ");
			
			int row = Integer.parseInt(inputs[0]);
			int col = Integer.parseInt(inputs[1]);
			int cnt = Integer.parseInt(inputs[2]);
			
			arr = new int[row][col];
			visited = new boolean[row][col];
			
			for (int i = 0; i < cnt; i++) {
				String[] strValues = br.readLine().split(" ");
				
				int inputRow = Integer.parseInt(strValues[0]);
				int inputCol = Integer.parseInt(strValues[1]);
				
				arr[inputRow-1][inputCol-1] = 1;
			}
			
			int resultSize = 0;
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (!visited[i][j] && arr[i][j] == 1) {
						resultSize = Math.max(resultSize, DFS(i, j, row, col));
					}
					size = 0;
				}
			}
			
			bw.write(String.valueOf(resultSize));
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static int DFS(int row, int col, int maxRow, int maxCol) {
		visited[row][col] = true;
		size++;
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (!visited[x][y] && arr[x][y] == 1) {
					DFS(x, y, maxRow, maxCol);
				}
			}
		}
		
		return size;
	}
}
