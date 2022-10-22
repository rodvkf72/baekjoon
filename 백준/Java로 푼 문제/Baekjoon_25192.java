import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_25192 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);){
			
			int chattingCnt = Integer.parseInt(br.readLine());
			
			Map<String, Integer> map = new HashMap<>();
			boolean isEnter = false;
			int gomgom = 0;
			for (int i = 0 ; i < chattingCnt; i++) {
				String input = br.readLine();
				
				if (input.equals("ENTER")) {
					isEnter = true;
					map.clear();
				} else {
					if (isEnter) {
						if (!map.containsKey(input)) {
							gomgom++;
							map.put(input, 1);
						}
					}
				}
			}
			
			bw.write(String.valueOf(gomgom));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
