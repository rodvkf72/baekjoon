import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_10026 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static boolean[][] visited1;
	static boolean[][] visited2;
	static int[][] arr1;
	static int[][] arr2;
	static int cnt1;
	static int cnt2;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int size = Integer.parseInt(br.readLine());
			visited1 = new boolean[size][size];
			visited2 = new boolean[size][size];
			arr1 = new int[size][size];
			arr2 = new int[size][size];
			
			for (int i = 0; i < size; i++) {
				String[] values = br.readLine().split("");
				for (int j = 0; j < size; j++) {
					if (values[j].equals("R")) {
						arr1[i][j] = 1;
					} else if (values[j].equals("G")) {
						arr1[i][j] = 2;
					} else {
						arr1[i][j] = 3;
					}
				}
			}
			
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					arr2[i][j] = arr1[i][j];
					if (arr2[i][j] == 2) {
						arr2[i][j] = 1;
					}
				}
			}
			
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (!visited1[i][j]) {
						DFS1(i, j, size, arr1[i][j]);
						cnt1++;
					}
					
					if (!visited2[i][j]) {
						DFS2(i, j, size, arr2[i][j]);
						cnt2++;
					}
				}
			}
			
			bw.write(String.valueOf(cnt1) + " ");
			bw.write(String.valueOf(cnt2));
			
			bw.flush();
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void DFS1(int x, int y, int size, int color) {
		visited1[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < size && ny < size && !visited1[nx][ny] && arr1[nx][ny] == color) {
				DFS1(nx, ny, size, color);
			}
		}
	}
	
	static void DFS2(int x, int y, int size, int color) {
		visited2[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < size && ny < size && !visited2[nx][ny] && arr2[nx][ny] == color) {
				DFS2(nx, ny, size, color);
			}
		}
	}
}
