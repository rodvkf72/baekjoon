import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_26069 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			Map<String, Boolean> map = new HashMap<>();
			
			for (int i = 0; i < cnt; i++) {
				String[] values = br.readLine().split(" ");
				
				if (values[0].equals("ChongChong")) {			// 첫 번째 입력받은 사람이 총총인 경우
					map.put(values[0], true);
					map.put(values[1], true);
				} else if (values[1].equals("ChongChong")) {	// 두 번쨰 입력받은 사람이 총총인 경우
					map.put(values[0], true);
					map.put(values[1], true);
				} else {										// 입력받은 두 값이 총총이 아닌 경우
					if (map.get(values[0]) == null) {			// 첫 번째 입력받은 사람이 처음인 경우
						map.put(values[0], false);
					}
					
					if (map.get(values[1]) == null) {			// 두 번째 입력받은 사람이 처음인 경우
						map.put(values[1], false);
					}
					
					if (map.get(values[0])) {					// 첫 번째 입력받은 사람이 [무지개댄스] 를 추고 있는 경우
						map.put(values[1], true);
					} else if (map.get(values[1])) {			// 두 번째 입력받은 사람이 [무지개댄스] 를 추고 있는 경우
						map.put(values[0], true);
					}
				}
			}
			
			int result = 0;
			for (Map.Entry<String, Boolean> entry : map.entrySet()) {
				if (entry.getValue()) {
					result++;
				}
			}
			
			bw.write(String.valueOf(result));
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
