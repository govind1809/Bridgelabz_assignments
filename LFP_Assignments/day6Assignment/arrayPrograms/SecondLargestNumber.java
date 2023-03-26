package day6Assignment.arrayPrograms;

public class SecondLargestNumber {
	public static void main(String args[]) {
		int temp;
		int arr[] = {60,45,30,26,90,99,100 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Third largest number is " + arr[arr.length-2]);
	}
}



