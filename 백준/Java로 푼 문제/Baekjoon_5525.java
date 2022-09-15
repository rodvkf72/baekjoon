import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_5525 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int strCycle = Integer.parseInt(br.readLine());
			br.readLine();
			String strValue = br.readLine();
			//String[] strValues = br.readLine().split("");
			
			String str = "";
			
			for (int i = 0; i < strCycle; i++) {
				str += "IO";
			}
			str += "I";
			
			int cnt = 0;
			for (int i = 0; i < strValue.length(); i++) {
				String value = "";
				if (i + str.length() > strValue.length()) {
					value = strValue.substring(i, strValue.length());
				} else {
					value = strValue.substring(i, i + str.length());
				}
				
				if (value.equals(str)) {
					cnt++;
				}
			}
			bw.write(String.valueOf(cnt));
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
