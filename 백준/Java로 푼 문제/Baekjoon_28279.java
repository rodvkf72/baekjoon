import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Baekjoon_28279 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			Deque<Integer> deque = new LinkedList<>();
			
			for (int i = 0; i < cnt; i++) {
				String[] values = br.readLine().split(" ");
				
				switch(values[0]) {
				case "1":	//addRight
					deque.addFirst(Integer.parseInt(values[1]));
					break;
				case "2":	//addLeft
					deque.addLast(Integer.parseInt(values[1]));
					break;
				case "3":	//popRight
					if (!deque.isEmpty()) {
						bw.write(String.valueOf(deque.pollFirst()));
					} else {
						bw.write(String.valueOf(-1));
					}
					bw.write("\n");
					break;
				case "4":	//popLeft
					if (!deque.isEmpty()) {
						bw.write(String.valueOf(deque.pollLast()));
					} else {
						bw.write(String.valueOf(-1));
					}
					bw.write("\n");
					break;
				case "5":	//size
					bw.write(String.valueOf(deque.size()));
					bw.write("\n");
					break;
				case "6":	//empty
					if (deque.isEmpty()) {
						bw.write(String.valueOf(1));
					} else {
						bw.write(String.valueOf(0));
					}
					bw.write("\n");
					break;
				case "7":	//getRight
					if (!deque.isEmpty()) {
						bw.write(String.valueOf(deque.getFirst()));
					} else {
						bw.write(String.valueOf(-1));
					}
					bw.write("\n");
					break;
				case "8":	//getLeft
					if (!deque.isEmpty()) {
						bw.write(String.valueOf(deque.getLast()));
					} else {
						bw.write(String.valueOf(-1));
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
