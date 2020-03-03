
import java.util.Scanner;
import java.text.DecimalFormat;

public class FlipCoin {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void winPercentage(int n) {
		int headCount=0;
		int tailCount=0;
		int tossCount=0;
		double headPercentage;
		double tailPercentage;
		double toss;
		while(n-- > 0) {
			toss = Math.random();
			tossCount++;
			if(toss>0.5) {
				headCount++;
			}else {
				tailCount++;
			}
		}
		headPercentage = (double)headCount/tossCount;
		tailPercentage = (double)tailCount/tossCount;
		System.out.println("Percentge of heads : "+df2.format(headPercentage)+"\nPercentage of tails : "+df2.format(tailPercentage));
		
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of times you want to toss the coin : ");
		n = sc.nextInt();
		sc.close();
		if(n<0) {
			System.out.println("Show me first how to toss coin"+ n + "times.");
			
		} else {
		 winPercentage(n);
		}

	}

}
