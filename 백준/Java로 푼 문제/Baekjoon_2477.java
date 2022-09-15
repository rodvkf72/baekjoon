import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2477 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			int max = 0;
			int maxCur = 0;
			int[] intValues = new int[6];
			
			for (int i = 0; i < 6; i++) {
				String[] str = br.readLine().split(" ");
				intValues[i] = Integer.parseInt(str[1]);
				if (intValues[i] > max) {
					max = intValues[i];
					maxCur = i;
				}
			}
			
			int side1Cur = maxCur-1;
			int side2Cur = maxCur+1;
			
			if (side1Cur < 0) {
				side1Cur += 6;
			}
			if (side2Cur > 5) {
				side2Cur -= 6;
			}
			
			int side1 = intValues[side1Cur];
			int side2 = intValues[side2Cur];
			
			int minCur = 0;
			
			if (side1 > side2) {
				minCur = side1Cur-1;
				if (minCur < 0) {
					minCur += 6;
				}
			} else {
				minCur = side2Cur+1;
				if (minCur > 5) {
					minCur -= 6;
				}
			}

			int min = intValues[minCur];
			
			int result = (min * Math.max(side1, side2));
			result += ((max - min) * Math.min(side1, side2));
			
			result *= cnt;
			
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
}
