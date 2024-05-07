import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon_17298 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			String[] inputs = br.readLine().split(" ");
			int[] intValues = new int[cnt];
			
			for (int i = 0; i < cnt; i++) {
				intValues[i] = Integer.parseInt(inputs[i]);
			}
			
			Stack<Integer> emptyStack = new Stack<>();
			Stack<Integer> resultStack = new Stack<>();
			
			for (int i = cnt-1; i >= 0; i--) {
				if (resultStack.isEmpty()) {	//처음 가장 우측 값 -> -1이 될 수 밖에 없음
					resultStack.push(-1);
					emptyStack.push(intValues[i]);
					continue;
				}
				
				while(!emptyStack.isEmpty()) {
					if (emptyStack.peek() > intValues[i]) {	//현재 숫자 보다 오른쪽에 있는 숫자가 더 큰 경우
						resultStack.push(emptyStack.peek());
						emptyStack.push(intValues[i]);
						break;
					} else {	//오른쪽에 있는 숫자 보다 현재 숫자가 더 큰 경우	( emptyStack.peek() < intValues[i] )
						emptyStack.pop();
					}
				}
				
				if (emptyStack.isEmpty()) {
					resultStack.push(-1);
					emptyStack.push(intValues[i]);
				}
			}
			
			while(!resultStack.isEmpty()) {
				int pop = resultStack.pop();
				
				if (!resultStack.isEmpty()) {
					bw.write(String.valueOf(pop) + " ");
				} else {
					bw.write(String.valueOf(pop));
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
