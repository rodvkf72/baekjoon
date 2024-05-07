import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1717 {
	static int[] index;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int max = Integer.parseInt(inputs[0]);
			int cycle = Integer.parseInt(inputs[1]);
			
			index = new int[max + 1];
			
			for (int i = 0; i <= max; i++) {
				index[i] = i;	// index[0], [1], [2] ... [max]
			}
			
			for (int i = 0; i < cycle; i++) {
				String[] values = br.readLine().split(" ");
				
				int flag = Integer.parseInt(values[0]);
				int a = Integer.parseInt(values[1]);
				int b = Integer.parseInt(values[2]);
				
				int check1 = checkFunc(a);
				int check2 = checkFunc(b);
				
				if (flag == 0 && check1 != check2) {
					sumFunc(check1, check2);
				} else if (flag == 1 && check1 != check2) {
					bw.write("NO\n");
				} else if (flag == 1 && check1 == check2) {
					bw.write("YES\n");
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
	
	public static void sumFunc(int a, int b) {
		index[a] = b;
	}
	
	public static int checkFunc(int x) {
		if (index[x] == x) {
			return x;
		} else {
			return index[x] = checkFunc(index[x]);
		}
	}
}
