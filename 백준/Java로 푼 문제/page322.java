import java.util.*;
import java.io.*;

public class page322 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] values = br.readLine().split("");
			
			String alphaStr = "";
			String numStr = "";
			for (int i = 0; i < values.length; i++) {
				if (values[i].matches("[0-9]")) {
					numStr += values[i];
				} else {
					alphaStr += values[i];
				}
			}
			
			String[] alphaArr = alphaStr.split("");
			String[] numArr = numStr.split("");
			
			Arrays.sort(alphaArr);
			
			String sumStr = "";
			for (int j = 0; j < alphaArr.length; j++) {
				sumStr += alphaArr[j];
			}
			
			int sum = 0;
			for (int k = 0; k < numArr.length; k++) {
				sum += Integer.parseInt(numArr[k]);
			}
			bw.write(sumStr + Integer.toString(sum));
			
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
