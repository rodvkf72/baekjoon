import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1990 {
	static boolean[] arr = new boolean[100000001];
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] strValues = br.readLine().split(" ");
			int start = Integer.parseInt(strValues[0]);
			int end = Integer.parseInt(strValues[1]);
			
			arr[0] = true;
			arr[1] = true;
			
			for (int i = 2; i * i <= end; i++) {
				if (!arr[i]) {
					for (int j = i * i; j <= end; j += i) {
						arr[j] = true;
					}
				}
			}
			
			for (int i = start; i <= end; i++) {
				if (!arr[i]) {
					boolean isDecimal = true;
					
					/*
					String s = Integer.toString(i);
					String[] split = s.split("");
					
					for (int j = 0; j < split.length/2; j++) {
						if (!split[j].equals(split[split.length - j - 1])) {
							isDecimal = false;
							break;
						}
					}
					
					if (isDecimal) {
						bw.write(String.valueOf(i) + "\n");
					}
					*/
					
					String s = String.valueOf(i);
					
					for (int j = 0; j < s.length() / 2; j++) {
						if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
							isDecimal = false;
							break;
						}
					}
					
					if (isDecimal) {
						bw.write(String.valueOf(i) + "\n");
					}
				}
			}
			
			bw.write(String.valueOf(-1));
			
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
