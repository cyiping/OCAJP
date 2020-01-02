package course.c06.Question;

public class Q8 {

	public static void main(String[] args) {
		String name = "Duke";
		int age = 33;
		
		
		String str ="My friend " + name + " is " + age;
		System.out.println(str);
		System.out.println("origin-------------");
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("My friend ").append(name).append(" is ").append(age);
		System.out.println(sb);
		System.out.println("sb-------------");
		
		
		StringBuilder sb1 = new StringBuilder();
		// insert 是錯誤的
		//sb1.insert("My friend " + name + " is " + age);
		//System.out.println(sb1);
		//System.out.println("sb1-------------");
		
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("My friend ").append( name + " is " + age);
		System.out.println(sb2);
		System.out.println("sb2-------------");
		
		
		StringBuilder sb3 = new StringBuilder();
		// insert 是錯誤的
		//sb3.append("My friend ").insert(name).insert(" is ").insert(age);
		//System.out.println(sb3);
		//System.out.println("sb3-------------");
	}

}
