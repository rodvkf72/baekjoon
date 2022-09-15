import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Baekjoon_1181 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			int cycle = Integer.parseInt(br.readLine());
			
			HashSet<String> hash = new HashSet<>();
			for (int i = 0; i < cycle; i++) {
				hash.add(br.readLine());
			}
			
			ArrayList<String> list = new ArrayList<>();
			
			Iterator iter = hash.iterator();
			
			while (iter.hasNext()) {
				list.add((String) iter.next());
			}
			
			Collections.sort(list);
			
			String[] arr = new String[list.size()];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = list.get(i);
			}
			
			Arrays.sort(arr, new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					return s1.length() - s2.length();
				}
			});
			
			for (int i = 0; i < arr.length; i++) {
				bw.write(arr[i] + "\n");
			}
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
