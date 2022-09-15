import java.util.*;
import java.io.*;

public class Baekjoon_10989 {
	public static void main(String[] args) {
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			OutputStreamWriter out = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(out);
			
			int cycle = Integer.parseInt(br.readLine());
			int[] values = new int[cycle];
			for (int i = 0; i < cycle; i++) {
				values[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(values);
			
			for (int i : values) {
				bw.write(String.valueOf(i) + "\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (Exception e) {
			
		}
	}
}
