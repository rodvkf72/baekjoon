import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Baekjoon_11478 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String str = br.readLine();
			
			HashSet<String> set = new HashSet<>();
			for (int i = 0; i <  str.length(); i++) {
				for (int j = i+1; j <= str.length(); j++) {
					set.add(str.substring(i, j));
				}
			}
			bw.write(String.valueOf(set.size()));
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
