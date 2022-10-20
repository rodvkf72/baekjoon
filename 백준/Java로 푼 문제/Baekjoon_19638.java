import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Baekjoon_19638 {
	public static void main(String[] args) {
		try(InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);) {
			
			String[] inputs = br.readLine().split(" ");
			
			int giantCnt = Integer.parseInt(inputs[0]);
			int centi = Integer.parseInt(inputs[1]);
			int hammerCnt = Integer.parseInt(inputs[2]);
			
			PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
			int maxGiant = Integer.MIN_VALUE;
			for (int i = 0; i < giantCnt; i++) {
				int giant = Integer.parseInt(br.readLine());
				
				if (giant >= centi) {
					queue.add(giant);
				}
				maxGiant = Math.max(maxGiant, giant);
			}
			
			int min = 0;
			if (queue.isEmpty()) {	//모든 거인들의 키가 센티보다 작은 경우
				bw.write("YES\n");
				bw.write(String.valueOf(min));
			} else {
				for (int i = 0; i < hammerCnt; i++) {
					min++;
					if (!queue.isEmpty()) {
						int priorityGiant = queue.poll() / 2;
						
						if (priorityGiant > 0) {
							if (priorityGiant >= centi) {
								queue.add(priorityGiant);
							}
						}
						
						if (queue.isEmpty()) {
							break;
						}
					}
				}
				
				if (!queue.isEmpty()) {	//망치 사용 횟수를 다 쓰고도 센티보다 키가 큰 거인이 있는 경우
					bw.write("NO\n");
					bw.write(String.valueOf(queue.poll()));
				} else {	//키가 큰 거인이 없는 경우
					if (centi == 1) {
						bw.write("NO\n");
						bw.write(String.valueOf(maxGiant));
					} else {
						bw.write("YES\n");
						bw.write(String.valueOf(min));
					}
				}
			}
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
