import java.util.*;
import java.io.*;

public class page312 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] values = br.readLine().split("");
			int[] intValues = new int[values.length];
			
			for (int i = 0; i < values.length; i++) {
				intValues[i] = Integer.parseInt(values[i]);
			}
			
			//+, * 연산은 받는 숫자보다 -1번 들어간다.
			for (int j = 1; j < intValues.length; j++) {
				int plus = intValues[j-1] + intValues[j];
				int multiply = intValues[j-1] * intValues[j];
				//더하기 값이 더 큰 경우
				if (plus > multiply) {
					intValues[j] = plus;
				} else {
					intValues[j] = multiply;
				}
			}
			bw.write(String.valueOf(intValues[intValues.length-1]));
			bw.flush();
			
			br.close();
			in.close();
			bw.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
