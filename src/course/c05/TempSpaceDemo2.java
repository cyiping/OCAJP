package course.c05;

public class TempSpaceDemo2 {

	public static void main(String[] args) {

		short a, b;
		a = 1;
		b = 2;

		short c;

//		c = a + b; // Type mismatch: cannot convert from int to short

		c = (short) (a + b);
		System.out.println(c);
		int d;
		d = a + b;
		System.out.println(d);
	}

}
