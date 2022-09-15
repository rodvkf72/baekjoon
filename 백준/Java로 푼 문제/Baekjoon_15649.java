import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_15649 {
	static InputStreamReader in = new InputStreamReader(System.in);
	static OutputStreamWriter out = new OutputStreamWriter(System.out);
	static BufferedReader br = new BufferedReader(in);
	static BufferedWriter bw = new BufferedWriter(out);
	
	static int[] arr;
	static boolean[] visited;
	
	public static void main(String[] args) {
		try {
			String[] inputs = br.readLine().split(" ");
			
			int num = Integer.parseInt(inputs[0]);
			int length = Integer.parseInt(inputs[1]);
			
			arr = new int[length];
			visited = new boolean[num];
			
			DFS(num, length, 0);
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void DFS(int number, int length, int depth) {
		try {
			if (depth == length) {
				for (int value : arr) {
					bw.write(String.valueOf(value) + " ");
				}
				bw.write("\n");
				return;
			}
			
			for (int i = 0; i < number; i++) {
				if (!visited[i]) {
					visited[i] = true;
					arr[depth] = i+1;
					DFS(number, length, depth+1);
					visited[i] = false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
