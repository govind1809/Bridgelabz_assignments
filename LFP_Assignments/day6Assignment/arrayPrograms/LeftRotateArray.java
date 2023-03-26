package day6Assignment.arrayPrograms;

public class LeftRotateArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 3;
		System.out.println("Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		for (int i = 0; i < n; i++) {
			int x;
			int j;
			x=arr[0];

			for (j = 0; j < arr.length- 1; j++) {
				arr[j] = arr[j + 1];
			}
				arr[j] = x;

			}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);

		}

	}
}
