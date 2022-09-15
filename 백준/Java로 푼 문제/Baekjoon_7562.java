import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Baekjoon_7562 {
	
	static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int[][] visited = new int[301][301];
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < cycle; i++) {
				int size = Integer.parseInt(br.readLine());
				int[][] arr = new int[size][size];
				
				String[] input1 = br.readLine().split(" ");
				String[] input2 = br.readLine().split(" ");
				
				int sx = Integer.parseInt(input1[0]);
				int sy = Integer.parseInt(input1[1]);
				int ex = Integer.parseInt(input2[0]);
				int ey = Integer.parseInt(input2[1]);

				for (int j = 0; j < 300; j++) {
					for (int k = 0; k < 300; k++) {
						visited[j][k] = -1;
					}
				}
				
				BFS(sx, sy, ex, ey, size);
				
				bw.write(String.valueOf(visited[ex][ey]) + "\n");
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
	
	public static void BFS(int sx, int sy, int ex, int ey, int size) {
		Queue<VO> queue = new LinkedList<>();
		queue.add(new VO(sx, sy));
		visited[sx][sy] = 0;
		
		while(!queue.isEmpty()) {
			VO vo = queue.poll();
			
			if (vo.getX() == ex && vo.getY() == ey) {
				break;
			}
			
			for (int i = 0; i < 8; i++) {
				int nx = vo.getX() + dx[i];
				int ny = vo.getY() + dy[i];
				
				if (nx >= 0 && ny >= 0 && nx < size && ny < size) {
					if (visited[nx][ny] == -1 || visited[nx][ny] > visited[vo.getX()][vo.getY()]+1) {
						visited[nx][ny] = visited[vo.getX()][vo.getY()] + 1;
						queue.add(new VO(nx, ny));
					}
				}
			}
		}
	}
	
	static class VO {
		int x;
		int y;
		
		public VO(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return this.x;
		}
		
		public int getY() {
			return this.y;
		}
	}
}
