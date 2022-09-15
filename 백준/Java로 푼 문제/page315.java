import java.util.*;
import java.io.*;

public class page315 {
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] cycles = br.readLine().split(" ");
			int cycle = Integer.parseInt(cycles[0]);
			int maximum = Integer.parseInt(cycles[1]);
			
			String[] values = br.readLine().split(" ");
			int[] intValues = new int[values.length];
			
			for (int i = 0; i < values.length; i++) {
				intValues[i] = Integer.parseInt(values[i]);
			}
			
			int cnt = 0;
			for (int j = 0; j < values.length; j++) {
				for (int k = j+1; k < values.length; k++) {
					if (intValues[j] != intValues[k]) {
						cnt++;
					}
				}
			}
			
			bw.write(String.valueOf(cnt));
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
