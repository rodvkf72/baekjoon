import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Baekjoon_4358 {
	public static void main(String[] args) {
		try(InputStreamReader in = new InputStreamReader(System.in);
			OutputStreamWriter out = new OutputStreamWriter(System.out);
			BufferedReader br = new BufferedReader(in);
			BufferedWriter bw = new BufferedWriter(out);) {
			
			String input = "";
			int cnt = 0;
			Map<String, Integer> map = new TreeMap<>();
			while((input = br.readLine()) != null && !input.isEmpty()) {
				cnt++;
				if (map.containsKey(input)) {
					map.put(input, map.get(input)+1);
				} else {
					map.put(input, 1);
				}
			}
			
			for (String key : map.keySet()) {
				double percent = (double) map.get(key) / (double) cnt * 100;
				bw.write(key + " " + String.format("%.4f", percent) + "\n");
			}
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
