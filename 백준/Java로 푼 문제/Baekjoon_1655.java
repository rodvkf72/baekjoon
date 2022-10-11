import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Baekjoon_1655 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
			 OutputStreamWriter out = new OutputStreamWriter(System.out);
			 BufferedReader br = new BufferedReader(in);
			 BufferedWriter bw = new BufferedWriter(out);){
			
			int inputCnt = Integer.parseInt(br.readLine());
			PriorityQueue<Integer> leftQueue = new PriorityQueue<>(Collections.reverseOrder());	// 1, 2, 3, 4 ...
			PriorityQueue<Integer> rightQueue = new PriorityQueue<>();	// ... 4, 3, 2, 1
			
			for (int i = 0; i < inputCnt; i++) {
				int value = Integer.parseInt(br.readLine());
				
				if (leftQueue.size() == rightQueue.size()) {
					leftQueue.add(value);
				} else {
					rightQueue.add(value);
				}
				
				if (!leftQueue.isEmpty() && !rightQueue.isEmpty()) {
					if (leftQueue.peek() > rightQueue.peek()) {
						int leftQueueValue = leftQueue.poll();
						int rightQueueValue = rightQueue.poll();
						leftQueue.add(rightQueueValue);
						rightQueue.add(leftQueueValue);
					}
				}
				
				bw.write(String.valueOf(leftQueue.peek()) + "\n");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
