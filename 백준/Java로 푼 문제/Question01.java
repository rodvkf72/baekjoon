import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Question01 {
	public static void main(String[] args) throws Exception {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		String[] line = br.readLine().split(" ");
		
		String[] values = br.readLine().split(" ");
		
		Arrays.sort(values, Collections.reverseOrder());
		
		int[] results = new int[Integer.parseInt(line[2])];
		
		for (int i = 0; i < Integer.parseInt(line[2]); i++) {
			results[i] = Integer.parseInt(values[i]);
		}
		
		int count = 0;
		int result = 0;
		for (int j = 0; j < Integer.parseInt(line[1]); j++) {
			if (count < Integer.parseInt(line[2])) {
				result = result + results[0];
				count++;
			} else {
				result = result + results[1];
				count = 0;
			}
		}
		System.out.println(result);
	}
}
