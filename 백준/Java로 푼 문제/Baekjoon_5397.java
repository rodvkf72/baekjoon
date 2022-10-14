import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Baekjoon_5397 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);){
			
			int testcaseCnt = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testcaseCnt; i++) {
				String[] inputs = br.readLine().split("");
				Stack<String> leftStack = new Stack<>();
				Stack<String> rightStack = new Stack<>();
				
				for (int j = 0; j < inputs.length; j++) {
					String value = inputs[j];
					if (value.equals("<")) {
						if (!leftStack.isEmpty()) {
							rightStack.push(leftStack.pop());
						}
					} else if (value.equals(">")) {
						if (!rightStack.isEmpty()) {	
							leftStack.push(rightStack.pop());
						}
					} else if (value.equals("-")){
						if (!leftStack.isEmpty()) {
							leftStack.pop();
						}
					} else {
						leftStack.push(value);
					}
				}
				while(!leftStack.isEmpty()) {
					rightStack.push(leftStack.pop());
				}
				
				while(!rightStack.isEmpty()) {
					bw.write(rightStack.pop());
				}
				bw.write("\n");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
