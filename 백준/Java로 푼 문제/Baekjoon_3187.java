import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_3187 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static String[][] arr;
	static boolean[][] visited;
	static int ram = 0;
	static int wolf = 0;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int row = Integer.parseInt(inputs[0]);
			int col = Integer.parseInt(inputs[1]);
			
			arr = new String[row][col];
			visited = new boolean[row][col];
			
			for (int i = 0; i < row; i++) {
				String[] values = br.readLine().split("");
				
				for (int j = 0; j < col; j++) {
					arr[i][j] = values[j];
				}
			}
			
			int resultRam = 0;
			int resultWolf = 0;
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (!visited[i][j] && !arr[i][j].equals("#")) {
						DFS(i, j, row, col);
						
						if (ram > wolf) {
							wolf = 0;
						} else {
							ram = 0;
						}
						resultRam += ram;
						resultWolf += wolf;
					}
					ram = 0;
					wolf = 0;
				}
			}
			
			bw.write(String.valueOf(resultRam) + " " + String.valueOf(resultWolf));
			
			bw.flush();
			
			bw.close();
			br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void DFS(int row, int col, int maxRow, int maxCol) {
		visited[row][col] = true;
		
		if (arr[row][col].equals("k")) {
			ram++;
		} else if (arr[row][col].equals("v")) {
			wolf++;
		}
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (!visited[x][y] && !arr[x][y].equals("#"))
				DFS(x, y, maxRow, maxCol);
			}
		}
	}
}
