import java.util.Scanner;

public class LeapYear {
	
	public static boolean checkLeapYear(int y){
		if( y%4 == 0 && y%100 != 0) {
			return true;
		}else if(y%400==0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		year = sc.nextInt();
		sc.close();
		
		if( year < 1000 || year > 9999 ) {
			System.out.println("Enter a valid year.");
		}else {
			if(checkLeapYear(year)) {
				System.out.println(year+ " is a Leap year.");
			}else {
				System.out.println("Not a Leap year.");
			}
		}
	}

}
