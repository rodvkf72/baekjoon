import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_25206 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		try {
			double allTime = 0.0;
			double sumGrade = 0.0;
			for (int i = 0; i < 20; i++) {
				String[] inputs = br.readLine().split(" ");
				
				if (!inputs[2].equals("P")) {
					allTime += Double.parseDouble(inputs[1]);
					sumGrade += grade(Double.parseDouble(inputs[1]), inputs[2]);
				}
			}
			
			bw.write(String.format("%.6f", sumGrade / allTime));
			
			bw.flush();
			
			bw.close();
			br.close();
			in.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static final double grade(double time, String grd) {
		final double AP = 4.5;
		final double AZ = 4.0;
		final double BP = 3.5;
		final double BZ = 3.0;
		final double CP = 2.5;
		final double CZ = 2.0;
		final double DP = 1.5;
		final double DZ = 1.0;
		final double F = 0.0;
		
		double result = 0.0;
		switch (grd) {
		case "A+":
			result = AP;
			break;
		case "A0":
			result = AZ;
			break;
		case "B+":
			result = BP;
			break;
		case "B0":
			result = BZ;
			break;
		case "C+":
			result = CP;
			break;
		case "C0":
			result = CZ;
			break;
		case "D+":
			result = DP;
			break;
		case "D0":
			result = DZ;
			break;
		case "F":
			result = F;
			break;
		default:
			result = 0.0;
		}
		return result * time;
	}
}
