package course.c06.Question;

public class Q11 {

	public static void main(String[] args) {
		String s = "HAT";
		s.toLowerCase();
		// s.concat("HAT".toLowerCase());  <-- 錯誤
		s = s.concat("HAT".toLowerCase());  // String 是 immutable
		System.out.println(s.substring(4,6)); // 

		/*
		 	public String substring(int beginIndex, int endIndex)
			beginIndex -- 起始索引（包括）, 索引从 0 开始。
			endIndex -- 结束索引（不包括）。
			
		 * */
	}

}
