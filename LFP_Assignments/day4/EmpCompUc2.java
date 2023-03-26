package day4;

import java.util.Random;

public class EmpCompUc2 {
	public static void empComp(int num)
	{
		int emp_Wage_Per_Hr=20;
		int Is_full_Time=8;
		if(num==1)
		{
			System.out.println("employee is present");
			System.out.println("Day Wages="+emp_Wage_Per_Hr*Is_full_Time);
		}
		else {
			System.out.println("employee is absent");
			System.out.println("Day Wages is "+0);
		}
	}
		public static void main(String args[])
		{
			System.out.println("Welcome tp employee pages");
			Random random=new Random();
			int r=random.nextInt(2);
			empComp(r);
		
			
		}
	}


