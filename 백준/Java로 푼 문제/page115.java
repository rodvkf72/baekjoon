import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class page115 {

	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String[] line = br.readLine().split("");
		
		int[] arrx = new int[] {2, 2, 1, -1, -2, -2, 1, -1};
		int[] arry = new int[] {1, -1, 2, 2, 1, -1, -2, -2};
		
		int x, y;
		
		byte[] bytes = line[0].getBytes(StandardCharsets.US_ASCII);
		x = bytes[0] - 96;	//97 = a
		y = Integer.parseInt(line[1]);
		
		int count = 0;
		for (int i = 0; i < arrx.length; i++) {
			if ((x + arrx[i] > 0) && (y + arry[i] > 0)) {
				count++;
			}
		}
		System.out.println(count);
	}

}