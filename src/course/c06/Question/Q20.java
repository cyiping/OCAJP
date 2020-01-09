package course.c06.Question;

public class Q20 {

	public static void main(String[] args) {
		String s = "123";
		if (s.length()>2)
			s.concat("456");
		for (int i=0; i<3; i++)
			s+="z";
		System.out.println(s);

	}

}
