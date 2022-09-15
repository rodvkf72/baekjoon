import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Baekjoon_17219 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int siteCnt = Integer.parseInt(inputs[0]);
			int pwCnt = Integer.parseInt(inputs[1]);
			
			HashMap<String, String> map = new HashMap<>();
			for (int i = 0; i < siteCnt; i++) {
				String[] values = br.readLine().split(" ");
				map.put(values[0], values[1]);
			}
			
			for (int i = 0; i < pwCnt; i++) {
				String value = br.readLine();
				
				bw.write(String.valueOf(map.get(value)) + "\n");
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
