package course.c06.Question;

public class Q18 {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String c) {
		this.content = c;
	}

	public static void main(String[] args) {
		Q18 obj1 = new Q18();
		Q18 obj2 = new Q18();
		obj1.setContent(null);
		obj2.setContent("Java");
		System.out.print(obj1.getContent() + " : " + obj2.getContent());
	}

}
