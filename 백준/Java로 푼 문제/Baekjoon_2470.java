import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_2470 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			String[] strValues = br.readLine().split(" ");
			int[] intValues = new int[cnt];
			
			
			for (int i = 0; i < cnt; i++) {
				intValues[i] = Integer.parseInt(strValues[i]);
			}
			
			Arrays.sort(intValues);
			
			int leftPoint = 0;
			int rightPoint = cnt - 1;
			int leftSave = 0;
			int rightSave = 0;
			
			int sum = Integer.MAX_VALUE;
			while (leftPoint < rightPoint) {
				int temp = intValues[leftPoint] + intValues[rightPoint];
				
				if (sum > Math.abs(temp)) {
					leftSave = intValues[leftPoint];
					rightSave = intValues[rightPoint];
					sum = Math.abs(temp);
				}
				
				if (temp > 0) {
					rightPoint--;
				} else {
					leftPoint++;
				}
			}
			
			bw.write(String.valueOf(leftSave + " " + rightSave));
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
