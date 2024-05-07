import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_14940_ing {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int row = 0;
	static int col = 0;
	static int goalPositionX = 0;
	static int goalPositionY = 0;
	static int[][] arr;
	static int[][] resultArr;
	static boolean[][] visited;
	static int count = 0;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] rowCol = br.readLine().split(" ");
			
			col = Integer.parseInt(rowCol[0]);
			row = Integer.parseInt(rowCol[1]);
			
			arr = new int[col][row];
			resultArr = new int[col][row];
			visited = new boolean[col][row];
			
			for (int i = 0; i < col; i++) {
				String[] values = br.readLine().split(" ");
				for (int j = 0; j < values.length; j++) {
					arr[i][j] = Integer.parseInt(values[j]);
					
					if (arr[i][j] == 2) {
						goalPositionX= j;
						goalPositionY = i;
					}
				}
			}

			BFS(goalPositionX, goalPositionY, 0);
			
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < row; j++) {
					bw.write(String.valueOf(resultArr[i][j]));
					bw.write(" ");
				}
				bw.write("\n");
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void BFS(int goalX, int goalY, int count) {
		Queue<VO> queue = new LinkedList<>();
		queue.offer(new VO(goalX, goalY, count));
		
		while(!queue.isEmpty()) {
			VO vo = queue.poll();
			visited[vo.getX()][vo.getY()] = true;
			
			resultArr[vo.getX()][vo.getY()] = vo.getCount();
			
			for (int i = 0; i < 4; i++) {
				int nx = vo.getX() + dx[i];
				int ny = vo.getY() + dy[i];
				
				if (nx >= 0 && ny >= 0 && nx < row && ny < col && arr[nx][ny] == 1 && !visited[nx][ny]) {
					queue.offer(new VO(nx, ny, vo.getCount() + 1));
				}
			}
		}
	}
	
	static class VO {
		int x;
		int y;
		int count;
		
		VO(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public int getCount() {
			return count;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		public void setCount(int count) {
			this.count = count;
		}
	}
}
