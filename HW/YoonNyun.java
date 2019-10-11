import java.util.Scanner;
public class YoonNyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("윤년인지 확인하고싶은 연도를 입력해주세요 :");
		int yearchk = in.nextInt();
		if( yearchk % 400 == 0)
		{
			System.out.println(yearchk+"년은 윤년입니다.");
			
		}
		else if(yearchk % 100 == 0){
			System.out.println(yearchk+"년은 평년입니다.");
			
		}	
		else if(yearchk % 4 == 0) {
			System.out.println(yearchk+"년은 윤년입니다.");
		}
		else {
			System.out.println(yearchk+"년은 평년입니다.");
		}	
		
		
	}

}
