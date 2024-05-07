import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_11123 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static String[][] arr;
	static boolean[][] visited;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < cycle; i++) {
				String[] inputs = br.readLine().split(" ");
				
				int row = Integer.parseInt(inputs[0]);
				int col = Integer.parseInt(inputs[1]);
				
				arr = new String[row][col];
				visited = new boolean[row][col];
				
				for (int j = 0; j < row; j++) {
					String[] values = br.readLine().split("");
					
					for (int k = 0; k < col; k++) {
						arr[j][k] = values[k];
					}
				}
				
				int result = 0;
				for (int j = 0; j < row; j++) {
					for (int k = 0; k < col; k++) {
						if (!visited[j][k] && arr[j][k].equals("#")) {
							DFS(j, k, row, col);
							result++;
						}
					}
				}
				bw.write(String.valueOf(result) + "\n");
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
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (!visited[x][y] && arr[x][y].equals("#")) {
					DFS(x, y, maxRow, maxCol);
				}
			}
		}
	}
}
