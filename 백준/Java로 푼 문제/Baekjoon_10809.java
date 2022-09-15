import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_10809 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] values = br.readLine().split("");
			
			int[] arr = new int[26];
			
			for (int i = 0; i < 26; i++) {
				arr[i] = -1;
			}
			
			for (int i = 0; i < values.length; i++) {
				char ch = values[i].charAt(0);
				
				if (arr[ch - 'a'] == -1) {
					arr[ch - 'a'] = i;
				}
			}
			
			for (int i = 0; i < 26; i++) {
				bw.write(String.valueOf(arr[i]) + " ");
			}
			
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
