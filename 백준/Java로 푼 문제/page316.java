import java.util.*;
import java.io.*;

public class page316 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int[] input1 = {1, 1, 7};
			int k = 5;
			
			int i = 0;
			while(true) {
				int div = i / input1.length;
				
				if (input1[div] != 0) {
					input1[div]--;
					k--;
				}
				if (k == 0) {
					break;
				}
				i++;
			}
			System.out.println(i);
			
			bw.write(String.valueOf(i%3+1));
			bw.flush();
			
			bw.close();
			br.close();
			in.close();
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
