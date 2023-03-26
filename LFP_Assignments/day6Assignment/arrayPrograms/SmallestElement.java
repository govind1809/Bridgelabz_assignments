package day6Assignment.arrayPrograms;

public class SmallestElement {
	public static void main(String[] args) {
		int arr[] = { 120, 26, 70, 80, 100, 200 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(min);

	}
}
