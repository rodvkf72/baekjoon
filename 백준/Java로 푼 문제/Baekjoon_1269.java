import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;

public class Baekjoon_1269 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			br.readLine();
			
			String[] strA = br.readLine().split(" ");
			String[] strB = br.readLine().split(" ");
			
			HashSet<Integer> A = new HashSet<>();
			HashSet<Integer> B = new HashSet<>();
			
			for (int i = 0; i < strA.length; i++) {
				A.add(Integer.parseInt(strA[i]));
			}
			for (int i = 0; i < strB.length; i++) {
				B.add(Integer.parseInt(strB[i]));
			}
			
			int cnt = 0;
			for (int i : A) {
				if (!B.contains(i)) {
					cnt++;
				}
			}
			for (int i : B) {
				if (!A.contains(i)) {
					cnt++;
				}
			}
			
			bw.write(String.valueOf(cnt));
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
