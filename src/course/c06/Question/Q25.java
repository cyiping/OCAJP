package course.c06.Question;

public class Q25 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(0);
		String s = "";
		if (sb.equals(s)) {
			System.out.println("Case 1");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("Case 2");
		} else {
			System.out.println("Case 3");
		}
	}
}
