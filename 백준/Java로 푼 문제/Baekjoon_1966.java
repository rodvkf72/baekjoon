import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_1966 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			for (int i = 0; i < cycle; i++) {
				String[] strDocuments = br.readLine().split(" ");
				int[] intDocuments = new int[strDocuments.length];
				
				for (int j = 0; j < strDocuments.length; j++) {
					intDocuments[j] = Integer.parseInt(strDocuments[j]);
				}
				
				String[] strValues = br.readLine().split(" ");
				Queue<VO> queue = new LinkedList<>();
				
				for (int j = 0; j < strValues.length; j++) {
					queue.add(new VO(Integer.parseInt(strValues[j]), Integer.valueOf(j)));
				}
				
				int result = 0;
				Loop0:
				while(!queue.isEmpty()) {
					VO vo = queue.poll();
					
					boolean isOver = false;
					for (VO item : queue) {
						if (item.getPriority() > vo.getPriority()) {
							isOver = true;
							break;
						}
					}
					
					if (isOver) {
						queue.add(vo);
					} else {
						result++;
						if (intDocuments[1] == vo.getIndex()) {
							break Loop0;
						}
					}
				}
				bw.write(String.valueOf(result) + "\n");
			}
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	static class VO {
		private int priority;
		private int index;
		
		public VO(int priority, int index) {
			this.priority = priority;
			this.index = index;
		}
		
		public int getPriority() {
			return this.priority;
		}
		public int getIndex() {
			return this.index;
		}
	}
}
