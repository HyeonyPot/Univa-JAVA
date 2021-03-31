import java.util.Scanner;

public class bigNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		int b1 = scan.nextInt();
		int b2 = scan.nextInt();
		int b3 = scan.nextInt();
		int big1;
		int big2;
		System.out.println(b1+"d"+b2+"d"+b3);
		if(b1<=b2) {
			big1=b2;
			big2=b1;
			if(b2<=b3) {
				System.out.println(b3+b2+b1);
			}		
			else if(b1<b3) {
				System.out.println(b3+b1+b1);
			}
		}
		else if(b1<b3) {
			big1=b3;
			
		}

	
	}
	
	

}

