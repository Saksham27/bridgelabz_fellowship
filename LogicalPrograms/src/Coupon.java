import java.util.Scanner;
import java.util.Random;
public class Coupon {
	
	public static int requiredRandom(int n) {
		int count=0,temp,couponCount=0,s=0;
		boolean b=false;
		Random r = new Random();
		int[] record = new int[n];
		
		while(couponCount!=n){
			temp=r.nextInt(n);
			
			for(int j=0;j<s;j++){
				
				if(temp==record[j]){
					b=true;
					break;
				}	
			}
			
			if(b==true){
				count++;
				b=false;
				
			}else{
			
				count++;
				couponCount++;
				record[s++]=temp;
			}
		}
		for(int i=0;i<s;i++){
			System.out.print(record[i]+" ");
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of coupons you want to generate : ");
		n=sc.nextInt();
		sc.close();
		System.out.println("\nNo of times random function ran :"+requiredRandom(n));
	}

}