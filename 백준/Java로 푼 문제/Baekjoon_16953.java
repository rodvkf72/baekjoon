import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_16953 {
	static int cnt = 0;
	
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);) {
			
			String[] values = br.readLine().split(" ");
			long startNum = Integer.parseInt(values[0]);
			long endNum = Integer.parseInt(values[1]);
			
			bw.write(String.valueOf(BFS(startNum, endNum)));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int BFS(long startNum, long endNum) {
		Queue<Long> queue = new LinkedList<>();
		queue.add(startNum);
		
		while(!queue.isEmpty()) {
			int queueSize = queue.size();
			
			for (int i = 0; i < queueSize; i++) {
				long num = queue.poll();
				if (num == endNum) {
					cnt++;
					return cnt;
				} else {
					long multiply = num * 2;
					long plusOne = num * 10 + 1;
					
					if (multiply <= endNum) {
						queue.add(multiply);
					}
					if (plusOne <= endNum) {
						queue.add(plusOne);
					}
				}
			}
			cnt++;
		}
		return -1;
	}
}
