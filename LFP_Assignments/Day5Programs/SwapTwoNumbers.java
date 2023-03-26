package Day5Programs;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x value");
		int x = in.nextInt();
		System.out.println("Enter y value");
		int y = in.nextInt();
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x value is :" + x + "     y value is :" + y);
	}

}
