
public class Binary {
	
	public static int swapNibble(int n) {
		String bin = Util.toBinary(n);
		int result=0;
		int counter=0;
		int l = bin.length();
		int num = Integer.parseInt(bin.substring(l/2,l)+bin.substring(0,l/2-1));
		System.out.println(n);
		System.out.println(bin);
		System.out.println(num);
		while(num>=0) {
			if(num%10!=0) {
				result = result + (int)Math.pow(2, counter++);
				System.out.println(result);
				num/=10;
			}else {
				counter++;
				num/=10;
			}
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		swapNibble(12);

	}

}
