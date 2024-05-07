import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Baekjoon_7785 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			Map<String, String> map = new HashMap<>();
			for (int i = 0; i < cnt; i++) {
				String[] inputs = br.readLine().split(" ");
				map.put(inputs[0], inputs[1]);
			}
			
			ArrayList<String> result = new ArrayList<>();
			for (Entry<String, String> entry : map.entrySet()) {
				if (entry.getValue().equals("enter")) {
					result.add(entry.getKey());
				}
			}
			result.sort(Comparator.reverseOrder());
			
			for (int i = 0; i < result.size(); i++) {
				bw.write(result.get(i) + "\n");
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
