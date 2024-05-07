import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon_1021 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] queue = br.readLine().split(" ");
			
			int queueSize = Integer.parseInt(queue[0]);
			int queueCnt = Integer.parseInt(queue[1]);
			
			Deque<Integer> q = new LinkedList<Integer>();
			
			for (int i = 0; i < queueSize; i++) {
				q.add(i + 1);
			}
			
			String[] values = br.readLine().split(" ");
			int sum = 0;
			
			//찾고자 하는 수 만큼 반복
			for (int i = 0; i < queueCnt; i++) {
				int left = 0;
				int right = 0;
				int catchValue = Integer.parseInt(values[i]);
				
				Deque<Integer> leftQ = new LinkedList<>(q);
				Deque<Integer> rightQ = new LinkedList<>(q);
				
				//덱에서 왼쪽 이동 시 횟수 계산
				for (int j = 0; j < q.size(); j++) {
					if (leftQ.getFirst() == catchValue) {
						leftQ.pollFirst();
						break;
					} else {
						left++;
						leftQ.add(leftQ.getFirst());
						leftQ.pollFirst();
					}
				}
				
				//덱에서 오른쪽 이동 시 횟수 계산
				for (int k = 0; k < q.size(); k++) {
					if (rightQ.getFirst() == catchValue) {
						rightQ.pollFirst();
						break;
					} else {
						right++;
						rightQ.addFirst(rightQ.getLast());
						rightQ.pollLast();
					}
				}
				
				if (left > right) {
					q = rightQ;
				} else {
					q = leftQ;
				}
				
				sum += Math.min(left, right);
			}
			bw.write(String.valueOf(sum));
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
