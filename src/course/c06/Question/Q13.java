package course.c06.Question;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test s1 = new Test();
		Test s2 = new Test();
		Test s3 = new Test();
		s1 = s3;
		s3 = s2;
		s2 = null;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
