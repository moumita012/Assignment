import java.util.Scanner;
public class Greatestno {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first no");
		a=sc.nextInt();
		System.out.println("Enter second no");
		b=sc.nextInt();
		System.out.println("Enter third no");
		c=sc.nextInt();
		if(a>b) 
			if(a>c) {
				System.out.println("greatest number"+a);
			} if(b>a) 
				if(b>c) {
					System.out.println("greatest number"+b);
				}
			if(c>a) 
				if(c>b) {
					System.out.println("greastes no"+c);
				}
			}
		
	}


