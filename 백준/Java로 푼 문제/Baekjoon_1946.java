import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon_1946 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			for (int a = 0; a < cycle; a++) {
				int peopleCnt = Integer.parseInt(br.readLine());
				
				int[][] arr = new int[peopleCnt][2];
				
				for (int i = 0; i < peopleCnt; i++) {
					String[] values = br.readLine().split(" ");
					for (int j = 0; j < values.length; j++) {
						arr[i][0] = Integer.parseInt(values[0]);
						arr[i][1] = Integer.parseInt(values[1]);
					}
				}
				
				Arrays.sort(arr, new Comparator<>() {
	
					@Override
					public int compare(int[] o1, int[] o2) {
						// TODO Auto-generated method stub
						return Integer.compare(o1[0], o2[0]);
					}
				});
				
				int passCnt = 1;
				int standard = arr[0][1];	//면접 순위
				
				for (int i = 1; i < peopleCnt; i++) {
					int interviewScore = arr[i][1];
					if (interviewScore < standard) {
						passCnt++;
						standard = interviewScore;
					}
				}
				bw.write(String.valueOf(passCnt) + "\n");
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
