import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1780 {
	static int[][] arr;
	static int minus = 0;
	static int zero = 0;
	static int one = 0;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			arr = new int[cycle][cycle];
			for (int i = 0; i < cycle; i++) {
				String[] strValues = br.readLine().split(" ");
				for (int j = 0; j < cycle; j++) {
					arr[i][j] = Integer.parseInt(strValues[j]);
				}
			}
			
			recursion(0, 0, cycle);
			
			bw.write(String.valueOf(minus) + "\n");
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
			if (arr[row][col] == -1) {
				minus++;
			} else if (arr[row][col] == 0) {
				zero++;
			} else if (arr[row][col] == 1) {
				one++;
			}
			return;
		}
		
		int resize = size / 3;
		
		recursion(row, col, resize);							//좌측 상단
		recursion(row, col + resize, resize);					//중앙 상단
		recursion(row, col + resize * 2, resize);				//우측 상단
		recursion(row + resize, col, resize);					//좌측 중단
		recursion(row + resize, col + resize, resize);			//중앙 중단
		recursion(row + resize, col + resize * 2, resize); 		//우측 중단
		recursion(row + resize * 2, col, resize);				//좌측 하단
		recursion(row + resize * 2, col + resize, resize);		//중앙 하단
		recursion(row + resize * 2, col + resize * 2, resize);	//우측 하단
	}
	
	static boolean isPossible(int row, int col, int size) {
		int standard = arr[row][col];
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (standard != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
