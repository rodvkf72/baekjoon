import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_4963 {
	static int[] dx = {0, 0, -1, 1, -1, 1, 1, -1};
	static int[] dy = {-1, 1, 0, 0, -1, -1, 1, 1};
	static int[][] arr;
	static boolean[][] visited;
	static int cnt = 0;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			while (true) {
				String[] inputs = br.readLine().split(" ");
				int w = Integer.parseInt(inputs[0]);
				int h = Integer.parseInt(inputs[1]);
				
				if (w == 0 && h == 0) {
					break;
				} else {
					cnt = 0;
					arr = new int[w][h];
					visited = new boolean[w][h];
					
					for (int i = 0; i < h; i++) {
						String[] values = br.readLine().split(" ");
						for (int j = 0; j < values.length; j++) {
							arr[j][i] = Integer.parseInt(values[j]);
						}
					}
					
					for (int i = 0; i < w; i++) {
						for (int j = 0; j < h; j++) {
							if (arr[i][j] == 1 && !visited[i][j]) {
								cnt++;
								DFS(i, j, w, h);
							}
						}
					}
				}
				bw.write(String.valueOf(cnt) + "\n");
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
	public static void DFS(int w, int h, int maxWidth, int maxHeight) {
		visited[w][h] = true;
		
		for (int i = 0; i < 8; i++) {
			int nx = w + dx[i];
			int ny = h + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < maxWidth && ny < maxHeight && arr[nx][ny] == 1 && !visited[nx][ny]) {
				DFS(nx, ny, maxWidth, maxHeight);
			}
		}
	}
}
