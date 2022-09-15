import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Baekjoon_1764 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			HashSet<String> hash = new HashSet<>();
			ArrayList<String> list = new ArrayList<>();
			for (int i = 0; i < Integer.parseInt(inputs[0]); i++) {
				hash.add(br.readLine());
			}
			
			for (int i = 0; i < Integer.parseInt(inputs[1]); i++) {
				String temp = br.readLine();
				if (hash.contains(temp)) {
					list.add(temp);
				}
			}
			
			Collections.sort(list);
			
			bw.write(list.size() + "\n");
			for (int i = 0; i < list.size(); i++) {
				bw.write(list.get(i) + "\n");
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
