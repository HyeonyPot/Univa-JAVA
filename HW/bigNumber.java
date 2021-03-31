import java.util.Scanner;
public class bigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요.");
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		int temp;
		if(first<second && second<third){
			temp=first;
			first=third;
			third=temp;		
		}
		else if(third > second && third > first) {
			temp=first;
			first=third;
			third=temp;
		}
		if(third>second) {
			temp=second;
			second=third;
			third=temp;
		}
		System.out.println(first+" "+second+" "+third);
	}

}

