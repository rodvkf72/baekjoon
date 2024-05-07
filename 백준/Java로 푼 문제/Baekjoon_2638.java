import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_2638 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static boolean[][] visited;
	static int[][] arr;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int row = Integer.parseInt(inputs[0]);
			int col = Integer.parseInt(inputs[1]);
			
			visited = new boolean[row][col];
			arr = new int[row][col];
			
			for (int i = 0; i < row; i++) {
				String[] values = br.readLine().split(" ");
				
				for (int j = 0; j < col; j++) {
					arr[i][j] = Integer.parseInt(values[j]);
				}
			}
			
			int result = 0;
			while(true) {
				DFS(0, 0, row, col);
				visitedClear(row, col);
				boolean isEnd = nextTime(row, col);
				
				if (isEnd) {
					break;
				} else {
					result++;
				}
			}
			
			bw.write(String.valueOf(result));
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void DFS(int row, int col, int maxRow, int maxCol) {
		visited[row][col] = true;
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (arr[x][y] != 0) {	//외부에서 상하좌우로 체크하는 곳에 치즈가 있는 경우 
					arr[x][y]++;
				}
				
				if (!visited[x][y] && arr[x][y] == 0) {
					DFS(x, y, maxRow, maxCol);
				}
			}
		}
	}
	
	static void visitedClear(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				visited[i][j] = false;
			}
		}
	}
	
	static boolean nextTime(int row, int col) {
		boolean noCheese = true;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] >= 3) {
					noCheese = false;
					arr[i][j] = 0;
				} else if (arr[i][j] > 0 && arr[i][j] < 3) {
					arr[i][j] = 1;
				}
			}
		}
		
		return noCheese;
	}
}
