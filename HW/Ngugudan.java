import java.util.Scanner;
public class Ngugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] Ndan = new int[9];
		int i;
		System.out.println("�ִ� 10���� �������� ��°����մϴ�.");
		System.out.println("��� �������� ����ұ��?");
		i=in.nextInt();
		System.out.println(i+"���� �������� ����մϴ�.");
		System.out.println("����� �������� �Է����ּ���.");
		for(int j=0;j<i;j++) {
			Ndan[j]=in.nextInt();			
		}
		
		for(int m=0;m<i;m++)
		gugudan(Ndan[m]);
		
	}
	public static void gugudan(int dan){
		System.out.println(dan+"���� ����մϴ�.");
		if(dan<=9)
		for(int i=1;i<9+1;i++)
			System.out.println(dan+" * "+i +" = "+ i*dan);
		else
			for(int i=1;i<dan+1;i++)
				System.out.println(dan+" * "+i +" = "+ i*dan);
		System.out.println();
	}
}
