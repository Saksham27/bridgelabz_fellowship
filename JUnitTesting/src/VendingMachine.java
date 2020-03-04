

// Notes : 1,2,5,10,50,100,500,1000

import java.util.Scanner;


public class VendingMachine {
	public static int getAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount : ");
		return sc.nextInt();
	}
	public static String change() {
		int noteCount=1;
		int temp;
		int[] notes = new int[50];
		int k=0;
		int value = getAmount();
		while(value>0) {
			if(value>=1000) {
				temp=value;
				value=value-1000*(value/1000);
				while(k++<(temp/1000)) {
					notes[noteCount-1]=1000;
					noteCount++;
				}
				k=0;
				
				
			}
			if(value>=500) {
				temp=value;
				value=value-500*(value/500);
				while(k++<(temp/500)) {
					notes[noteCount-1]=500;
					noteCount++;
				}
				k=0;
				
			
			}
			if(value>=100) {
				temp=value;
				value=value-100*(value/100);
				while(k++<(temp/100)) {
					notes[noteCount-1]=100;
					noteCount++;
				}
				k=0;
				
			}
			if(value>=50) {
				temp=value;
				value=value-50*(value/50);
				while(k++<(temp/50)) {
					notes[noteCount-1]=50;
					noteCount++;
				}
				k=0;
				
				
			}
			if(value>=10) {
				temp=value;
				value=value-10*(value/10);
				while(k++<(temp/10)) {
					notes[noteCount-1]=10;
					noteCount++;
				}
				k=0;
				
				
			}
			if(value>=5) {
				temp=value;
				value=value-5*(value/5);
				while(k++<(temp/5)) {
					notes[noteCount-1]=5;
					noteCount++;
				}
				k=0;
				
			}
			if(value>=2) {
				temp=value;
				value=value-2*(value/2);
				while(k++<(temp/2)) {
					notes[noteCount-1]=2;
					noteCount++;
				}
				k=0;
				
			}
			if(value>=1) {
				temp=value;
				value=value-1*(value/1);
				while(k++<(temp/1)) {
					notes[noteCount-1]=1;
					noteCount++;
				}
				k=0;
				
			}
		}
		System.out.println("Number of notes required for change : "+(noteCount-1)+"\nNotes : ");
		
		for(int i=0;i<noteCount-1;i++) {
			System.out.print(notes[i]+" ");
		}
		return ""+(noteCount-1)+"";
	}
	public static void main(String[] args) {
		String x = change();
		System.out.println(x);

	}

}
