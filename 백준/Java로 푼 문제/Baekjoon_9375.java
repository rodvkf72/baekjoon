import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Baekjoon_9375 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int testCnt = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testCnt; i++) {
				int clothCnt = Integer.parseInt(br.readLine());
				
				HashMap<String, Integer> map = new HashMap<>();
				for (int j = 0; j < clothCnt; j++) {
					String[] values = br.readLine().split(" ");
					
					if (map.containsKey(values[1])) {
						int cnt = map.get(values[1]);
						map.put(values[1], cnt + 1);
					} else {
						map.put(values[1], 1);
					}
				}
				
				int multiple = 1;
				for (String key : map.keySet()) {
					multiple *= map.get(key) + 1;
				}
				
				bw.write(String.valueOf(multiple-1) + "\n");
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
