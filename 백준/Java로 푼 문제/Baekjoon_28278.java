import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_28278 {
	static int cursor = 0;
	static int[] arr;
	
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			arr = new int[cnt];
			
			for (int i = 0; i < cnt; i++) {
				String[] values = br.readLine().split(" ");
				
				switch(values[0]) {
				case "1":
					push(Integer.parseInt(values[1]));
					break;
				case "2":
					bw.write(String.valueOf(pop()));
					bw.write("\n");
					break;
				case "3":
					bw.write(String.valueOf(len()));
					bw.write("\n");
					break;
				case "4":
					bw.write(String.valueOf(isEmpty()));
					bw.write("\n");
					break;
				case "5":
					bw.write(String.valueOf(top()));
					bw.write("\n");
					break;
				}
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void push(int value) {
		arr[cursor] = value;
		cursor++;
	}
	
	public static int pop() {
		if (cursor <= 0) {
			return -1;
		} else {
			cursor--;
		}
		
		int value = arr[cursor];
		arr[cursor] = 0;
		return value;
	}
	
	public static int len() {
		return cursor;
	}
	
	public static int isEmpty() {
		if (cursor <= 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int top() {
		if (cursor <= 0) {
			return -1;
		} else {
			return arr[cursor-1];
		}
	}
}
