import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class page152 {
	static int[] dx = new int[] {0, 0, -1, 1};
	static int[] dy = new int[] {-1, 1, 0, 0};
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int[][] map = new int[Integer.parseInt(inputs[0])][Integer.parseInt(inputs[1])];
			
			for (int x = 0; x < Integer.parseInt(inputs[0]); x++) {
				String[] lines = br.readLine().split("");
				
				for (int y = 0; y < lines.length; y++) {
					map[x][y] = Integer.parseInt(lines[y]);
				}
			}
			int result = bfs(0, 0, Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), map);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int bfs(int x, int y, int xlen, int ylen, int[][] map) {
		Queue<Que> queue = new LinkedList<>();
		Que q = new Que(x,y);
		queue.offer(q);
		
		while(!queue.isEmpty()) {

			Que q2 = queue.poll();
			
			x = q2.getIn1();
			y = q2.getIn2();
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if ((nx < 0) || (ny < 0) || (nx >= xlen) || (ny >= ylen)) {
					continue;
				}
				if (map[nx][ny] == 0) {
					continue;
				}
				if (map[nx][ny] == 1) {
					map[nx][ny] = map[x][y] + 1;
					queue.offer(new Que(nx, ny));
				}
			}
		}
		System.out.println(Arrays.deepToString(map));
		return map[xlen-1][ylen-1];
		//return count;
	}
	
	static class Que {
		private int in1;
		private int in2;
		
		public Que(int in1, int in2) {
			this.in1 = in1;
			this.in2 = in2;
		}
		
		private int getIn1() {
			return in1;
		}
		private int getIn2() {
			return in2;
		}
	}
}
