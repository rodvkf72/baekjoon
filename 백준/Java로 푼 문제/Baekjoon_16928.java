import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_16928 {
	static int[] arr = new int[101];
	static boolean[] visited = new boolean[101];
	static int[] count = new int[101];
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int ladder = Integer.parseInt(inputs[0]);
			int snake = Integer.parseInt(inputs[1]);
			
			for (int i = 0; i < ladder + snake; i++) {
				String[] values = br.readLine().split(" ");
				int start = Integer.parseInt(values[0]);
				int end = Integer.parseInt(values[1]);
				arr[start] = end;
			}
			
			int result = BFS();
			
			bw.write(String.valueOf(result));
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static int BFS() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		visited[1] = true;
		count[1] = 0;
		
		while(!queue.isEmpty()) {
			int cursor = queue.poll();
			
			if (cursor == 100) {
				return count[cursor];
			}
			
			for (int i = 1; i < 7; i++) {
				int sum = cursor + i;
				
				if (sum > 100) {
					continue;
				}
				
				if (visited[sum]) {
					continue;
				}
				
				visited[sum] = true;
				
				if (arr[sum] != 0) {	//위치에 사다리나 뱀이 있는 경우
					if (!visited[arr[sum]]) {	//사다리나 뱀을 타고 이동한 경로에 방문한 적이 없는 경우
						queue.add(arr[sum]);
						visited[arr[sum]] = true;
						count[arr[sum]] = count[cursor] + 1;
					}
				} else {
					queue.add(sum);
					count[sum] = count[cursor] + 1;
				}
			}
		}
		return count[101];
	}
}
