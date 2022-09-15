import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_15650 {
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
			
			DFS(1, num, length, 0);
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void DFS(int at, int number, int length, int depth) {
		try {
			if (length == depth) {
				for (int value : arr) {
					bw.write(String.valueOf(value) + " ");
				}
				bw.write("\n");
				return;
			}
			
			for (int i = at; i <= number; i++) {
				arr[depth] = i;
				DFS(i+1, number, length, depth+1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
