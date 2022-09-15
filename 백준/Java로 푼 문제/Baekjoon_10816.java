import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Baekjoon_10816 {
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			String[] defStr = br.readLine().split(" ");
			HashMap<Integer, Integer> map = new HashMap<>();
			
			for (int i = 0; i < defStr.length; i++) {
				int defValue = Integer.parseInt(defStr[i]);
				int value = 1;
				if (map.get(defValue) != null) {
					value = map.get(defValue) + 1;
				}
				map.put(defValue, value);
			}
			
			
			int comp = Integer.parseInt(br.readLine());
			String[] compStr = br.readLine().split(" ");
			
			for (int i = 0; i < comp; i++) {
				int compValue = Integer.parseInt(compStr[i]);
				
				int value = 0;
				if (map.get(compValue) != null) {
					value = map.get(compValue);
				}
				bw.write(String.valueOf(value) + " ");
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
