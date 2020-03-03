import java.util.Scanner;

public class HarmonicNumber {

	public static void harmonicValue(int n) {
		double sum=0;
		while(n>=1) {
			sum += (double)1/n--;
		}
		System.out.println("Harmonic value : "+sum);
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the n for comupting the harmonic value : ");
		n=sc.nextInt();
		sc.close();
		
		if(n>0) {
			harmonicValue(n);
		}else {
			System.out.println("Enter valid value for n");
		}
	}

}
