import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1735 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] input1 = br.readLine().split(" ");
			String[] input2 = br.readLine().split(" ");
			
			int[] intInput1 = new int[2];
			int[] intInput2 = new int[2];
			
			for (int i = 0; i < 2; i++) {
				intInput1[i] = Integer.parseInt(input1[i]);
				intInput2[i] = Integer.parseInt(input2[i]);
			}
			
			int top = (intInput1[0] * intInput2[1]) + (intInput1[1] * intInput2[0]);
			int btm = intInput1[1] * intInput2[1];
			
			int remain = gcd(top, btm);
			
			bw.write(String.valueOf(top / remain) + " " + String.valueOf(btm / remain));
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a%b);
	}
}
