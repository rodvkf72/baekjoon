import java.util.*;
import java.io.*;

public class Baekjoon_1300 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int N = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			
			long result = binary(1, k, N, k);
			
			bw.write(String.valueOf(result));
			bw.flush();
			bw.close();
			out.close();
			br.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static long binary(long left, long right, int size, int k) {
		
		while(left < right) {
			long count = 0;
			long mid = (left + right) / 2;
			
			for (int i = 1; i <= size; i++) {
				count = count + Math.min(mid / i, size);
			}
			
			if (k <= count) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}
}
