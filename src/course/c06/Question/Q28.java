package course.c06.Question;

public class Q28 {

	public static void main(String[] args) {
		String s1 = "P ";
		s1 = s1.concat("Q ");
		String s2 = "R ";
		s1 = s1.concat(s2);
		// s1 = s1.replace("R", "S");
		s1.replace("R", "S");
		s1 = s1.concat(s2);
		System.out.println(s1);
	}

}
