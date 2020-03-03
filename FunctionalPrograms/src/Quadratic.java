import java.util.Scanner;
import java.text.DecimalFormat;
public class Quadratic {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static int lambda(int a,int b,int c) {
		return (b*b)-(4*a*c);
	}
	
	public static void findRoots(int a,int b,int c) {
		double root1;
		double root2;
		int l = lambda(a,b,c);
		System.out.println(l);
		if(l<0) {
			System.out.println("No roots exist.");
		}else {
		root1 = (-(b) + Math.pow(l, 0.5))/(2*a);
		root2 = (-(b) - Math.pow(l, 0.5))/(2*a);
		System.out.println("Root 1 of x : "+df2.format(root1));
		System.out.println("Root 2 of x : "+df2.format(root2));
		}
	}
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input x2's constant A : ");
		a=sc.nextInt();
		System.out.println("Input x's constant B : ");
		b=sc.nextInt();
		System.out.println("Input constant C : ");
		c=sc.nextInt();
		sc.close();
		findRoots(a,b,c);
	}

}
