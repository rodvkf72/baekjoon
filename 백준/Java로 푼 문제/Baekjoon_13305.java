import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Baekjoon_13305 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			Long area = Long.parseLong(br.readLine());
			String[] strDistance = br.readLine().split(" ");
			Long[] distance = new Long[strDistance.length];
			for (int i = 0; i < strDistance.length; i++) {
				distance[i] = Long.parseLong(strDistance[i]);
			}
			
			String[] strPrice = br.readLine().split(" ");
			Long[] price = new Long[strPrice.length];
			for (int i = 0; i < strPrice.length; i++) {
				price[i] = Long.parseLong(strPrice[i]);
			}
			
			Long defComp = price[0];
			Long result = (long) 0;
			for (int i = 0; i < distance.length; i++) {
				if (defComp > price[i]) {
					defComp = price[i];
				}
				result += defComp * distance[i];
			}
			
			bw.write(String.valueOf(result));
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
