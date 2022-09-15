import java.io.*;

public class page118_w8 {
	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		int[] compassx = new int[] {0, 1, 0, -1};
		int[] compassy = new int[] {-1, 0, 0, 1};
		
		String[] maps = br.readLine().split(" ");
		int[][] arrs = new int[Integer.parseInt(maps[0])][Integer.parseInt(maps[1])];
		
		String[] character = br.readLine().split(" ");
		
		for (int i = 0; i < Integer.parseInt(maps[0]); i++) {
			String[] location = br.readLine().split(" ");
			
			for (int j = 0; j < maps[1].length(); j++) {
				arrs[i][j] = Integer.parseInt(location[j]);
			}
		}
		
		int count = 0;
		
		while(true) {
			character[2] = Integer.toString(Integer.parseInt(character[2]) + 1);
			int x = Integer.parseInt(character[0]) + compassx[Integer.parseInt(character[2])];
			int y = Integer.parseInt(character[1]) + compassy[Integer.parseInt(character[2])];
			
			if (Integer.parseInt(character[2]) == 0) {
				if (arrs[Integer.parseInt(character[0])][Integer.parseInt(character[1]) + compassy[1]] != 0) {
					character[0] = character[0] + compassx[0];
					character[1] = character[1] + compassy[0];
					count++;
				} else {
					character[2] = Integer.toString(Integer.parseInt(character[2]) + 1);
					if (Integer.parseInt(character[2]) > 3) {
						character[2] = "0";
					}
				}
			}
		}
		
		
	}
}
