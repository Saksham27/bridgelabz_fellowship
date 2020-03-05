import java.util.Scanner;

public class BubbleSort {

	public static void sort(int[] a) {
		int temp;
		int l = a.length;
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of elements : ");
		n=sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		sort(a);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
