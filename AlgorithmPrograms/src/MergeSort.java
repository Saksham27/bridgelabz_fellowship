import java.util.Scanner;

public class MergeSort {

	public static void merge(String[] s,int l,int m,int h) {
		int n1 = m-l+1;
		int n2 = h-m;
		String[] L = new String[n1];
		String[] R = new String[n2];
		
		 for (int i=0; i<n1; ++i) 
	            L[i] = s[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = s[m + 1+ j]; 
	  
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(L[i].compareTo(R[j])<=0) {
				s[k++]=L[i++];
			}else {
				s[k++]=R[j++];
			}
		}
		
		while(i<n1) {
			s[k++]=L[i++];
		}
		
		while(j<n2) {
			s[k++]=R[j++];
		}
		
	}
	
	public static void sort(String[] s,int l,int h) {
		if(l<h) {
			int m=(l+h)/2;
			
			sort(s,l,m);
			sort(s,m+1,h);
			merge(s,l,m,h);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of strings you want to enter : ");
		n=sc.nextInt();
		String[] list = new String[n];
		int i=0;
		
		System.out.println("Enter words :");
		while(i<n) {
			list[i++]=sc.next();
		}
		sc.close();
		sort(list,0,n+1);
		for(int j=0;j<n;j++) {
			System.out.print(list[j]+" ");
		}
	}


}
