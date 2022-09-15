import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon_2493 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			String[] strValues = br.readLine().split(" ");
			int[] intValues = new int[cycle];
			
			Stack<VO> stack = new Stack<>();
			for (int i = 0; i < cycle; i++) {
				intValues[i] = Integer.parseInt(strValues[i]);
				
				while(!stack.isEmpty()) {
					if (stack.peek().getHeight() >= intValues[i]) {
						bw.write(stack.peek().getIdx()+1 + " ");
						break;
					}
					stack.pop();
				}
				
				if (stack.isEmpty()) {
					bw.write("0 ");
				}
				stack.push(new VO(i, intValues[i]));
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
	
	static class VO {
		private int idx;
		private int height;
		
		public VO(int idx, int height) {
			this.idx = idx;
			this.height = height;
		}
		
		public int getIdx() {
			return this.idx;
		}
		
		public int getHeight() {
			return this.height;
		}
	}
}
