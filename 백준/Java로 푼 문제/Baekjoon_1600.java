import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Baekjoon_1600 {
	static int[] knightx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] knighty = {-2, -1, 1, 2, 2, 1, -1, -2};
	
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	
	static int[][] arr = {};
	static boolean[][] visited = {};
	
	public static void main(String[] args) {
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			OutputStreamWriter out = new OutputStreamWriter(System.out);
			BufferedReader br = new BufferedReader(in);
			BufferedWriter bw = new BufferedWriter(out);
			
			int possible = Integer.parseInt(br.readLine());
			
			String[] xy = br.readLine().split(" ");
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			
			arr = new int[x][y];
			visited = new boolean[x][y];
			
			
			for (int i = 0; i < y; i++) {
				String[] values = br.readLine().split(" ");
				for (int j = 0; j < x; j++) {
					arr[j][i] = Integer.parseInt(values[j]);
					if (arr[j][i] == 1) {
						visited[j][i] = true;
					}
				}
			}
			
			int result = BFS(x, y, possible);
			
			if (result == 0 || result == Integer.MAX_VALUE) {
				bw.write("-1");
			} else {
				bw.write(String.valueOf(result));
			}
			
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static int BFS(int x, int y, int possible) {
		Queue<VO> queue = new LinkedList<VO>();
		queue.add(new VO(0, 0, 0, possible));
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			VO vo = queue.poll();
			visited[vo.getX()][vo.getY()] = true;
			
			if (vo.getX() == x-1 && vo.getY() == y-1) {
				return vo.getCnt();
			}
			
			for (int i = 0; i < 4; i++) {
				int nx = vo.getX() + dx[i];
				int ny = vo.getY() + dy[i];
				
				if (nx >= 0 && ny >= 0 && nx < x && ny < y && !visited[nx][ny]) {
					//visited[nx][ny] = true;
					queue.add(new VO(nx, ny, vo.getCnt()+1, vo.getKCnt()));
				}
			}
			
			if (vo.getKCnt() > 0) {
				for (int i = 0; i < 8; i++) {
					int nx = vo.getX() + knightx[i];
					int ny = vo.getY() + knighty[i];
					
					if (nx >= 0 && ny >= 0 && nx < x && ny < y && !visited[nx][ny]) {
						//visited[nx][ny] = true;
						queue.add(new VO(nx, ny, vo.getCnt()+1, vo.getKCnt()-1));
					}
				}
			}
			
		}		
		
		return -1;
	}
	
	static class VO {
		private int x;
		private int y;
		private int cnt;
		private int kCnt;
		
		public VO (int x, int y, int cnt, int kCnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.kCnt = kCnt;
		}
		
		public int getX() {
			return this.x;
		}
		public int getY() {
			return this.y;
		}
		public int getCnt() {
			return this.cnt;
		}
		public int getKCnt() {
			return this.kCnt;
		}
	}
}
