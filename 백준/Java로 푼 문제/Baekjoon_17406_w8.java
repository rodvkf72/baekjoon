import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Baekjoon_17406_w8 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			String[] inputs = br.readLine().split(" ");
			int line = Integer.parseInt(inputs[0]);
			int vertical = Integer.parseInt(inputs[1]);
			int cycle = Integer.parseInt(inputs[2]);
			
			int[][] originalArr = new int[line+2][vertical+2];
			
			for (int i = 1; i <= line; i++) {
				String[] strValues = br.readLine().split(" ");
				
				for (int j = 0; j < vertical; j++) {
					originalArr[i][j+1] = Integer.parseInt(strValues[j]);
				}
			}
			
			int min = Integer.MAX_VALUE;
			
			/*
			String[] brus = new String[cycle];
			for (int i = 0; i < cycle; i++) {
				brus[i] = br.readLine();
			}
			*/
			String[] brute = new String[cycle];
			for (int i = 0; i < cycle; i++) {
				brute[i] = br.readLine();
			}
			
			boolean visited[] = new boolean[brute.length];
			for (int i = 0; i < brute.length; i++) {
				if (visited[i] != true) {
					visited[i] = true;
					
				}
			}
			
			for (int i = 0; i < cycle; i++) {
				String[] rcs = br.readLine().split(" ");
				//3 4 2, 4 2 1
				int r = Integer.parseInt(rcs[0]);
				int c = Integer.parseInt(rcs[1]);
				int s = Integer.parseInt(rcs[2]);
				
				int[][] rotateArr = rotate(r, c, s, originalArr);
				for (int j = 1; j <= line; j++) {
					int sum = 0;
					for (int k = 1; k <= vertical; k++) {
						sum += rotateArr[j][k];
					}
					min = Math.min(min, sum);
				}
				originalArr = rotateArr;
			}
			
			bw.write(String.valueOf(min));
			bw.flush();
			
			bw.close();
			out.close();
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static int[][] rotate(int r, int c, int s, int[][] arr) {
		int rms = r - s;	//1
		int cms = c - s;	//2
		
		int rps = r + s;	//5
		int cps = c + s;	//6
		
		while(cps - cms > 0 && rps - rms > 0) {
			int saveLeftTop = arr[rms][cms];
			int saveRightTop = arr[rms][cps];
			int saveLeftBottom = arr[rps][cms];
			int saveRightBottom = arr[rps][cps];
			
			for (int i = cps; i > cms; i--) {	//오른쪽으로 밀기
				arr[rms][i] = arr[rms][i-1];
			}
			
			for (int i = rps; i > rms; i--) {	//아래쪽으로 밀기
				arr[i][cps] = arr[i-1][cps];
			}
			
			for (int i = cms; i < cps; i++) {	//왼쪽으로 밀기
				arr[rps][i] = arr[rps][i+1];
			}
			
			for (int i = rms; i < rps; i++) {	//위쪽으로 밀기
				arr[i][cms] = arr[i+1][cms];
			}
			arr[rms+1][cps] = saveRightTop;
			arr[rps][cps-1] = saveRightBottom;
			arr[rps-1][cms] = saveLeftBottom;
			arr[rms][cms+1] = saveLeftTop;
			
			rms++;
			cms++;
			rps--;
			cps--;
		}
		
		return arr;
	}
	
	static void permuation(boolean[] visited, LinkedList<Integer> perm, int cycle) {
		if (perm.size() == cycle) {
			
		}
	}
}
