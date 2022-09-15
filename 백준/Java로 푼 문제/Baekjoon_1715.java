import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Baekjoon_1715 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			PriorityQueue<Long> priority = new PriorityQueue<>();
			
			for (int i = 0; i < cycle; i++) {
				priority.add(Long.parseLong(br.readLine()));
			}
			
			long sum = 0;
			while(priority.size() > 1) {
				long sum1 = priority.poll();
				long sum2 = priority.poll();
				
				sum += sum1 + sum2;
				priority.add(sum1 + sum2);
			}
			bw.write(String.valueOf(sum));
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
