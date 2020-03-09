import java.util.Scanner;

public class StringPermutation {
	
	public static String swap(String s,int a, int b) {
		char temp;
		char[] arr = s.toCharArray();
		temp  = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return String.valueOf(arr);
	}
	
	public static void stringPermutation(String s,int l,int e) {
		
		if(l==e) {
			System.out.println(s);
		}else {
			for(int i=l;i<e;i++) {
				s = swap(s,l,i);
				
				stringPermutation(s,l+1,e);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int length = s.length();
		stringPermutation(s,0,length);
		
	}

}
