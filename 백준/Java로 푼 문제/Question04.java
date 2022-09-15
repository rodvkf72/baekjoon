import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question04 {
	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String line = br.readLine();
		int iline = Integer.parseInt(line);
		String[] values = br.readLine().split(" ");
		
		int[] arrx = new int[] {-1, 1, 0, 0};
		int[] arry = new int[] {0, 0, -1, 1};
		String[] type = new String[] {"L", "R", "U", "D"};
		
		int x = 1;
		int y = 1;
		
		for (int i = 0; i < values.length; i++) {
			int j = 0;
			for (String s : type) {
				if (s.equals(values[i])) {
					if ((x + arrx[j] > 0) && (x + arrx[j] < iline)) {
						x = x + arrx[j];
					}
					if ((y + arry[j] > 0) && (y + arry[j] < iline)) {
						y = y + arry[j];
					}
				}
				j++;
			}
		}
		
		System.out.println(y + " " + x);
		
		
		/*
		int x = 1;
		int y = 1;
		
		for (int i = 0; i < values.length; i++) {
			switch(values[i]) {
			case "L":
				if (x > 1) {
					x--;
				}
				break;
			case "R":
				if (x < iline) {
					x++;
				}
				break;
			case "U":
				if (y > 1) {
					y--;
				}
				break;
			case "D":
				if (y < iline) {
					y++;
				}
				break;
			}
		}
		System.out.println(y + " " + x);
		*/
	}
}
