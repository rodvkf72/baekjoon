import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2563 {
	
	static boolean[][] size = new boolean[100][100];
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < cnt; i++) {
				String[] inputs = br.readLine().split(" ");
				int width = Integer.parseInt(inputs[0]);
				int height = Integer.parseInt(inputs[1]);
				
				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						if (width + j < 100 && height + k < 100) {
							size[width + j][height + k] = true;
						}
					}
				}
			}
			
			int result = 0;
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if (size[i][j]) {
						result++;
					}
				}
			}
			
			bw.write(String.valueOf(result));
			bw.flush();
			
			bw.close();
			br.close();
			in.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
