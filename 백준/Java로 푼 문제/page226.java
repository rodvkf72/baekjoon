import java.util.*;
import java.io.*;

public class page226 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int[] DP = new int[10001];
			DP[0] = 0;
			
			for (int i = 1; i <= 10000; i++) {
				DP[i] = 10001;
			}
			
			String[] values = br.readLine().split(" ");
			int cycle = Integer.parseInt(values[0]);
			int num = Integer.parseInt(values[1]);
			
			int[] arr = new int[cycle];
			
			for (int i = 0; i < cycle; i++) {
				int value = Integer.parseInt(br.readLine());
				arr[i] = value;
			}
			
			for (int i = 0; i < cycle; i++) {
				for (int j = arr[i]; j <= num; j++) {
					DP[j] = Math.min(DP[j], DP[j - arr[i]] + 1);
				}
			}
			
			if (DP[num] != 10001) {
				bw.write(String.valueOf(DP[num]));
			} else {
				bw.write("-1");
			}
			
			bw.close();
			out.close();
			br.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
