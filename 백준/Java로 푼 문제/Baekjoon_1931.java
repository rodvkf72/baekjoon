import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Baekjoon_1931 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			ArrayList<VO> list = new ArrayList<>();
			
			for (int i = 0; i < cycle; i++) {
				String[] values = br.readLine().split(" ");
				int s = Integer.parseInt(values[0]);
				int e = Integer.parseInt(values[1]);
				VO vo = new VO(s, e);
				
				list.add(vo);
			}
			
			Comparator<VO> comp = new Comparator<>() {
				@Override
				public int compare(VO vo1, VO vo2) {
					if (vo1.getEnd() == vo2.getEnd()) {
						return vo1.getStart() - vo2.getStart();
					}
					return vo1.getEnd() - vo2.getEnd();
				}
			};
			
			Collections.sort(list, comp);
			
			int prevEnd = 0;
			int cnt = 0;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStart() >= prevEnd) {
					prevEnd = list.get(i).getEnd();
					cnt++;
				}
			}
			bw.write(String.valueOf(cnt));
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
		private int start;
		private int end;
		
		public VO (int start, int end) {
			this.start = start;
			this.end = end;
		}
		public void setStart(int start) {
			this.start = start;
		}
		public void setEnd(int end) {
			this.end = end;
		}
		
		public int getStart() {
			return this.start;
		}
		public int getEnd() {
			return this.end;
		}
	}
}
