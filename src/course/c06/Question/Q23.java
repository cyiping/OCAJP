package course.c06.Question;

public class Q23 {

	public static String maskId(String id) {
		String x = "OOOO-OOOO-OOOO-";
		StringBuilder sb = new StringBuilder(x);
		// B.
		return x + id.substring(15, 19);
		// C.
		//sb.append(id, 15, 19);
		//return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(maskId("1234-5678-9012-3456"));
	}
}
