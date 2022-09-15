import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_11723 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			boolean[] arr = new boolean[21];
			
			for (int i = 0; i < cycle; i++) {
				String[] inputs = br.readLine().split(" ");
				
				switch(inputs[0]) {
				case "add":
					arr[Integer.parseInt(inputs[1])] = true;
					break;
				case "remove":
					arr[Integer.parseInt(inputs[1])] = false;
					break;
				case "check":
					if (arr[Integer.parseInt(inputs[1])]) {
						bw.write("1\n");
					} else {
						bw.write("0\n");
					}
					break;
				case "toggle":
					if (arr[Integer.parseInt(inputs[1])]) {
						arr[Integer.parseInt(inputs[1])] = false;
					} else {
						arr[Integer.parseInt(inputs[1])] = true;
					}
					break;
				case "all":
					for (int j = 1; j <= 20; j++) {
						arr[j] = true;
					}
					break;
				case "empty":
					for (int j = 1; j <= 20; j++) {
						arr[j] = false;
					}
					break;
				}
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
	
	static void add() {
		
	}
}
