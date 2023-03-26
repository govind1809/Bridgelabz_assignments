package day6Assignment.StringPrograms;

public class CountString {
	public static void main(String[] args) {
		String str = "Bridgelabz is a good Platform ";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count = count + 1;

		}
		System.out.println(count);
	}

}
