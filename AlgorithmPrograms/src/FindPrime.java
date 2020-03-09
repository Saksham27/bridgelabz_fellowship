
public class FindPrime {
	
	static void findPrime(int start,int end) {
		boolean counter = true;
		int k=start;
		while(k<=end) {
			if(k<=1) {
				counter=false;
			}
			for(int i=2;i<k;i++) {
				if(k%i==0) {
					counter=false;
					break;
				}
				counter=true;
			}
			if(counter==true) {
				if(isPalindrome(k)) {
					System.out.println(k+" ");
				}
				
				//counter=true;
			}
			
			k++;	
		}
	}
	
	static boolean isPalindrome(int n) {
		int key = n;
		int sum=0;
		while(key > 0) {
			sum = sum*10 + key % 10;
			key=key/10;
		}
		
		if(sum==n) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	public static void main(String[] args) {
		findPrime(0,1000);

	}

}
