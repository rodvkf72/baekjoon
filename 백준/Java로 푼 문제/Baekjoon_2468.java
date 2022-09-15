import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon_2468 {
	static boolean[][] notSafe = {};
	static boolean[][] visited = {};
	static int[][] arr = {};
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int size = Integer.parseInt(br.readLine());
			
			arr = new int[size][size];
			notSafe = new boolean[size][size];
			visited = new boolean[size][size];
			
			int maxHeight = 0;
			for (int i = 0; i < size; i++) {
				String[] strValues = br.readLine().split(" ");
				for (int j = 0; j < strValues.length; j++) {
					arr[i][j] = Integer.parseInt(strValues[j]);
					maxHeight = Math.max(maxHeight, arr[i][j]);
				}
			}
			
			int safeArea = 0;
			for (int i = 0; i < maxHeight; i++) {	//i는 물에 잠기는 높이
				int cnt = 0;
				
				for (int j = 0; j < size; j++) {
					for (int k = 0; k < size; k++) {
						visited[j][k] = false;	//방문기록 초기화
						
						if (i >= arr[j][k]) {
							notSafe[j][k] = true;	//물에 잠긴 곳 처리
						}
					}
				}
				
				for (int j = 0; j < size; j++) {
					for (int k = 0; k < size; k++) {
						if (!notSafe[j][k] && !visited[j][k]) {
							DFS(j, k, size);
							cnt++;
						}
					}
				}
				safeArea = Math.max(safeArea, cnt);
			}
			bw.write(String.valueOf(safeArea));
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void DFS(int x, int y, int size) {
		Stack<VO> stack = new Stack<>();
		stack.add(new VO(x, y, size));
		
		while(!stack.isEmpty()) {
			VO vo = stack.pop();
			visited[vo.getX()][vo.getY()] = true;
			
			for (int i = 0; i < 4; i++) {
				int nx = vo.getX() + dx[i];
				int ny = vo.getY() + dy[i];
				
				if (nx >= 0 && nx < size && ny >= 0 && ny < size && !visited[nx][ny] && !notSafe[nx][ny]) {
					stack.add(new VO(nx, ny, size));
				}
			}
		}
	}
	
	static class VO {
		private int x;
		private int y;
		private int size;
		
		public VO(int x, int y, int size) {
			this.x = x;
			this.y = y;
			this.size = size;
		}
		public int getX() {
			return this.x;
		}
		public int getY() {
			return this.y;
		}
	}
}
