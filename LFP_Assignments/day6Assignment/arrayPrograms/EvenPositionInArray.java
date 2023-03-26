package day6Assignment.arrayPrograms;

public class EvenPositionInArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,10,13,14};
		System.out.println(" Even Array Elements");
		for(int i=0;i<arr.length;i+=2)
				
				System.out.print(" " + arr[i]);
	}

}
