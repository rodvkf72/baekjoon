import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon_17299 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			String[] strValues = br.readLine().split(" ");
			int[] intValues = new int[cnt];
			int[] indexValues = new int[1000001];
			
			Stack<Integer> originStack = new Stack<>();	// 입력받은 값 스택
			Stack<Integer> emptyStack = new Stack<>();	// 비교대상 스택
			Stack<Integer> resultStack = new Stack<>();	// 결과 값 스택
			
			for (int i = 0; i < cnt; i++) {
				int value = Integer.parseInt(strValues[i]);
				intValues[i] = value;
				indexValues[value]++;
				
				originStack.push(value);
			}
			
			while(!originStack.isEmpty()) {
				int value = originStack.pop();
				int originCnt = indexValues[value];	// 입력받은 값의 개수
				
				if(resultStack.isEmpty()) {	//가장 오른쪽 값(처음 값) 처리
					resultStack.push(-1);
					emptyStack.push(value);
				} else {
					while(!emptyStack.isEmpty()) {	// 비교대상이 있는 경우
						int eValue = emptyStack.pop();
						int emptyCnt = indexValues[eValue];
						
						if (originCnt < emptyCnt) {	//현재 값의 횟수가 오른쪽에 있는 수의 횟수보다 작은 경우
							resultStack.push(eValue);
							emptyStack.push(eValue);
							emptyStack.push(value);
							break;
						}
					}
					
					if (emptyStack.isEmpty()) {	// 비교대상이 없는 경우
						resultStack.push(-1);
						emptyStack.push(value);
					}
				}
			}
			
			for (int i = resultStack.size(); i > 0; i--) {
				if (i != 0) {
					bw.write(String.valueOf(resultStack.pop()) + " ");
				} else {
					bw.write(String.valueOf(resultStack.pop()));
				}
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
