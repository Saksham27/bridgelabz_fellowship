import java.util.Scanner;

public class InsersionSort {

	public static void sort(String[] s,int l) {
		for(int i=1;i<l;i++) {
			String key = s[i];
			int j=i-1;
			while(j>=0 && s[j].compareTo(key)>0) {
				s[j+1]=s[j];
				j--;
			}
			s[j+1]=key;
		}
		
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of strings you want to enter : ");
		n=sc.nextInt();
		String[] list = new String[n];
		
		System.out.println("Enter words : ");
		int i=0;
		while(i<n) {
			list[i++]=sc.next();
		}
		sc.close();
		sort(list,n);
		for(int j=0;j<n;j++) {
			System.out.print(list[j]+" ");
		}
	}


}
