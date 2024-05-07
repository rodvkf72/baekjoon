import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_3273 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			String[] strValues = br.readLine().split(" ");
			int want = Integer.parseInt(br.readLine());
			
			int[] intValues = new int[cnt];
			
			for (int i = 0; i < cnt; i++) {
				intValues[i] = Integer.parseInt(strValues[i]);
			}
			Arrays.sort(intValues);
			
			int startPointer = 0;
			int endPointer = cnt - 1;
			int result = 0;
			
			while(startPointer < endPointer) {
				int sum = intValues[startPointer] + intValues[endPointer];
				
				if (sum == want) {
					result++;
				}
				
				if (sum <= want) {
					startPointer++;
				} else {
					endPointer--;
				}
			}
			
			bw.write(String.valueOf(result));
			
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
