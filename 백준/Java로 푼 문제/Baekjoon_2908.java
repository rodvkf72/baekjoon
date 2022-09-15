import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_2908 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			
			String[] inputs = br.readLine().split(" ");
			
			String[] strOne = inputs[0].split("");
			String[] strTwo = inputs[1].split("");
			
			String one = "";
			String two = "";
			
			for (int i = inputs[0].length()-1; i >= 0; i--) {
				one += strOne[i];
			}
			for (int i = inputs[1].length()-1; i >= 0; i--) {
				two += strTwo[i];
			}
			
			int resultOne = Integer.parseInt(one);
			int resultTwo = Integer.parseInt(two);
			
			if (resultOne > resultTwo) {
				bw.write(String.valueOf(resultOne));
			} else {
				bw.write(String.valueOf(resultTwo));
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
