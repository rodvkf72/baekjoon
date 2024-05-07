import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_1213_ing {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] values = br.readLine().split("");
			
			Map<String, Integer> map = new HashMap<>();
			
			for (int i = 0; i < values.length; i++) {
				if (map.get(values[i]) == null) {
					map.put(values[i], 0);
				} else {
					map.put(values[i], map.get(values[i]) + 1);
				}
			}
			
			for (int i = 0; i < values.length; i++) {
				int cursor = 2;
				
			}
			
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
