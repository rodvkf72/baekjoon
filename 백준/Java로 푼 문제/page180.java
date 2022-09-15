import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class page180 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		try {
			String range = br.readLine();
			
			NamenScore[] arr = new NamenScore[Integer.parseInt(range)];
			
			for (int i = 0; i < Integer.parseInt(range); i++) {
				String[] nameNvalue = br.readLine().split(" ");
				
				arr[i] = new NamenScore(nameNvalue[0], Integer.parseInt(nameNvalue[1]));
			}
			
			Arrays.sort(arr, (a, b) -> {
				return Integer.compare(a.getScore(), b.getScore());
			});
			
			//1순위를 점수 순으로 정렬하고 가나다 이름을 2순위로 정렬
			//List<NamenScore> list = new ArrayList<>();
			//list.sort(Comparator.comparing(NamenScore::getScore).thenComparing(NamenScore::getName));
			
			for (NamenScore ns : arr) {
				System.out.printf("%s ", ns.getName());
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static class NamenScore {
		private String name = "";
		private int score;
		
		private NamenScore(String name, int score) {
			this.name = name;
			this.score = score;
		}
		
		private String getName() {
			return this.name;
		}
		
		private int getScore() {
			return this.score;
		}
	}
	
}
