import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map.Entry;

public class Baekjoon_1620 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int monsterCnt = Integer.parseInt(inputs[0]);
			int findCnt = Integer.parseInt(inputs[1]);
			
			HashMap<String, Integer> map = new HashMap<>();
			String[] arr = new String[monsterCnt + 1];
			for (int i = 1; i <= monsterCnt; i++) {
				String monster = br.readLine();
				map.put(monster, i);
				arr[i] = monster;
			}
			
			for (int i = 0; i < findCnt; i++) {
				String value = br.readLine();
				if (value.charAt(0) < 58) {	//숫자로 입력받는 경우
					int findNum = Integer.parseInt(value);
					
					bw.write(arr[findNum] + "\n");
				} else {
					bw.write(map.get(value) + "\n");
				}
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
