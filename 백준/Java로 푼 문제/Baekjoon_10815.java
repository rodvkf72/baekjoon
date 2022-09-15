import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Baekjoon_10815 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int defaultsize = Integer.parseInt(br.readLine());
			String[] defValue = br.readLine().split(" ");
			
			int[] defintValue = new int[defaultsize];
			for (int i = 0; i < defaultsize; i++) {
				defintValue[i] = Integer.parseInt(defValue[i]);
			}
			Arrays.sort(defintValue);
			
			int compsize = Integer.parseInt(br.readLine());
			String[] compValue = br.readLine().split(" ");
			
			for (int i = 0; i < compsize; i++) {
				boolean flag = method(defintValue, defaultsize, Integer.parseInt(compValue[i]));
				
				if (i == compsize-1) {
					if (flag) {
						bw.write("1");
					} else {
						bw.write("0");
					}
				} else {
					if (flag) {
						bw.write("1 ");
					} else {
						bw.write("0 ");
					}
				}
			}
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean method(int[] defintValue, int defsize, int num) {
		int leftidx = 0;
		int rightidx = defsize - 1;
		
		while (leftidx <= rightidx) {
			int mididx = (leftidx + rightidx) / 2;
			int mid = defintValue[mididx];
			
			if (num < mid) {
				rightidx = mididx - 1;
			} else if (num > mid) {
				leftidx = mididx + 1;
			} else {
				return true;
			}
		}
		return false;
	}
}
