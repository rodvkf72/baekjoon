import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_25239 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(":");
			
			int hour = Integer.parseInt(inputs[0]);
			int min = Integer.parseInt(inputs[1]);
			
			//0 ~ 2, 2 ~ 4, 4 ~ 6, 6 ~ 8, 8 ~ 10, 10 ~ 12
			
			String[] values = br.readLine().split(" ");
			
			int cycle = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < cycle; i++) {
				String[] str = br.readLine().split(" ");
				
				String[] checks = str[0].split("\\.");
				
				if (Integer.parseInt(checks[0]) >= 60) {
					break;
				}
				
				if (str[1].contains("MIN")) {
					String[] m = str[1].split("MIN");
					if (min + Integer.parseInt(m[0]) >= 60) {
						hour++;
						min = min + Integer.parseInt(m[0]) - 60;
					}
				}
				
				if (str[1].contains("HOUR")) {
					String[] h = str[1].split("HOUR");
					hour += Integer.parseInt(h[0]);
				}
				
				if (hour >= 12) {
					hour = hour - 12;
				}
				
				if (str[1].equals("^")) {
					if (hour >= 0 && hour <= 1) {
						values[0] = "0";
					} else if (hour >= 2 && hour <= 3) {
						values[1] = "0";
					} else if (hour >= 4 && hour <= 5) {
						values[2] = "0";
					} else if (hour >= 6 && hour <= 7) {
						values[3] = "0";
					} else if (hour >= 8 && hour <= 9) {
						values[4] = "0";
					} else if (hour >= 10 && hour <= 11) {
						values[5] = "0";
					} else {
						
					}
				}
			}
			
			int result = 0;
			
			for (int i = 0; i < values.length; i++) {
				result += Integer.parseInt(values[i]);
			}
			if (result >= 100) {
				bw.write("100");
			} else {
				bw.write(String.valueOf(result));
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
