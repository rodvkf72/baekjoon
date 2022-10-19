import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_11722 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);) {
			
			int size = Integer.parseInt(br.readLine());
			
			int[] arr = new int[size];
			int[] DP = new int[size];
			String[] inputs = br.readLine().split(" ");
			
			for (int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(inputs[i]);
				DP[i] = 1;
			}
			
			for (int i = 0; i < size; i++) {
				int baseValue = arr[i];
				
				for (int j = i+1; j < size; j++) {
					int compareValue = arr[j];
					if (baseValue > compareValue) {	//다음 값이 더 작은 경우
						DP[j] = Math.max(DP[j], DP[i]+1);
					}
				}
			}
			
			Arrays.sort(DP);
			
			bw.write(String.valueOf(DP[size-1]));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
