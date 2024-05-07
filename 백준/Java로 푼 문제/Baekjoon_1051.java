import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1051 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] square = br.readLine().split(" ");
			int row = Integer.parseInt(square[0]);
			int col = Integer.parseInt(square[1]);
			int[][] arr = new int[row][col];
			
			int maxSquare = Math.min(row, col);
			
			for (int i = 0; i < row; i++) {
				String[] values = br.readLine().split("");
				for (int j = 0; j < values.length; j++) {
					arr[i][j] = Integer.parseInt(values[j]);
				}
			}
			
			int max = 1;
			for (int i = 0; i < maxSquare; i++) {
				for (int j = 0; j < row; j++) {
					for (int k = 0; k < col; k++) {
						if (i + j < row && i + k < col) {
							int leftUp = arr[j][k];
							int rightUp = arr[j+i][k];
							int rightDown = arr[j+i][k+i];
							int leftDown = arr[j][k+i];
							
							if ((leftUp == rightUp) && (rightUp == rightDown)
									&& (rightDown == leftDown) && (leftDown == leftUp)) {
								max = Math.max(max, (i+1) * (i+1));
							}
						}
					}
				}
			}
			
			bw.write(String.valueOf(max));
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
