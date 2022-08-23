import java.util.Scanner;
public class Quadraticeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double d, r1=0,r2=0;
		System.out.println("Enter 1st value");
		int a= sc.nextInt();
		System.out.println("Enter 2nd value");
		int b= sc.nextInt();
		System.out.println("Enter 3rd value");
		int c= sc.nextInt();
		d= b*b-4*a*c;
		if(d>0) {
			r1= -b+ Math.sqrt(d)/2*a;
			r2= -b- Math.sqrt(d)/2*a;
			System.out.println("root1"+r1);
			System.out.println("root2"+r2);
		} else if(d==0) {
			r1= -b/2*a;
			System.out.println("value is equal"+r1);
		} else {
			System.out.println("value is imaginary");
		}

	}

}
