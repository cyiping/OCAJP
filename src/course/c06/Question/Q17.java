package course.c06.Question;

public class Q17 {
	static void changeVal(Integer iObj, int i) {
		iObj = 40;
		i = 40;
	}

	public static void main(String[] args) {
		Integer iObj = new Integer(10);
		int i = 10;
		changeVal(iObj++, i++);
		System.out.println(iObj + ", " + i);
	}

}
