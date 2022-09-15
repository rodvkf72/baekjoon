import java.util.*;
import java.io.*;

public class page311 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			String[] values = br.readLine().split(" ");
			//int[] values = Integer.parseInt(br.readLine().split(" "));
			int[] intValues = new int[values.length];
			for (int i = 0; i < cycle; i++) {
				intValues[i] = Integer.parseInt(values[i]);
			}
			Arrays.sort(intValues);
			boolean[] used = new boolean[intValues.length];
			
			int sum = 0;
			int answer = 0;
			for (int j = 0; j < cycle; j++) {
				sum = sum + intValues[j];
				if (sum >= 5) {
					answer++;
					sum = 0;
				}
			}
			bw.write(String.valueOf(answer));
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
