import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Baekjoon_20291 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);) {
			
			int inputCnt = Integer.parseInt(br.readLine());
			
			Map<String, Integer> map = new TreeMap<>();
			for (int i = 0; i < inputCnt; i++) {
				String[] values = br.readLine().split("\\.");
				if (!map.isEmpty()) {
					if (map.containsKey(values[1])) {
						map.put(values[1], map.get(values[1]) + 1);
					} else {
						map.put(values[1], 1);
					}
				} else {
					map.put(values[1], 1);
				}
			}
			
			for (String key : map.keySet()) {
				bw.write(key + " " + String.valueOf(map.get(key)) + "\n");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
