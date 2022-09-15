import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1012 {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] arr;
	static boolean[][] visited;
	static int worm;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int testCase = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testCase; i++) {
				String[] inputs = br.readLine().split(" ");
				int row = Integer.parseInt(inputs[0]);
				int col = Integer.parseInt(inputs[1]);
				int baechu = Integer.parseInt(inputs[2]);
				
				arr = new int[row][col];
				visited = new boolean[row][col];
				worm = 0;
				
				for (int j = 0; j < baechu; j++) {
					String[] values = br.readLine().split(" ");
					int x = Integer.parseInt(values[0]);
					int y = Integer.parseInt(values[1]);
					
					arr[x][y] = 1;
				}
				
				for (int j = 0; j < row; j++) {
					for (int k = 0; k < col; k++) {
						if (arr[j][k] == 1 && !visited[j][k]) {
							worm++;
							DFS(j, k, row, col);
						}
					}
				}
				
				bw.write(String.valueOf(worm)+"\n");
			}
			
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void DFS(int x, int y, int row, int col) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && nx < row && ny >= 0 && ny < col && !visited[nx][ny] && arr[nx][ny] == 1) {
				DFS(nx, ny, row, col);
			}
		}
	}
}
