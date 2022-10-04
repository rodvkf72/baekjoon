import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_2583 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int[][] arr;
	static boolean[][] visited;
	static int resultCnt = 0;
	static int[] sumCnt = new int[10001];
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int col = Integer.parseInt(inputs[0]);	//행
			int row = Integer.parseInt(inputs[1]);	//열
			int cnt = Integer.parseInt(inputs[2]);	//그려지는 사각형의 개수
			
			arr = new int[col+1][row+1];
			visited = new boolean[col+1][row+1];
			
			for (int i = 0; i < cnt; i++) {
				String[] values = br.readLine().split(" ");

				int startCol = Integer.parseInt(values[0]);
				int startRow = Integer.parseInt(values[1]);
				int endCol = Integer.parseInt(values[2]);
				int endRow = Integer.parseInt(values[3]);
				
				for (int j = startCol; j < endCol; j++) {
					for (int k = col-endRow; k < col-startRow; k++) {	//기존 배열과의 0,0 기준이 달라 이를 맞추기 위함
						arr[k][j] = 1;
					}
				}
			}
			
			int a = 0;
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < row; j++) {
					if (arr[i][j] != 1 && !visited[i][j]) {
						DFS(i, j, col, row, a);
						resultCnt++;
						a++;
					}
				}
			}
			Arrays.sort(sumCnt);
			
			bw.write(String.valueOf(resultCnt) + "\n");
			
			String result = "";
			for (int i = 0; i < 10001; i++) {
				if (sumCnt[i] != 0) {
					result += Integer.toString(sumCnt[i]) + " ";
				}
			}
			result = result.substring(0, result.length() - 1);
			bw.write(result);
			
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void DFS(int col, int row, int maxCol, int maxRow, int a) {
		sumCnt[a]++;
		visited[col][row] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = col + dx[i];
			int ny = row + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < maxCol && ny < maxRow && arr[nx][ny] != 1 && !visited[nx][ny]) {
				DFS(nx, ny, maxCol, maxRow, a);
			}
		}
	}
}
