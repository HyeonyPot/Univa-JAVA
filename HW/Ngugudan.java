import java.util.Scanner;
public class Ngugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] Ndan = new int[10];
		int i;
		System.out.println("최대 10개의 구구단을 출력가능합니다.");
		System.out.println("몇개의 구구단을 출력할까요?");
		i=in.nextInt();
		System.out.println(i+"개의 구구단을 출력합니다.");
		System.out.println("출력할 구구단을 입력해주세요.");
		for(int j=0;j<i;j++) {
			Ndan[j]=in.nextInt();			
		}
		
		for(int m=0;m<i;m++)
		gugudan(Ndan[m]);
		
	}
	public static void gugudan(int dan){
		System.out.println(dan+"단을 출력합니다.");
		if(dan<=9)
		for(int i=1;i<9+1;i++)
			System.out.println(dan+" * "+i +" = "+ i*dan);
		else
			for(int i=1;i<dan+1;i++)
				System.out.println(dan+" * "+i +" = "+ i*dan);
		System.out.println();
	}
}
