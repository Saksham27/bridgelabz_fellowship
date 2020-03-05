import java.util.Scanner;

public class Util {
	
	// *************************************************************************************
	public static String dayOfWeek(int date,int month,int year) {
		int y = year - (14-month)/12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12*((14-month)/12)-2;
		int d = (date + x + 31*m/12)%7;
		switch(d) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "INVALID";
		}
	}
	
	// *************************************************************************
	public static double temperaturConversion(int fahrenheit) {
		return (fahrenheit -32)*(5/9);
	}
	
	// *************************************************************************
	public static double monthlyPayment(int principle,int year,double rate) {
		int n = 12*year;
		double r = rate/(12*100);
		return (principle*r)/(1-Math.pow(1+r, -n));
	}
	
	// ****************************************************************************
	public static double sqrt(int n) {
		double t=n;
		double EPSILON = 1e-15;
		while(Math.abs(t-n/t)>EPSILON*t) {
			t=(n/t+t)/2;
		}
		return t;
	}
	
	// ******************************************************************************
	public static String toBinary(int n) {
		int result=0;
		int counter=1;
		while(n>=1) {
			result = result + n%2 *counter;
			n=n/2;
			counter=counter*10;
		}
		
		String s = String.format("%08d", result);
		
		return s;
		
	}
	
	/// ********************************************************************************
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date;
		int month;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Date : ");
		date=sc.nextInt();
		System.out.print("Enter Month : ");
		month=sc.nextInt();
		System.out.print("Enter Date : ");
		year=sc.nextInt();
		if(month>=1 && month <=12 && date>=1 && date<=31 ) {
			System.out.println("Day : "+dayOfWeek(date,month,year));
		}
		
		toBinary(12);
	}

}
