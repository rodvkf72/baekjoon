import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2573 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int[][] arr;
	static boolean[][] visited;
	static int divideCnt = 0;
	
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
				String[] values = br.readLine().split(" ");
				
				for (int j = 0; j < col; j++) {
					arr[i][j] = Integer.parseInt(values[j]);
				}
			}
			
			int time = 0;
			while(true) {
				
				for (int i = 0; i < row; i++) {	// 초기 빙산의 상태 확인
					for (int j = 0; j < col; j++) {
						if (!visited[i][j] && arr[i][j] != 0) {
							DFS(i, j, row, col, "check");
							divideCnt++;	// 빙산 개수 체크
						}
					}
				}
				
				if (divideCnt >= 2 || divideCnt == 0) {	// 빙산이 2개 이상 분리되거나 다 녹게 되는 경우
					break;
				} else {
					time++;
				}
				
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if (!visited[i][j] && arr[i][j] == 0) {
							DFS(i, j, row, col, "divide");
						}
					}
				}
				
				visitedClear(row, col);
			}
			
			boolean isZero = true;
			for (int i = 0; i < row; i++) {	//빙산이 다 녹게 될 때 까지 반복한 경우
				for (int j = 0; j < col; j++) {
					if (arr[i][j] != 0) {
						isZero = false;
					}
				}
			}
			
			if (isZero) {
				bw.write("0");
			} else {
				bw.write(String.valueOf(time));
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 1년 후 빙산을 다시 체크해야 하므로 초기화
	public static void visitedClear(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				visited[i][j] = false;
			}
		}
		
		divideCnt = 0;	// 빙산의 개수 다시 세어야 하므로 초기화
	}
	
	// 
	public static void DFS(int row, int col, int maxRow, int maxCol, String command) {
		visited[row][col] = true;
		
		for (int i = 0; i < 4; i++) {
			int x = row + dx[i];
			int y = col + dy[i];
			
			if (x >= 0 && y >= 0 && x < maxRow && y < maxCol) {
				if (command.equals("divide")) {
					if (arr[x][y] != 0) {
						arr[x][y]--;
						
						if (arr[x][y] == 0) {
							visited[x][y] = true;
						}
					}
					
					if (!visited[x][y] && arr[x][y] == 0) {
						DFS(x, y, maxRow, maxCol, "divide");
					}
				} else {
					if (!visited[x][y] && arr[x][y] != 0) {
						DFS(x, y, maxRow, maxCol, "check");
					}
				}
			}
		}
	}
}
