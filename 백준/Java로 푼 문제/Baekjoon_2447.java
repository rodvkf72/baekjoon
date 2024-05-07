import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2447 {
	static String[][] arr;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int n = Integer.parseInt(br.readLine());
			arr = new String[n][n];
			
			recursion(0, 0, n, false);
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					bw.write(arr[i][j]);
				}
				
				bw.write("\n");
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void recursion(int w, int h, int n, boolean check) {
		if (check) {
			
			for (int i = w; i < w + n; i++) {
				for (int j = h; j < h + n; j++) {
					arr[i][j] = " ";
				}
			}
			
			return;
		}
		
		if (n == 1) {
			arr[w][h] = "*";
			return;
		}
		
		int divideN = n / 3;
		
		if (divideN == 0) {
			return;
		} else {
			int count = 0;
			
			for (int i = w; i < w + n; i += divideN) {
				for (int j = h; j < h + n; j += divideN) {
					count++;
					
					if (count == 5) {
						recursion(i, j, divideN, true);
					} else {
						recursion(i, j, divideN, false);
					}
				}
			}
		}
	}
}
