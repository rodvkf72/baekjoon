import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Baekjoon_11725 {
	static boolean[] visited;
	static ArrayList<Integer> list[];
	static int[] parent;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int inputs = Integer.parseInt(br.readLine());
			
			parent = new int[inputs + 1];
			list = new ArrayList[inputs + 1];
			visited = new boolean[inputs + 1];
			
			for (int i = 1; i < inputs + 1; i++) {
				list[i] = new ArrayList<>();
			}
			
			for (int i = 0; i < inputs - 1; i++) {
				String[] values = br.readLine().split(" ");
				int one = Integer.parseInt(values[0]);
				int two = Integer.parseInt(values[1]);
				
				list[one].add(two);
				list[two].add(one);
			}
			
			DFS(1);
			
			for (int i = 2; i <= inputs; i++) {
				bw.write(String.valueOf(parent[i]) + "\n");
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void DFS(int index) {
		visited[index] = true;
		
		for (int i : list[index]) {
			if (!visited[i]) {
				parent[i] = index;
				DFS(i);
			}
		}
	}
}
