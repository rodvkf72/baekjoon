import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Baekjoon_10814 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			ArrayList<VO> alist = new ArrayList<>();
			
			for (int i = 0 ; i < cycle; i++) {
				String[] values = br.readLine().split(" ");
				
				int age = Integer.parseInt(values[0]);
				String name = values[1];
				
				VO vo = new VO(age, name);
				
				alist.add(vo);
			}
			
			Comparator<VO> comp = new Comparator<VO>() {
				@Override
				public int compare(VO vo1, VO vo2) {
					return vo1.getAge() - vo2.getAge();
				}
			};
			
			Collections.sort(alist, comp);
			
			for (int i = 0; i < alist.size(); i++) {
				bw.write(String.valueOf(alist.get(i).getAge() + " " + alist.get(i).getName()) + "\n");
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
		private int age;
		private String name;
		
		public VO(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		public String getName() {
			return name;
		}
	}
}
