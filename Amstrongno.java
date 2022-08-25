//amstrong no print
public class Amstrongno {

	public static void main(String[] args) {
	
		int i=153;
		int temp = i;
		int k=0;
		while(i>0){
			int rem = i%10;
			k=(k)+ (rem*rem*rem);
			i=i/10;
			
		} if (temp==k) {
			System.out.println("It is amstrong no");
		} else {
			System.out.println("it is not amstrong no");
		}
	}

}
