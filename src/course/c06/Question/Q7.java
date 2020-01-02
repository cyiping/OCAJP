package course.c06.Question;

public class Q7 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		String s = "HelloJim";
		sb.append("Hello").append("Jim");
		
		
		if (s == sb.toString()) {
			System.out.println("They match. ");

		}
		if (s.equals(sb.toString())) {
			System.out.print("They really match. ");
		}
	}

}
