import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1676 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int inputs = Integer.parseInt(br.readLine());
			
			int answer = 1;
			for (int i = 1; i <= inputs; i++) {
				answer *= i;
				String str = String.valueOf(answer);
				
				int zeronum = 0;
				String snum = "";
				for (int j = str.length(); j > 0; j--) {
					if (str.substring(j-1, j).equals("0")) {
						zeronum++;
						continue;
					} else {
						snum = str.substring(j-1, j);
						break;
					}
				}
				
				for (int j = 0; j < zeronum; j++) {
					snum = snum + "0";
				}
				answer = Integer.parseInt(snum);
			}
			bw.write(String.valueOf(answer) + "\n");
			bw.write(String.valueOf(String.valueOf(answer).length()-1));
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
