import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class Baekjoon_1822 {
	public static void main(String[] args) {
		try (InputStreamReader in = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(in);
				OutputStreamWriter out = new OutputStreamWriter(System.out);
				BufferedWriter bw = new BufferedWriter(out);) {
			String[] set = br.readLine().split(" ");
			
			TreeSet<Integer> setA = new TreeSet<Integer>();
			
			String[] inputA = br.readLine().split(" ");
			String[] inputB = br.readLine().split(" ");
			
			for (int i = 0; i < inputA.length; i++) {
				int value = Integer.parseInt(inputA[i]);
				setA.add(value);
			}
			
			for (int i = 0; i < inputB.length; i++) {
				int value = Integer.parseInt(inputB[i]);
				
				if (setA.contains(value)) {
					setA.remove(value);
				}
			}
			
			if (setA.isEmpty()) {
				bw.write("0");
			} else {
				bw.write(String.valueOf(setA.size() + "\n"));
				for (int value : setA) {
					bw.write(String.valueOf(value) + " ");;
				}
			}
			bw.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
