import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_17478 {
	static InputStreamReader in = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(in);
	static OutputStreamWriter out = new OutputStreamWriter(System.out);
	static BufferedWriter bw = new BufferedWriter(out);
	
	public static void main(String[] args) {
		try {

			int input = Integer.parseInt(br.readLine());
			
			bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");	
			method(input);
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static String underbar = "";
	
	public static void method(int cnt) {
		String specialChar = underbar;
		String str = underbar + "\"재귀함수가 뭔가요?\"\n";
		
		if (cnt == 0) {
			str += specialChar;
			str += "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
			try {
				bw.write(str);
				bw.write(specialChar + "라고 답변하였지.\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		} else {
			str += specialChar;
			str += "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
			str += specialChar;
			str += "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
			str += specialChar;
			str += "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
			try {
				bw.write(str);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		underbar += "____";
		
		method(cnt - 1);
		
		try {
			bw.write(specialChar + "라고 답변하였지.\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
