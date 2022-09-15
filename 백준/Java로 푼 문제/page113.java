import java.io.*;

public class page113 {
	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		String sinput = br.readLine();
		int iinput = Integer.parseInt(sinput);
		
		int count = 0;
		for (int i = 0; i <= iinput; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					String num = Integer.toString(i) + Integer.toString(j) + Integer.toString(k);
					
					if (num.contains("3")) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
