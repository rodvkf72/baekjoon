import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1074 {
	static int cnt = 0;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int N = Integer.parseInt(inputs[0]);
			int row = Integer.parseInt(inputs[1]);
			int col = Integer.parseInt(inputs[2]);
			int size = (int) Math.pow(2, N);
			
			recursion(size, row, col);
			
			bw.write(String.valueOf(cnt));
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
		if (size == 1) {
			return;
		}
		
		if (row < size/2 && col < size/2) {	//1사분면
			recursion(size/2, row, col);
			
		} else if (row < size/2 && col >= size/2) {	//2사분면
			cnt += size * size / 4;
			recursion(size/2, row, col - (size/2));
			
		} else if (row >= size/2 && col < size/2) {	//3사분면
			cnt += size * size / 4 * 2;
			recursion(size/2, row - (size/2), col);
			
		} else {	//4사분면	(row > size / 2 && col > size / 2)
			cnt += size * size / 4 * 3;
			recursion(size / 2, row - (size/2), col - (size/2));
		}
	}
}
