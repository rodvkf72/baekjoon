import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class page178 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		try {
			String range = br.readLine();
			int[] arr = new int[Integer.parseInt(range)];
			
			for (int i = 0; i < Integer.parseInt(range); i++) {
				String value = br.readLine();
				
				arr[i] = Integer.parseInt(value);
			}
			Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
			Arrays.sort(integerArr, Collections.reverseOrder());
			
			for (int i : integerArr) {
				System.out.printf("%d ", i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
