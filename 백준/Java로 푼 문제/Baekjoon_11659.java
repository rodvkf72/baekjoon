import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_11659 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int[] values = new int[Integer.parseInt(inputs[0])+1];
			
			String[] strValues = br.readLine().split(" ");
			
			values[0] = 0;
			for (int i = 1; i <= values.length-1; i++) {
				values[i] = values[i-1] + Integer.parseInt(strValues[i-1]);
			}
			
			for (int i = 0; i < Integer.parseInt(inputs[1]); i++) {
				String[] terms = br.readLine().split(" ");
				int start = Integer.parseInt(terms[0]);
				int end = Integer.parseInt(terms[1]);
				
				bw.write(String.valueOf(values[end] - values[start-1]) + "\n");
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
}
