import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Baekjoon_18870 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			br.readLine();
			
			String[] strValues = br.readLine().split(" ");
			int[] intValues = new int[strValues.length];
			int[] sortValues = new int[strValues.length];
			
			HashMap<Integer, Integer> map = new HashMap<>();
			
			for (int i = 0; i < intValues.length; i++) {
				sortValues[i] = Integer.parseInt(strValues[i]);
				intValues[i] = Integer.parseInt(strValues[i]);
			}
			Arrays.sort(sortValues);
			
			int cnt = 0;
			for (int i = 0; i < sortValues.length; i++) {
				if (!map.containsKey(sortValues[i])) {
					map.put(sortValues[i], cnt);
					cnt++;
				}
			}
			
			for (int i = 0; i < sortValues.length; i++) {
				bw.write(String.valueOf(map.get(intValues[i]) + " "));
			}
			
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
