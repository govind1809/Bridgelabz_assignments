package day6Assignment.arrayPrograms;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int arr[] = { 8, 9, 10, 11, 12, 23, 6, 7, 4 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

}
