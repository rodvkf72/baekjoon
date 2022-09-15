import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2559 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int day = Integer.parseInt(inputs[0]);
			int connectDay = Integer.parseInt(inputs[1]);
			
			String[] values = br.readLine().split(" ");
			int[] intValues = new int[values.length];
			
			int sum = Integer.MIN_VALUE;	//이거 안써서 4번 틀림..
			for (int i = 0; i < day; i++) {
				intValues[i] = Integer.parseInt(values[i]);
			}
			
			for (int i = 0; i < day - connectDay + 1; i++) {
				int temp = 0;
				
				for (int j = i; j < i + connectDay; j++) {
					temp += intValues[j];
				}
				sum = Math.max(sum, temp);
			}
			bw.write(String.valueOf(sum) + "\n");
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
