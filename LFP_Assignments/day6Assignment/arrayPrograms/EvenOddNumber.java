package day6Assignment.arrayPrograms;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter elements in array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter " + num + " elements : ");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Odd numbers : ");
		for (int i = 0; i < num; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
		
		System.out.print("Even numbers : ");
		for (int i = 0; i < num; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}

}
