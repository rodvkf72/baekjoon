import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon_12789 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			int[] arr = new int[cnt];
			
			String[] values = br.readLine().split(" ");
			
			for (int i = 0; i < cnt; i++) {
				arr[i] = Integer.parseInt(values[i]);
			}
			
			int start = 1;
			
			Stack<Integer> stack = new Stack<>();
			
			for (int i = 0; i < cnt; i++) {
				stack.push(arr[i]);
				
				while (!stack.isEmpty() && stack.peek() == start) {
					stack.pop();
					start++;
				}
			}
			
			if (stack.isEmpty()) {
				bw.write("Nice");
			} else {
				bw.write("Sad");
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
