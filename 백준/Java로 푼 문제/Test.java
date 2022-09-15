import java.lang.reflect.Field;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		VO vo1 = new VO();
		VO vo2 = new VO();
		
		vo2.setTest1("test1");
		vo2.setTest2("test2");
		
		Field[] fields = vo1.getClass().getDeclaredFields();
		try {
			String str = String.valueOf(fields[0].get(vo2));
			System.out.println(str);
			VO vo3 = (VO) fields[0].get(vo2);
			//System.out.println(vo2.getClass().getTypeName().equals(vo3.getClass().getTypeName()));
			System.out.println(fields[0].getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(vo1.getClass().getTypeName().equals(vo2.getClass().getTypeName()));
	}
	static class VO {
		private String test1;
		private String test2;
		
		public String getTest1() {
			return test1;
		}
		public void setTest1(String test1) {
			this.test1 = test1;
		}
		public String getTest2() {
			return test2;
		}
		public void setTest2(String test2) {
			this.test2 = test2;
		}
		
		
	}
}
