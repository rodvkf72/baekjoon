import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon_5430 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int testcaseCnt = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testcaseCnt; i++) {
				String[] functions = br.readLine().split("");
				int arrSize = Integer.parseInt(br.readLine());
				String[] strArr = br.readLine().replace("[", "").replace("]", "").split(",");
				
				Deque<String> deque = new ArrayDeque<>();
				for (int j = 0; j < arrSize; j++) {
					if (!strArr[j].equals("")) {
						deque.add(strArr[j]);
					}
				}
				
				boolean error = false;
				boolean reverse = false;
				for (int j = 0; j < functions.length; j++) {
					if (functions[j].equals("R")) {	//뒤집기
						if (reverse) {
							reverse = false;
						} else {
							reverse = true;
						}
					} else {
						if (deque.size() == 0) {	//크기가 0인데 삭제 요청이 들어온 경우
							error = true;
							break;
						} else {
							if (!reverse) {	//뒤집힌 상황이 아닌 경우
								deque.pollFirst();
							} else {
								deque.pollLast();
							}
						}
					}
				}
				
				if (error) {
					bw.write("error\n");
				} else {
					bw.write("[");
					if (reverse) {	//뒤집힌 상황인 경우
						while(!deque.isEmpty()) {
							if (deque.size() == 1) {	//마지막 숫자 출력의 경우
								bw.write(deque.pollLast());
							} else {
								bw.write(deque.pollLast() + ",");
							}
						}
					} else {
						while(!deque.isEmpty()) {
							if (deque.size() == 1) {	//마지막 숫자 출력의 경우
								bw.write(deque.pollFirst());
							} else {
								bw.write(deque.pollFirst() + ",");
							}
						}
					}
					bw.write("]\n");
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
}
