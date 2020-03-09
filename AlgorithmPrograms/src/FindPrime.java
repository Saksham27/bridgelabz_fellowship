
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
				System.out.print(k+" ");
				//counter=true;
			}
			
			k++;	
		}
	}
	
	public static void main(String[] args) {
		findPrime(0,1000);

	}

}
