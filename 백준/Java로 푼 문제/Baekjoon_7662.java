import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Baekjoon_7662 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int testcaseCnt = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < testcaseCnt; i++) {
				int inputCnt = Integer.parseInt(br.readLine());
				
				TreeMap<Integer, Integer> map = new TreeMap<>();
				for (int j = 0; j < inputCnt; j++) {
					String[] values = br.readLine().split(" ");
					String func = values[0];
					int number = Integer.parseInt(values[1]);
					
					if (func.equals("I")) {
						map.put(number, map.getOrDefault(number, 0) + 1);	//number를 키로 가지는 값이 없으면 (0 + 1), 있으면 (있는 값 + 1) 따라서 초기값은 value로 1이 들어감. 이후부터 동일한 값이 들어오면 2, 3, 4 ... 으로 들어가게 됨
					} else {
						if (!map.isEmpty()) {
							int key = 0;
							
							if (number > 0) {	//최대값 제거
								key = map.lastKey();
							} else {	//최소값 제거
								key = map.firstKey();
							}
							
							// TreeMap은 중복이 안되므로 value로 동일한 key가 몇개 저장되어 있는지 판단. if문 안의 내용이 이해가 안된다면 아래의 주석처리 된 코드와 동일하다고 보면 됨
							if (map.put(key, map.get(key)-1) == 1) {
								map.remove(key);
							}
							
							/*
							map.put(key, map.get(key)-1);
							if (map.get(key) == 0) {	//위의 if 코드는 == 1 이고 여기 if 코드는 == 0 인 이유는 위의 if 문에서 map.put을 한다고 해서 put으로 넣은 값과 바로 비교하는게 아니기 때문이다. 이 코드는 map.put 으로 -1 해준 뒤 map.get(key)로 가져오기 때문에 차이가 난다. 
								map.remove(key);
							}
							*/
						}
					}
				}
				if (map.isEmpty()) {
					bw.write("EMPTY\n");
				} else {
					bw.write(String.valueOf(map.lastKey()) + " " + String.valueOf(map.firstKey()) + "\n");
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
