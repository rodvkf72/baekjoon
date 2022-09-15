import java.io.*;
import java.util.*;

public class page182 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			String[] valueA = br.readLine().split(" ");
			String[] valueB = br.readLine().split(" ");
			
			int[] arrA = new int[Integer.parseInt(inputs[0])];
			int[] arrB = new int[Integer.parseInt(inputs[0])];
			
			int index = 0;
			for (String value : valueA) {
				arrA[index] = Integer.parseInt(value);
				index++;
			}
			index = 0;
			for (String value : valueB) {
				arrB[index] = Integer.parseInt(value);
				index++;
			}
			
			Arrays.sort(arrA);
			Arrays.sort(arrB);
			
			for (int i = 0; i < Integer.parseInt(inputs[1]); i++) {
				arrA[i] = arrB[Integer.parseInt(inputs[0])-1-i];
			}
			
			int result = 0;
			for (int i : arrA) {
				result = result + i;
			}
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
