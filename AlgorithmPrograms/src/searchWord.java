import java.io.File;
import java.util.Scanner;

public class searchWord {
	

	
	public static void sortList(String[] s) {
		int l = s.length;
		String temp;
		for(int i=0;i<l-1;i++) {
			for(int j=i+1;j<l;j++) {
				if(s[i].compareTo(s[j])>0) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
	}
	
	public static int searchLoop(String s,String[] list,int start,int length) {
		
		while(start<=length) {
			int mid = start+(length-start)/2;
			int res = s.compareTo(list[mid]);
			if(res==0) {
				return mid;
			}
			if(res>0) {
				start=mid+1;
			}else {
				length=mid-1;
			}	
		}
		return -1;
	}
	
	public static int searchRecursion(String s,String[] list,int start,int length) {
		while(start<=length) {
			int mid = start+(length-start)/2;
			int res = s.compareTo(list[mid]);
			if(res==0) {
				return mid;
			}
			if(res>0) {
				return searchRecursion(s,list,mid+1,length);
			}else {
				return searchRecursion(s,list,start,mid-1);
			}
		}
		return -1;
	}

	
	
	public static void main(String[] args) throws Exception {
		String word;
		Scanner sc = new Scanner(System.in);
		File f = new File("D:\\_development\\bridgelabz\\AlgorithmPrograms\\src\\words.txt");
		System.out.println("Enter the word to be searched : ");
		word = sc.nextLine();
		String[] s = new String[1000];
		int counter=0;
		Scanner scf = new Scanner(f);
		while(scf.hasNextLine()) {
			s[counter++]=scf.nextLine();
		}
		scf.close();
		int length=s.length;
		for(int i=0;i<length;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		sortList(s);
		
		for(int i=0;i<length;i++) {
			System.out.print(s[i]+" ");
		}
		
		int r =searchRecursion(word,s,0,length);
		if(r==-1) {
			System.out.println("\nNot found.");
		}else {
			System.out.println("\nfound at "+r+" position.");
		}
	}

}
