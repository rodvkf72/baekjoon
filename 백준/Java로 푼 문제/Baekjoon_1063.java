import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1063 {
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int[][] arr = new int[8][8];
			String[] inputs = br.readLine().split(" ");
			
			String king = inputs[0];
			String[] kLocation = king.split("");
			int kCol = atoi(kLocation[0]);
			int kRow = 8 - Integer.parseInt(kLocation[1]);
			
			String stone = inputs[1];
			String[] sLocation = stone.split("");
			int sCol = atoi(sLocation[0]);
			int sRow = 8 - Integer.parseInt(sLocation[1]);
			
			int count = Integer.parseInt(inputs[2]);
			
			for (int i = 0; i < count; i++) {
				String value = br.readLine();
				int[] moveLocation = controll(value);
				int row = moveLocation[0];
				int col = moveLocation[1];

				// 왕을 옮겼을 때 밖으로 나가지 않는 경우
				if (kRow + row >= 0 && kCol + col >= 0
						&& kRow + row < 8 && kCol + col < 8) {
					// 왕을 옮긴 위치에 돌이 있는 경우
					if ((kRow + row == sRow) && kCol + col == sCol) {
						// 돌을 옮겼을 때 밖으로 나가지 않는 경우
						if (sRow + row >= 0 && sCol + col >= 0
								&& sRow + row < 8 && sCol + col < 8) {
							sRow = sRow + row;
							sCol = sCol + col;
							kRow = kRow + row;
							kCol = kCol + col;
						}
					} else {	// 왕을 옮긴 위치에 돌이 없는 경우
						kRow = kRow + row;
						kCol = kCol + col;
					}
				}
				
				king = itoa(kCol) + Integer.toString(8 - kRow);
				stone = itoa(sCol) + Integer.toString(8 - sRow);
			}
			
			bw.write(String.valueOf(king));
			bw.newLine();
			bw.write(String.valueOf(stone));
			
			bw.flush();
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int atoi(String str) {
		switch(str.toUpperCase()) {
		case "A":
			return 0;
		case "B":
			return 1;
		case "C":
			return 2;
		case "D":
			return 3;
		case "E":
			return 4;
		case "F":
			return 5;
		case "G":
			return 6;
		case "H":
			return 7;
		}
		return 0;
	}
	
	public static String itoa(int i) {
		switch(i) {
		case 0:
			return "A";
		case 1:
			return "B";
		case 2:
			return "C";
		case 3:
			return "D";
		case 4:
			return "E";
		case 5:
			return "F";
		case 6:
			return "G";
		case 7:
			return "H";
		}
		return null;
	}
	
	public static int[] controll(String str) {
		switch(str) {
		case "R":
			return new int[] {0, 1};
		case "L":
			return new int[] {0, -1};
		case "B":
			return new int[] {1, 0};
		case "T":
			return new int[] {-1, 0};
		case "RT":
			return new int[] {-1, 1};
		case "LT":
			return new int[] {-1, -1};
		case "RB":
			return new int[] {1, 1};
		case "LB":
			return new int[] {1, -1};
		}
		
		return null;
	}
}
