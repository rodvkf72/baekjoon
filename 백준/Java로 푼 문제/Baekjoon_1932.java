import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1932 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[cycle+1][cycle+1];
			
			for (int i = 0; i < cycle; i++) {
				String[] strs = br.readLine().split(" ");
				for (int j = 0; j < strs.length; j++) {
					arr[i][j] = Integer.parseInt(strs[j]);
				}
			}
			
			for (int i = cycle-1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					arr[i-1][j] += Math.max(arr[i][j], arr[i][j+1]);
				}
			}
			bw.write(String.valueOf(arr[0][0]));
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
