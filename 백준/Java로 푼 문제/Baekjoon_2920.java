import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2920 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] values = br.readLine().split(" ");
			
			int first = Integer.parseInt(values[0]);
			
			String str = "";
			if (first == 1) {
				for (int i = 0; i < 8; i++) {
					if (i+1 == Integer.parseInt(values[i])) {
						str = "ascending";
					} else {
						str = "mixed";
						break;
					}
				}
			} else if (first == 8) {
				for (int i = 0; i < 8; i++) {
					if (first - i == Integer.parseInt(values[i])) {
						str = "descending";
					} else {
						str = "mixed";
						break;
					}
				}
			} else {
				str = "mixed";
			}
			
			bw.write(str);
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
