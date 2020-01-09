package course.c06.Question;

public class Q24 {

	public static void main(String[] args) {
		String s1 = "Jim";
		String s2 = new String("jim");
		//
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Yes");
		} else {
			System.out.println("NO");
		}

	}

}
