package day6Assignment.StringPrograms;

public class NequalDivides {
	public static void main(String[] args) {
		String str = "aaaabbbbcccc";
		int n = 3;
		int temp = 0;
		int chars = str.length() / n;
		String[] equalStr = new String[n];
		if (str.length() % n != 0) {
			System.out.println("this STring dont have equal parts " + n);
		}

		else {
			for (int i = 0; i < str.length();i= i+chars) {
				String part = str.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;

			}
			System.out.println(n + "equal parts are");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}

	}

}
