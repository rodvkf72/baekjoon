import java.util.*;
import java.io.*;

public class page321 {
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
			
			int left = 0;
			int right = 0;
			//왼쪽값
			for (int j = 0; j < values.length/2; j++) {
				left += intValues[j];
			}
			//오른쪽값
			for (int k = values.length/2; k < values.length; k++) {
				right += intValues[k];
			}
			
			if (left == right) {
				bw.write("LUCKY");
			} else {
				bw.write("READY");
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
