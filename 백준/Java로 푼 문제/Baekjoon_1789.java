import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1789 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			long input = Long.parseLong(br.readLine());
			
			long sum = 0;
			int answer = 0;
			for (int i = 1; i <= input; i++) {
				if (input < sum) {
					break;
				} else {
					sum += i;
					answer++;
				}
			}
			
			if (answer == 1) {
				bw.write("1");
			} else {
				bw.write(String.valueOf(answer-1));
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
