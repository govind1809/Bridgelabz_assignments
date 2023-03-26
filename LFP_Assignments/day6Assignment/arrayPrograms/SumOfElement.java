package day6Assignment.arrayPrograms;

import java.util.Scanner;

public class SumOfElement {

	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of alement you want");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter number");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();

		}
		for (int num : arr) {
			sum = sum + num;
		}
		System.out.println(sum);
		input.close();
	}

}
