import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Baekjoon_11866 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int numbers = Integer.parseInt(inputs[0]);
			int jump = Integer.parseInt(inputs[1]);
			
			ArrayList<Integer> alist = new ArrayList<>();
			
			for (int i = 0; i < numbers; i++) {
				alist.add(i+1);
			}
			
			bw.write("<");
			int temp = jump-1;
			
			while(alist.size() != 0) {
				if (alist.size() == 1) {
					bw.write(String.valueOf(alist.get(temp)));
				} else {
					bw.write(String.valueOf(alist.get(temp)) + ", ");
				}
				alist.remove(temp);
				temp += jump-1;
				while (temp > alist.size()-1 && alist.size() != 0) {
					temp = temp - alist.size();
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
