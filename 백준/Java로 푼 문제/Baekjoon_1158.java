import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Baekjoon_1158 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int value = Integer.parseInt(inputs[0]);
			int term = Integer.parseInt(inputs[1]);
			
			ArrayList<Integer> aList = new ArrayList<Integer>();
			
			for (int i = 1; i <= value; i++) {
				aList.add(i);
			}
			
			int idx = term - 1;
			
			bw.write("<");
			while(!aList.isEmpty()) {
				if (aList.size() == 1) {
					bw.write(String.valueOf(aList.get(0)));
				} else {
					bw.write(String.valueOf(aList.get(idx)) + ", ");
				}
				
				aList.remove(idx);
				idx += term - 1;
				
				while (idx > aList.size() - 1 && aList.size() != 0) {
					idx = idx - aList.size();
				}
				
			}
			bw.write(">");
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
