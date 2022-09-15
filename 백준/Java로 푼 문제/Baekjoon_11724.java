import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon_11724 {
	static boolean[] visited;
	static int[][] lines;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int pointCnt = Integer.parseInt(inputs[0]);
			int lineCnt = Integer.parseInt(inputs[1]);
			
			visited = new boolean[pointCnt];
			lines = new int[pointCnt][pointCnt];
			
			for (int i = 0; i < lineCnt; i++) {
				String[] line = br.readLine().split(" ");
				int start = Integer.parseInt(line[0]);
				int end = Integer.parseInt(line[1]);
				
				lines[start-1][end-1] = 1;
				lines[end-1][start-1] = 1;
			}
			
			int cnt = 0;
			for (int i = 0; i < pointCnt; i++) {
				if (!visited[i]) {
					dfs(i, pointCnt);
					cnt++;
				}
			}
			
			bw.write(String.valueOf(cnt));
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void dfs(int start, int pointCnt) {
		visited[start] = true;
		
		for (int i = 0; i < pointCnt; i++) {
			if (!visited[i] && lines[start][i] == 1) {
				dfs(i, pointCnt);
			}
		}
	}
}
