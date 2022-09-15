import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Baekjoon_14425 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int setCycle = Integer.parseInt(inputs[0]);
			int strCycle = Integer.parseInt(inputs[1]);
			
			HashMap<String, Integer> map = new HashMap<>();
			for (int i = 0; i < setCycle; i++) {
				//sets[i] = br.readLine();
				map.put(br.readLine(), 1);
			}
			
			int cnt = 0;
			for (int i = 0; i < strCycle; i++) {
				if (map.get(br.readLine()) != null) {
					cnt++;
				}
			}
			
			bw.write(String.valueOf(cnt));
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
