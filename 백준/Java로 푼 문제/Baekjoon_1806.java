import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1806 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int cnt = Integer.parseInt(inputs[0]);
			int want = Integer.parseInt(inputs[1]);
			
			String[] strValues = br.readLine().split(" ");
			int[] intValues = new int[cnt + 1];
			
			for (int i = 0; i < cnt; i++) {
				intValues[i] = Integer.parseInt(strValues[i]);
			}
			
			int startPointer = 0;
			int endPointer = 0;
			int len = Integer.MAX_VALUE;
			int sum = 0;
			
			while(startPointer <= cnt && endPointer <= cnt) {
				
				if (want <= sum && len > endPointer - startPointer) {
					len = endPointer - startPointer;
				}
				
				if (want > sum) {
					sum += intValues[endPointer++];
				} else {
					sum -= intValues[startPointer++];
				}
			}
			
			if (len == Integer.MAX_VALUE) {
				bw.write(String.valueOf(0));
			} else {
				bw.write(String.valueOf(len));
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
