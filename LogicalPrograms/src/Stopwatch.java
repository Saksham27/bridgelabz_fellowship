import java.util.Scanner;
import java.time.Duration;
import java.time.LocalTime;
import java.text.DecimalFormat;

public class Stopwatch {
	
	private static DecimalFormat df2 = new DecimalFormat("##");
	
	public static LocalTime startStopwatch() {
		return java.time.LocalTime.now();
	}
	
	public static LocalTime stopStopwatch() {
		return java.time.LocalTime.now();
	}
	
	public static String timeElapsed(LocalTime t1,LocalTime t2) {
		String hours = df2.format(Duration.between(t2,t1).toHours());
		String minutes = df2.format(Duration.between(t2,t1).toMinutes());
		String seconds = df2.format(Duration.between(t2,t1).toSeconds());
		return hours+" H:"+minutes+" M:"+seconds+" S";
	}
	public static void main(String[] args) {
		
		char c;
		LocalTime t1=null,t2=null;
		System.out.println("Press y when you want to start the stopwatch : ");
		Scanner sc = new Scanner(System.in);
		c = sc.next().charAt(0);
		
		if(c=='y' || c=='Y') {
			t1=startStopwatch();
		}
		System.out.println("Now Press n when you want to stop the stopwatch : ");
		c=sc.next().charAt(0);
		if(c=='n' || c=='N') {
			t2=stopStopwatch();
		}
		System.out.println("time elapsed : "+timeElapsed(t2,t1));
		
		
	}

}
