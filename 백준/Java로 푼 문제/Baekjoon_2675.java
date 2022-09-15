import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2675 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < cycle; i++) {
				String[] inputs = br.readLine().split(" ");
				
				int loop = Integer.parseInt(inputs[0]);
				String[] values = inputs[1].split("");
				
				for (int j = 0; j < values.length; j++) {
					for (int k = 0; k < loop; k++) {
						bw.write(values[j]);
					}
				}
				bw.write("\n");
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
