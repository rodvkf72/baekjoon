import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_1654 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int[] values = new int[Integer.parseInt(inputs[0])];
			
			for (int i = 0; i < Integer.parseInt(inputs[0]); i++ ) {
				values[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(values);
			
			long min = 0;
			long max = values[values.length-1];
			
			long half = 0;
			while (min < max) {
				long cnt = 0;
				half = (min + max) / 2;
				
				for (int i = 0; i < values.length; i++) {
					cnt = cnt + (values[i] / half);
				}
				
				if (cnt < Integer.parseInt(inputs[1])) {
					max = half;
				} else {
					min = half + 1;
				}
			}
			
			bw.write(String.valueOf(min-1));
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
