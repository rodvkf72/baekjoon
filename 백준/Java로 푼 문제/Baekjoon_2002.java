import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_2002 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
			 OutputStreamWriter out = new OutputStreamWriter(System.out);
			 BufferedReader br = new BufferedReader(in);
			 BufferedWriter bw = new BufferedWriter(out);) {
			
			int inputSize = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<>();
			int[] arr = new int[inputSize];
			
			for (int i = 0; i < inputSize; i++) {	//터널에 들어가는 차량
				String input = br.readLine();
				map.put(input, i+1);
			}
			
			for (int i = 0; i < inputSize; i++) {	//터널에서 나가는 차량
				String input = br.readLine();
				arr[i] = map.get(input);
			}
			
			int cnt = 0;
			for (int i = 0; i < inputSize; i++) {
				for (int j = i + 1; j < inputSize; j++) {
					if (arr[i] > arr[j]) {
						cnt++;
						break;
					}
				}
			}
			bw.write(String.valueOf(cnt));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
