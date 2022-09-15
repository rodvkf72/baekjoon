import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question02 {
	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] xy = br.readLine().split(" ");
		
		int[][] arr = new int[Integer.parseInt(xy[0])][Integer.parseInt(xy[1])]; 
		
		for (int i = 0; i < Integer.parseInt(xy[0]); i++) {
			String[] line = br.readLine().split(" ");
			for (int j = 0; j < line.length; j++) {
				arr[i][j] = Integer.parseInt(line[j]);
			}
			Arrays.sort(arr[i]);
		}
		
		int result = 0;
		for (int i = 0; i < Integer.parseInt(xy[0]); i++) {
			result = arr[i][0];
			if (result < arr[i][0]) {
				result = arr[i][0];
			}
		}
		
		System.out.println(result);
	}
}
