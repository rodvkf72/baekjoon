import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Baekjoon_2075 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);) {
			int size = Integer.parseInt(br.readLine());
			
			PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
			for (int i = 0; i < size; i++) {
				String[] values = br.readLine().split(" ");
				for (int j = 0; j < values.length; j++) {
					queue.add(Integer.parseInt(values[j]));
				}
			}
			for (int i = 0; i < size-1; i++) {
				queue.remove();
			}
			bw.write(String.valueOf(queue.poll()));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
