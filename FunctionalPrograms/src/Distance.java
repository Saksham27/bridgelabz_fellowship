import java.util.Scanner;

public class Distance {

	public static double euclideanDistance(int x, int y) {
		return Math.pow(x*x+y*y,0.5);
	}
	
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x co=ordinate : ");
		x=sc.nextInt();
		System.out.println("Enter y co-ordinate : ");
		y=sc.nextInt();
		
		System.out.println("Euclidean Distance : "+ euclideanDistance(x,y));
	}

}
