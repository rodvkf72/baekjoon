import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1107 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] channel = br.readLine().split("");
			int brokenButtonCnt = Integer.parseInt(br.readLine());
			
			if (brokenButtonCnt == 0) {
				String str = "";
				for (int i = 0; i < channel.length; i++) {
					str += channel[i];
				}
				int intChannel = Integer.parseInt(str);
				if (intChannel > 99 && intChannel < 104) {
					bw.write(String.valueOf(intChannel-100));
				} else {
					if (Math.abs(intChannel-100) < channel.length) {
						bw.write(String.valueOf(Math.abs(intChannel-100)));
					} else {
						bw.write(String.valueOf(channel.length));
					}
				}
			} else {
				String[] btn = br.readLine().split(" ");
				int[] brokenButtons = new int[brokenButtonCnt];
				
				//입력받은 채널 변수 지정
				String strChannel = "";
				for (int i = 0; i < channel.length; i++) {
					strChannel += channel[i];
				}
				int intChannel = Integer.parseInt(strChannel);
				
				//고장난 버튼 int형으로 변경
				for (int i = 0; i < brokenButtonCnt; i++) {
					brokenButtons[i] = Integer.parseInt(btn[i]);
				}
				
				//사용 가능한 버튼을 담기 위한 배열
				boolean[] useable = new boolean[1000000];
				
				//숫자 버튼을 입력하여 이동할 수 있는 채널 배열
				//고장난 버튼이 포함되지 않은 경우에만 true 
				for (int i = 0; i < 1000000; i++) {
					String str = Integer.toString(i);
					for (int j = 0; j < brokenButtonCnt; j++) {
						String strJ = Integer.toString(brokenButtons[j]);
						if (!str.contains(strJ)) {
							useable[i] = true;
						} else {
							useable[i] = false;
							break;	//고장난 버튼에 포함되는 숫자가 하나라도 있다면 바로 다음 비교할 수로 넘어감 
						}
					}
				}
				
				//이동 가능한 채널 내에서 최소 범위 체크
				int minCheck = Integer.MAX_VALUE;
				int saveILen = 0;
				for (int i = 0; i < 1000000; i++) {
					if (useable[i]) {
						if (Math.abs(intChannel-i) < minCheck) {
							minCheck = Math.abs(intChannel-i);
							saveILen = Integer.toString(i).length();
						}
					}
				}
				
				//이동하고자 하는 채널이 100인 경우
				if (intChannel == 100) {
					bw.write("0");
				} else {
					//숫자 버튼만으로 채널 이동이 가능한 경우
					if (minCheck == 0) {
						//100번 채널에서 +, - 만을 사용한 값 < 이동하고자 하는 채널의 길이
						if (Math.abs(intChannel - 100) < channel.length) {
							bw.write(String.valueOf(Math.abs(intChannel - 100)));
						} else {
							bw.write(String.valueOf(channel.length));
						}
					} else {
						//숫자 버튼만으로 이동이 불가능 하고 100번 채널에서 +, - 만을 사용한 값 < 숫자 버튼으로 이동 후 +, -를 최소로 쓸 수 있는 값
						if (Math.abs(intChannel - 100) < saveILen + minCheck) {
							bw.write(String.valueOf(Math.abs(intChannel - 100)));
						} else {
							bw.write(String.valueOf(saveILen + minCheck));
						}
					}
				}
			}
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
