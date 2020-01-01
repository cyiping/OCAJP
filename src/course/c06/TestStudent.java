package course.c06;

class Student {
	public String name = "";
	public int age = 0;
	public String major = "undermined";
	public boolean fulltime = true;

	public boolean isFulltime() {
		return fulltime;
	}

	public void display() {
		System.out.println("Name: " + name + "Major: " + major);
	}
}

public class TestStudent {

	public static void main(String[] args) {

		Student tom = new Student();
		Student jim = new Student();
		tom.name = "Tom";
		tom.age = 25;
		jim = tom;
		jim.name = "Jim";
		System.out.println("Tom's name: " + tom.name);

	}

}
