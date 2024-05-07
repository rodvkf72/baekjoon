import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon_18258 {
	static int[] arr;
	static int frontCursor = 0;
	static int backCursor = 0;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			arr = new int[cnt];
			
			Deque<Integer> deque = new LinkedList<>();
			
			for (int i = 0; i < cnt; i++) {
				String[] values = br.readLine().split(" ");
				
				switch (values[0]) {
				case "push":
					deque.add(Integer.parseInt(values[1]));
					break;
				case "pop":
					if (deque.size() == 0) {
						bw.write(String.valueOf(-1));
					} else {
						bw.write(String.valueOf(deque.pollFirst()));
					}
					
					bw.write("\n");
					break;
				case "size":
					bw.write(String.valueOf(deque.size()));
					bw.write("\n");
					break;
				case "empty":
					if (deque.isEmpty()) {
						bw.write(String.valueOf(1));
					} else {
						bw.write(String.valueOf(0));
					}
					bw.write("\n");
					break;
				case "front":
					if (deque.getFirst() == null) {
						bw.write(String.valueOf(-1));
					} else {
						bw.write(String.valueOf(deque.getFirst()));
					}
					bw.write("\n");
					break;
				case "back":
					if (deque.getLast() == null) {
						bw.write(String.valueOf(-1));
					} else {
						bw.write(String.valueOf(deque.getLast()));
					}
					bw.write("\n");
					break;
				}
			}
			
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
