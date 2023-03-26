package day6Assignment.arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 3, 5, 6, 7, 6, 7, 8, 8 };
		Arrays.sort(arr);
		int arr1[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!= arr[i+1]) {
				arr1[j++] = arr[i];
			}
		}

			arr1[j++] = arr[arr.length-1];
			for (int k = 0; k < j; k++) {
				System.out.println(arr1[k]);
		}
	}
}
