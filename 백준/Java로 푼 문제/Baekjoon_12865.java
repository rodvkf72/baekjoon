import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Baekjoon_12865 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int cycle = Integer.parseInt(inputs[0]);
			int maximum = Integer.parseInt(inputs[1]);
			
			Map<Integer, Integer> map = new HashMap<>();	// 무게, 값
			for (int i = 0; i < cycle; i++) {
				String[] values = br.readLine().split(" ");
				map.put(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
			}
			
			List<Integer> keyList = new ArrayList<>(map.keySet());
			keyList.sort((s1, s2) -> s1.compareTo(s2));
			
			List<VO> list = new ArrayList<>();
			for (int key : keyList) {
				VO vo = new VO(key, map.get(key));
				list.add(vo);
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
	
	static class VO {
		int weight;
		int price;
		
		public VO(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}
		
		void setWeight(int weight) {
			this.weight = weight;
		}
		
		void setPrice(int price) {
			this.price = price;
		}
		
		int getWeight() {
			return weight;
		}
		
		int getPrice() {
			return price;
		}
	}
}
