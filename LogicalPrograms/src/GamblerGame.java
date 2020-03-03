import java.util.Scanner;
import java.util.Random;

public class GamblerGame {
	
	static int gamble(int stake,int goal,int times){
		int temp,counter=times,win=0,loss=0;
		Random r = new Random();
		while(stake>0 && stake<goal && counter>0){	
			
		temp = r.nextInt(2);
		
		// loss condition
			if(temp==0){
				stake=stake-1;
				loss++;
				
			}else{ // win condition
				stake+=2;
				win++;
			}
			counter--;
			
		}
		if(counter==0){
			System.out.println("Sorry !!! you have already played "+times+" times.\n Stackes :"+stake+" \nYou Won : "+win+" \n You loss : "+loss+" \nYou win precentage : "+(float)win/(times-counter)*100);
			return 0;
		}else if(stake==0){
			System.out.println("Sorry !!! your money is over.\n Stackes :"+stake+" \nYou Won : "+win+" \n You loss : "+loss+" \nYou played "+(times-counter)+" times. \nYou win precentage : "+(float)win/(times-counter)*100);
			return 0;
		}
			System.out.println("Congrats !!! you have reached your assumed goal.\n Stackes :"+stake+" \nYou Won : "+win+" \n You loss : "+loss+" \nYou played "+(times-counter)+" times. \nYou win precentage : "+(float)win/(times-counter)*100);
			return 0;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stakes,goal,times;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how much stakes you have : ");
		stakes=sc.nextInt();
		
		System.out.println("Enter your goal : ");
		goal=sc.nextInt();
		
		System.out.println("Enter how many times you will play : ");
		times=sc.nextInt();
		
		
		gamble(stakes,goal,times);
			
		
	}

}