package day6Assignment.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortAscendingArray {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter Number of Elements");
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
	}
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
	
input.close();
}
}

