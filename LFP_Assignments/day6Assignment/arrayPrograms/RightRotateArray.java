package day6Assignment.arrayPrograms;

public class RightRotateArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = 1;
		System.out.println("original Array");
		for (int i = 0; i < arr.length; i++) {
			
		}
		for (int i = 0; i < n; i++) {
			int x;
			int j;
			x = arr[arr.length - 1];
			for(j=arr.length - 1;j>0;j--) {
				arr[j] = arr[j - 1];

			}
			arr[j] = x;

		}
		for(int i=0;i<arr.length;i++)
		System.out.print(" " + arr[i]);
	}
}
