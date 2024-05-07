import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_4779 {
	static String[] result;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String value = "";
			
			while((value = br.readLine()) != null) {
				int size = Integer.parseInt(value);
				int powSize = (int) Math.pow(3, size);
				
				result = new String[powSize];
				
				cantor(0, powSize, false);
				
				for (int i = 0; i < powSize; i++) {
					bw.write(result[i]);
				}
				bw.flush();
				bw.write("\n");
			}
			
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void cantor(int start, int powSize, boolean isEmpty) {
		
		if (isEmpty) {
			for (int i = start; i < start + powSize; i++) {
				result[i] = " ";
			}
			return;
		}
		
		if (powSize == 1) {
			result[start] = "-";
			return;
		}
		
		int divide = powSize / 3;
		
		if (divide == 0) {
			return;
		}
		
		int cnt = 0;
		for (int i = start; i < start + powSize; i += divide) {
			cnt++;
			if (cnt == 2) {
				cantor(i, divide, true);
			} else {
				cantor(i, divide, false);
			}
		}
	}
}
