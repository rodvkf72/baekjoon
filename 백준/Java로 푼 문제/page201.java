import java.util.*;
import java.io.*;

public class page201 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] s_cycle = br.readLine().split(" ");
			String[] s_values = br.readLine().split(" ");
			int[] i_values = new int[s_values.length];
			
			for (int i = 0; i < s_values.length; i++) {
				i_values[i] = Integer.parseInt(s_values[i]);
			}
			Arrays.sort(i_values);
			
			int target = Integer.parseInt(s_cycle[1]);
			int left = 0;
			int right = i_values[i_values.length-1];
			
			int result = 0;
			while(left <= right) {
				int total = 0;
				int mid = (left + right) / 2;
				for (int j = 0; j < s_values.length; j++) {
					if (i_values[j] > mid) {
						total = total + i_values[j] - mid;
					}
				}
				if (total < target) {
					right = mid - 1;
				} else {
					result = mid;
					left = mid + 1;
				}
			}
			bw.write(String.valueOf(result));
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
