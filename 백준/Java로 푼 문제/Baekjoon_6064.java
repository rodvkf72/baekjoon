import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_6064 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int testCnt = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testCnt; i++) {
				String[] values = br.readLine().split(" ");
				
				int M = Integer.parseInt(values[0]);
				int N = Integer.parseInt(values[1]);
				int x = Integer.parseInt(values[2]);
				int y = Integer.parseInt(values[3]);
				
				int minMN = Math.min(M, N);
				
				boolean loop = true;
				int saveM = M;
				int saveN = N;
				int mod = 1;
				
				while (loop) {
					for (int j = 2; j < minMN; j++) {
						if ((M % j == 0) && (N %j == 0)) {
							saveM /= j;
							saveN /= j;
							mod *= j;
							continue;
						}
					}
					loop = false;
				}
				
				int maxYear = saveM * saveN * mod;
				
				int xx = 0;
				int yy = 0;
				boolean check = false;
				for (int j = 1; j <= maxYear; j++) {
					xx++;
					yy++;
					
					if (xx > M) {
						xx = 1;
					}
					
					if (yy > N) {
						yy = 1;
					}
					
					if ((xx == x) && (yy == y)) {
						bw.write(String.valueOf(j) + "\n");
						check = true;
						break;
					}
				}
				
				if (!check) {
					bw.write("-1\n");
				}
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
