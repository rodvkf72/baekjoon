import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
			VO[] dp = new VO[cycle];
			
			ArrayList<VO> aList = new ArrayList<>();
			for (int i = 0; i < cycle; i++) {
				String[] values = br.readLine().split(" ");
				int weight = Integer.parseInt(values[0]);
				int price = Integer.parseInt(values[1]);
				
				VO vo = new VO(weight, price);
				aList.add(vo);
			}
			
			Comparator<VO> comp = new Comparator<VO>() {
				@Override
				public int compare(VO vo1, VO vo2) {
					if (vo1.getPrice() == vo2.getPrice()) {
						return vo1.getWeight() - vo2.getWeight();
					}
					return vo2.getPrice() - vo1.getPrice();
				}
			};
			
			Collections.sort(aList, comp);
			
			for (int i = 0; i < dp.length; i++) {
				VO sample = new VO(aList.get(i).getWeight(), aList.get(i).getPrice());
				for (int j = i; j < dp.length; j++) {
					if (sample.getWeight() + aList.get(j).getWeight() <= maximum) {
						sample.setWeight(sample.getWeight() + aList.get(j).getWeight());
						sample.setPrice(sample.getPrice() + aList.get(j).getPrice());
					}
				}
				dp[i] = sample;
			}
			
			int answer = 0;
			for (int i = 0; i < dp.length; i++) {
				if (answer < dp[i].getPrice()) {
					answer = dp[i].getPrice();
				}
			}
			bw.write(String.valueOf(answer));
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
		private int weight;
		private int price;
		
		public VO(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}
		
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getWeight() {
			return this.weight;
		}
		public int getPrice() {
			return this.price;
		}
	}
}
