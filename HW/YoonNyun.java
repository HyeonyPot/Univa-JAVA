import java.util.Scanner;
public class YoonNyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("�������� Ȯ���ϰ���� ������ �Է����ּ��� :");
		int yearchk = in.nextInt();
		if( yearchk % 400 == 0)
		{
			System.out.println(yearchk+"���� �����Դϴ�.");
			
		}
		else if(yearchk % 100 == 0){
			System.out.println(yearchk+"���� ����Դϴ�.");
			
		}	
		else if(yearchk % 4 == 0) {
			System.out.println(yearchk+"���� �����Դϴ�.");
		}
		else {
			System.out.println(yearchk+"���� ����Դϴ�.");
		}	
		
		
	}

}
