// find the year is leap year or not.

import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no");
		int i= sc.nextInt();
		while(i%4==0) {
			System.out.println("The year is leap year");
		break;
		}
		if(i%4!=0) 
		{ System.out.println("The year is not leap year");
		
	
		}
	}

}
