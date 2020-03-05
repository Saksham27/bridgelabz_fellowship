
public class Binary {
	
	public static int swapNibble(int n) {
		String bin = Util.toBinary(n);
		int result=0;
		int counter=0;
		int l = bin.length();
		int num = Integer.parseInt(bin.substring(l/2,l)+bin.substring(0,l/2));
		
		while(num>0) {
			if(num%10!=0) {
				result = result + (int)Math.pow(2, counter++);
				
				num/=10;
			}else {
				counter++;
				num/=10;
				
			}
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		swapNibble(12);

	}

}
