import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2630 {
	static int[][] arr;
	static int zero = 0;
	static int one = 0;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int size = Integer.parseInt(br.readLine());
			
			arr = new int[size][size];
			
			for (int i = 0; i < size; i++) {
				String[] strValues = br.readLine().split(" ");
				for (int j = 0; j < size; j++) {
					arr[i][j] = Integer.parseInt(strValues[j]);
				}
			}
			
			recursion(0, 0, size);
			
			bw.write(String.valueOf(zero) + "\n");
			bw.write(String.valueOf(one));
			
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void recursion(int row, int col, int size) {
		if (isPossible(row, col, size)) {
			if (arr[row][col] == 0) {
				zero++;
			} else if (arr[row][col] == 1) {
				one++;
			}
			return;
		}
		
		int resize = size / 2;
		
		recursion(row, col, resize);					//좌측 상단
		recursion(row, col + resize, resize);			//우측 상단
		recursion(row + resize, col, resize);			//좌측 하단
		recursion(row + resize, col + resize, resize);	//우측 하단
	}
	
	static boolean isPossible(int row, int col, int size) {
		int value = arr[row][col];
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if(arr[i][j] != value) {
					return false;
				}
			}
		}
		
		return true;
	}
}
