import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question03 {
	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] line = br.readLine().split(" ");
		
		int value = Integer.parseInt(line[0]);
		int div = Integer.parseInt(line[1]);
		int count = 0;
		
		while(true) {
			if (value == 1) {
				break;
			}
			if (value % div != 0) {
				value = one(value);
				count++;
			} else {
				value = two(value, div);
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static int one(int value) {
		value = value - 1;
		return value;
	}
	
	private static int two(int value, int div) {
		value = value / div;
		return value;
	}
}
