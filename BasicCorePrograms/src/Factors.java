import java.util.Scanner;

public class Factors {
	
	
	
	public static void primeFactors(int n){
		int m=1;
		int i=2;
		while(n!=1) {
			if(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
			}else {
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		n=sc.nextInt();
		sc.close();
		
		primeFactors(n);
		
	}

}
