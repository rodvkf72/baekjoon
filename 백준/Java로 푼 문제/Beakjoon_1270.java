import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Beakjoon_1270 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int count = Integer.parseInt(br.readLine());
			Map<Integer, Integer> map = new HashMap<>();
			
			for (int i = 0; i < count; i++) {
				String[] values = br.readLine().split(" ");
				int numbers = Integer.parseInt(values[0]);
				
				for (int j = 1; j < values.length; j++) {
					int key = Integer.parseInt(values[j]);
					if (map.get(key) != null) {
						map.put(key, map.get(key)+1);
					} else {
						map.put(key, 1);
					}
				}
				
				int winner = 0;
				for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
					if (numbers / 2 < entry.getValue()) {
						winner = entry.getKey(); 
					}
				}
				
				if (winner == 0) {
					bw.write("SYJKGW");
				} else {
					bw.write(String.valueOf(winner));
				}
				bw.newLine();
				
				map.clear();
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
