import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon_1874 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		int savePoint = 0;
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			Stack<Integer> stack = new Stack<Integer>();
			
			for (int i = 0; i < cycle; i++) {
				int value = Integer.parseInt(br.readLine());
				
				if (value > savePoint) {
					for (int j = savePoint + 1; j <= value; j++) {
						stack.push(j);
						bw.write("+\n");
					}
					savePoint = value;
				} else if (stack.peek() != value) {
					System.out.println("NO");
					System.exit(0);
				}

				stack.pop();
				bw.write("-\n");
			}
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
