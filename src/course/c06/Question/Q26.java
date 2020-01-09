package course.c06.Question;

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Q26 {

	public static void main(String[] args) {
		Employee p1 = new Employee(99, "Duke");
		Employee p2 = new Employee(99, "Duke");
		Employee p3 = p1;
		boolean ans1 = (p1 == p2);
		boolean ans2 = p1.name.equals(p2.name);
		System.out.println(ans1 + ":" + ans2);
	}

}
