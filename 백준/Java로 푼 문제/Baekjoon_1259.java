import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Baekjoon_1259 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			while (true) {
				String[] strValues = br.readLine().split("");
				if (strValues[0].equals("0")) {
					break;
				}
				Queue<Integer> queue = new LinkedList<>();
				Stack<Integer> stack = new Stack<>();
				
				for (int i = 0; i <strValues.length; i++) {
					queue.add(Integer.parseInt(strValues[i]));
					stack.push(Integer.parseInt(strValues[i]));
				}
				
				String queueStr = "";
				String stackStr = "";
				
				while(!queue.isEmpty()) {
					int temp = queue.poll();
					queueStr += Integer.toString(temp);
				}
				
				while(!stack.isEmpty()) {
					int temp = stack.pop();
					stackStr += Integer.toString(temp);
				}
				
				if (queueStr.equals(stackStr)) {
					bw.write("yes\n");
				} else {
					bw.write("no\n");
				}
				bw.flush();
			}
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
