import java.util.Scanner;

public class ReplaceStringTemplate {
	
	static String printHello() {
		String name;
		int nameLength;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		name=sc.nextLine();
		sc.close();
		nameLength=name.length();
		if(nameLength<3){
			return "Name too short";
		}else {
		return "Hello " + name + " , How are you?";
		}
	}

	public static void main(String[] args) {
		System.out.println(printHello());
	}

}
