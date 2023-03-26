package day4;

public class EmpCompUc5 {
	 public static void EmpWageStatus(int num){
	        int Wage_HR = 20;
	        int Day_HRs = 8;
	        int Part_HRs = 8;
	        int NumDays = 20;
	        double daywage = 0;
	        double monthwage = 0;

	        for (int i =0; i<NumDays; i++){
	            switch (num){
	                case 1:
	                    daywage = Wage_HR * Day_HRs * i;
	                    break;
	                case 2:
	                    daywage = Wage_HR * (Day_HRs + Part_HRs) * i;
	                    break;
	                case 0:
	                    break;

	            }
	            monthwage = monthwage + daywage;
	        }
	        System.out.println("Month Wage : " + monthwage);


	    }
				
}
