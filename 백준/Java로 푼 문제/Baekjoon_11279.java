import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Baekjoon_11279 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			PriorityQueue<Integer> queue = new PriorityQueue<>();
			for (int i = 0; i < cnt; i++) {
				int value = Integer.parseInt(br.readLine());
				
				if (value == 0) {
					if (queue.isEmpty()) {
						bw.write("0\n");
					} else {
						bw.write(queue.poll() + "\n");
					}
				} else {
					queue.add(value);
				}
			}
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
