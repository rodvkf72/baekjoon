import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_22233 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);){
			
			String[] inputs = br.readLine().split(" ");
			int keywordCnt = Integer.parseInt(inputs[0]);
			int writeCnt = Integer.parseInt(inputs[1]);
			
			Map<String, Integer> map = new HashMap<>();
			for (int i = 0; i < keywordCnt; i++) {
				map.put(br.readLine(), 1);
			}
			
			for (int i = 0; i < writeCnt; i++) {
				String[] keywords = br.readLine().split(",");
				for (int j = 0; j < keywords.length; j++) {
					if (map.containsKey(keywords[j])) {	//쓴 글의 키워드가 입력받은 키워드 중에 있는 경우
						map.remove(keywords[j]);
					}
				}
				bw.write(String.valueOf(map.size()) + "\n");
			}
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
