import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class page197 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		try {
			String havepartcount = br.readLine();
			String[] havepart = br.readLine().split(" ");
			int[] arrhavepart = new int[havepart.length];
			
			for (int i = 0; i < Integer.parseInt(havepartcount); i++) {
				arrhavepart[i] = Integer.parseInt(havepart[i]);
			}
			Arrays.sort(arrhavepart);
			
			String wantpartcount = br.readLine();
			String[] wantpart = br.readLine().split(" ");
			
			for (int j = 0; j < Integer.parseInt(wantpartcount); j++) {
				boolean result = binary(arrhavepart, Integer.parseInt(wantpart[j]), 0, Integer.parseInt(wantpartcount));
				
				if (result) {
					System.out.print("yes ");
				} else {
					System.out.print("no ");
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean binary(int[] arr, int target, int start, int end) {
		while(start <= end) {
			int mid = start + end;
			System.out.println(arr[mid]);
			if (arr[mid] == target) {
				return true;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return false;
	}
}
