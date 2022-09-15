import java.util.*;
import java.io.*;

public class page314 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			String[] values = br.readLine().split(" ");
			int[] intValues = new int[values.length];
			
			for (int i = 0; i < values.length; i++) {
				intValues[i] = Integer.parseInt(values[i]);
			}
			
			Arrays.sort(intValues);
			
			int target = 1;
			
			for (int j = 0; j < values.length; j++) {
				if (target < intValues[j]) {
					break;
				}
				target += intValues[j];
			}
			bw.write(String.valueOf(target));
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
