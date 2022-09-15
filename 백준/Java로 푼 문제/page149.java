import java.util.*;
import java.io.*;

public class page149 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
	
		try {
			String[] lines = br.readLine().split(" ");
			
			int[][] arrs = new int[Integer.parseInt(lines[0])][Integer.parseInt(lines[1])];
			
			for (int x = 0; x < Integer.parseInt(lines[0]); x++) {
				String[] arr = br.readLine().split("");
				for (int y = 0; y < Integer.parseInt(lines[1]); y++ ) {
					arrs[x][y] = Integer.parseInt(arr[y]);
				}
			}
			int count = 0;
			for (int i = 0; i < Integer.parseInt(lines[0]); i++) {
				for (int j = 0; j < Integer.parseInt(lines[1]); j++) {
					if (dfs(i, j, Integer.parseInt(lines[0]), Integer.parseInt(lines[1]), arrs)) {
						count = count + 1;
					}
				}
			}
			System.out.println(count);
		}
		catch(Exception e) {
			
		}
	}
	
	public static boolean dfs(int x, int y, int rangex, int rangey, int[][] arrs) {
		if ((x <= -1) || (x > rangex-1) || (y <= -1) || (y > rangey-1)) {
			return false;
		} else {
			if (arrs[x][y] == 0) {
				arrs[x][y] = 1;
				dfs(x, y-1, rangex, rangey, arrs);
				dfs(x, y+1, rangex, rangey, arrs);
				dfs(x-1, y, rangex, rangey, arrs);
				dfs(x+1, y, rangex, rangey, arrs);
				return true;
			}
			return false;
		}
	}
}
