import java.util.Scanner;

public class PowerofTwo {

	public static void table(int n) {
		int i=0;
		while(i <= n) {
			System.out.println((int)Math.pow(2,i++));
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter power from 0 to less than 31 : ");
		n = sc.nextInt();
		if(n>=0 && n<31) {
			table(n);
		}else {
			System.out.println("Enter valid power.");
		}

	}

}
