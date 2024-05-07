import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Baekjoon_15903 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			long cnt = Long.parseLong(inputs[0]);
			long cycle = Long.parseLong(inputs[1]);
			
			String[] strNumbers = br.readLine().split(" ");
			
			PriorityQueue<Long> queue = new PriorityQueue<>();
			for (int i = 0; i < cnt; i++) {
				long value = Long.parseLong(strNumbers[i]);
				queue.add(value);
			}
			
			for (int i = 0; i < cycle; i++) {
				long one = queue.poll();
				long two = queue.poll();
				long sum = one + two;
				
				queue.add(sum);
				queue.add(sum);
			}
			
			long result = 0;
			while(!queue.isEmpty()) {
				result += queue.poll();
			}
			
			bw.write(String.valueOf(result));
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
