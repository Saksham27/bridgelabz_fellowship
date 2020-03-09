import java.util.Scanner;

public class Anagram {
	private static boolean isAnagram=false;
	
	public static String swap(String s,int a, int b) {
		char temp;
		char[] arr = s.toCharArray();
		temp  = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return String.valueOf(arr);
	}
	
	public static boolean checkAnagram(String s,String s2,int l,int e) {
		
		
		if(l==e) {
			if(s.compareTo(s2)==0) {
				System.out.println(s+" "+s2);
				isAnagram=true;
				return isAnagram;
			}
		}else {
			for(int i=l;i<e;i++) {
				s = swap(s,l,i);
				
				checkAnagram(s,s2,l+1,e);
			}
		}
		return isAnagram;
		
	}
	public static void main(String[] args) {
		String s1;
		String s2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter first string : ");
		s1=sc.nextLine();
		System.out.println("Enter second string : ");
		s2 = sc.nextLine();
		
		if(checkAnagram(s1,s2,0,s1.length())) {
			
			System.out.println("Two strings are anagram.");
		}else {
			System.out.println("These strings are not anagram.");
		}
		
	}

}
