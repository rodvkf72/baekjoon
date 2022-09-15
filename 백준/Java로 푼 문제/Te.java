
public class Te {
	public static void main(String[] args) {
		String str = "01049373143";
		String user1 = str.substring(0, 3);
		String user2 = str.substring(3, 7);
		String user3 = str.substring(7, 11);
		
		System.out.println(user1 + "-" + user2 + "-" + user3);
	}
}
