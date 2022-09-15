import java.util.*;
import java.io.*;

public class page313 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] values = br.readLine().split("");
			boolean[] boolValues = new boolean[values.length];
			
			for (int i = 0; i < boolValues.length; i++) {
				if (values[i].equals("0")) {
					boolValues[i] = false;
				} else {
					boolValues[i] = true;
				}
			}
			
			int cnt = 1;
			for (int j = 1; j < boolValues.length; j++) {
				if (boolValues[j-1] != boolValues[j]) {
					cnt++;
				}
			}
			
			boolean[] answer = new boolean[cnt];
			int cnt2 = 0;
			boolean flag = boolValues[0];
			for (int k = 0; k < boolValues.length; k++) {
				if (flag != boolValues[k]) {
					answer[cnt2] = boolValues[k];
					cnt2++;
					flag = boolValues[k];
				}
			}
			int t = 0;
			int f = 0;
			
			for (int l = 0; l < answer.length; l++) {
				if (answer[l]) {
					t++;
				} else {
					f++;
				}
			}
			
			bw.write(String.valueOf(Math.min(t, f)));
			bw.flush();
			
			br.close();
			in.close();
			bw.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
