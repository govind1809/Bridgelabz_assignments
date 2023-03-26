package day6Assignment.arrayPrograms;

public class CopyArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("element of array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("Element  of new array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
