import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_11720 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			br.readLine();
			
			String[] values = br.readLine().split("");
			
			int sum = 0;
			for (int i = 0; i < values.length; i++) {
				sum += Integer.parseInt(values[i]);
			}
			bw.write(String.valueOf(sum));
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
