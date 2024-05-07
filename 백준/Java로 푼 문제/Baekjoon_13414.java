import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;

public class Baekjoon_13414 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int successCnt = Integer.parseInt(inputs[0]);
			int applicantCnt = Integer.parseInt(inputs[1]);
			
			LinkedHashMap<String, Boolean> map = new LinkedHashMap<>();
			
			for (int i = 0; i < applicantCnt; i++) {
				String value = br.readLine();
				
				if (map.containsKey(value)) {
					map.remove(value);
				}
				
				map.put(value, true);
			}
			
			
			int i = 0;
			for (String key : map.keySet()) {
				bw.write(key + "\n");
				
				if (i >= successCnt - 1) {
					break;
				}
				
				i++;
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
