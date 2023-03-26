package day4;

import java.util.Random;

public class EmpCompUc1 
{
	public static void empComp(int num) {
		if(num==1)
		
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");
			
		}
	
	public static void main(String args[])
	{
		System.out.println("welcome to employee computing page");

		Random random =new Random();
		int r=random.nextInt(3);
		empComp(r);
		
		
		
	}

}
