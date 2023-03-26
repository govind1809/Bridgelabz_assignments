package day6Assignment.arrayPrograms;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 4, 3, 6, 1, 7,6 };
		System.out.println("Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					
				System.out.print(arr[j]);
			}

		}

	}
}
