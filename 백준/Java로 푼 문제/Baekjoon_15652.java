import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_15652 {
	static InputStreamReader in = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(in);
	static OutputStreamWriter out = new OutputStreamWriter(System.out);
	static BufferedWriter bw = new BufferedWriter(out);
	
	static boolean[] visited;
	static int[] arr;
	
	public static void main(String[] args) {
		try {
			String[] inputs = br.readLine().split(" ");
			
			int num = Integer.parseInt(inputs[0]);
			int length = Integer.parseInt(inputs[1]);
			
			visited = new boolean[length];
			arr = new int[num];
			
			DFS(1, num, length, 0);
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void DFS(int at, int num, int length, int depth) throws Exception {
		if (length == depth) {
			for (int value : arr) {
				bw.write(String.valueOf(value) + " ");
			}
			bw.write("\n");
			return;
		}
		
		for (int i = at; i <= num; i++) {
			arr[depth] = i;
			DFS(i, num, length, depth+1);
		}
	}
}
