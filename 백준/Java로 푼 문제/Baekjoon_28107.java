import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Baekjoon_28107 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			
			int peopleCnt = Integer.parseInt(inputs[0]);
			int sushiCnt = Integer.parseInt(inputs[1]);
			
			PriorityQueue<VO> queue = new PriorityQueue<>();
			int[] arr = new int[peopleCnt + 1];
			
			for (int i = 0; i < peopleCnt; i++) {
				String[] strValues = br.readLine().split(" ");
				int eatCnt = Integer.parseInt(strValues[0]);
				
				for (int j = 1; j <= eatCnt; j++) {
					queue.add(new VO(i + 1, Integer.parseInt(strValues[j])));
				}
			}
			
			String[] sushis = br.readLine().split(" ");
			
			for (int i = 0; i < sushis.length; i++) {
				int sushi = Integer.parseInt(sushis[i]);
				
				for (int j = 0; j < queue.size(); j++) {
					VO vo = queue.poll();
					int pri = vo.getPri();
					int num = vo.getNum();
					
					if (sushi == num) {
						arr[pri]++;
						break;
					} else {
						queue.add(vo);
					}
				}
			}
			
			for (int i = 0; i < arr.length-1; i++) {
				
				if (i == peopleCnt-1) {
					bw.write(String.valueOf(arr[i + 1]));
				} else {
					bw.write(String.valueOf(arr[i + 1]) + " ");
				}
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			out.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class VO implements Comparable<VO>{
	private int pri;
	private int num;
	
	public VO(int pri, int num) {
		this.pri = pri;
		this.num = num;
	}
	
	public int getPri() {
		return pri;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setPri(int pri) {
		this.pri = pri;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int compareTo(VO o) {
		if (this.pri > o.getPri()) {
			return 1;
		} else if (this.pri < o.getPri()) {
			return -1;
		}
		return 0;
	}
}
