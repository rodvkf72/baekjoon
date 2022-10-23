import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_11497 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedReader br = new BufferedReader(in);
				BufferedWriter bw = new BufferedWriter(out);) {
			
			int testcaseCnt = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testcaseCnt; i++) {
				int inputCnt = Integer.parseInt(br.readLine());
				String[] strValues = br.readLine().split(" ");
				int[] intValues = new int[inputCnt];
				int[] temp = new int[inputCnt];
				
				for (int j = 0; j < inputCnt; j++) {
					intValues[j] = Integer.parseInt(strValues[j]);
				}
				
				Arrays.sort(intValues);
				
				int len = inputCnt / 2;
				if (inputCnt % 2 != 0) {
					len++;
				}
				for (int j = 0; j < len; j++) {
					if (j == 0) {
						temp[j] = intValues[0];
					} else {
						temp[j] = intValues[j * 2];
					}
				}
				
				for (int j = 0; j < inputCnt/2; j++) {
					temp[inputCnt-j-1] = intValues[j * 2 + 1];
				}
				
				int term = Integer.MIN_VALUE;
				
				for (int j = 0; j < inputCnt-1; j++) {
					int baseValue = temp[j];
					for (int k = j+1; k < j+2; k++) {
						int compareValue = temp[k];
						int height = Math.abs(baseValue - compareValue);
						
						term = Math.max(term, height);
					}
				}
				
				term = Math.max(term, Math.abs(temp[0] - temp[inputCnt-1]));
				
				bw.write(String.valueOf(term) + "\n");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
