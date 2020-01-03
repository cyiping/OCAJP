package course.c06.Question;

public class Q14 {

	public static void main(String[] args) {
		int intArr[];
		intArr = new int[2];
		intArr[0] = 100;
		intArr[1] = 200;
		
		intArr = new int[4];
		intArr[2] = 300;
		intArr[3] = 400;
		for (int x : intArr) {
			System.out.print(" " + x);
		}
	}

}
