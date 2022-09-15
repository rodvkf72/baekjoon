import java.util.*;
import java.io.*;

public class page339 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int[] load = new int[300001];
			String[] values = br.readLine().split(" ");
			int node = Integer.parseInt(values[0]);
			int lineCnt = Integer.parseInt(values[1]);
			int cost = Integer.parseInt(values[2]);
			int start = Integer.parseInt(values[3]);
			
			LinkedList<ArrayList<Integer>> linkedList = new LinkedList<ArrayList<Integer>>();
			
			for (int i = 0; i <= node; i++) {
				linkedList.add(new ArrayList<Integer>());
				load[i] = -1;
			}
			
			load[start] = 0;
			
			for (int j = 0; j < lineCnt; j++) {
				String[] lineValues = br.readLine().split(" ");
				int a = Integer.parseInt(lineValues[0]);
				int b = Integer.parseInt(lineValues[1]);
				
				linkedList.get(a).add(b);
			}
			
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.offer(start);
			
			while(!queue.isEmpty()) {
				int s = queue.poll();
				
				for (int k = 0; k < linkedList.get(s).size(); k++) {
					int n = linkedList.get(s).get(k);
					
					if(load[n] == -1) {
						load[n] = load[s] + 1;
						queue.offer(n);
					}
				}
			}
			
			boolean flag = false;
			
			for (int l = 0; l <= node; l++) {
				if (load[l] == cost) {
					bw.write(String.valueOf(l));
					flag = true;
				}
			}
			if(!flag) {
				bw.write("-1");
			}
			bw.flush();
			br.close();
			in.close();
			bw.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
