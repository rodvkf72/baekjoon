import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1992 {
	static String value = "";
	static int[][] arr;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int size = Integer.parseInt(br.readLine());
			
			arr = new int[size][size];
			
			for (int i = 0; i < size; i++) {
				String[] strValues = br.readLine().split("");
				for (int j = 0; j < size; j++) {
					arr[i][j] = Integer.parseInt(strValues[j]);
				}
			}
			recursion(size, 0, 0);
			
			bw.write(value);
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void recursion(int size, int row, int col) {
		if (isPossible(size, row, col)) {
			value += Integer.toString(arr[row][col]);
			return;
		}
		
		value += "(";
		
		int resize = size / 2;
		
		recursion(resize, row, col);	//1사분면
		recursion(resize, row, col + resize);	//2사분면
		recursion(resize, row + resize, col);	//3사분면
		recursion(resize, row + resize, col + resize);	//4사분면
		
		value += ")";
	}
	
	static boolean isPossible(int size, int row, int col) {
		int value = arr[row][col];
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (value != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
