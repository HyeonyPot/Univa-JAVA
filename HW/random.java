import java.util.Random;
public class randomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] a= new int[11];
		int[] result=new int[11];
		int i=0;
		int sum=0;
		System.out.print("랜덤숫자: ");
		
		for(i=0;i<11;i++){
			a[i]=random.nextInt(11);
			try {
			result[i]=a[i]/i;
			}catch(ArithmeticException e){
			System.out.println("0으로 나누기 실패!");
		}
		sum+=result[i];
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("나누기 결과 = ");
		for(i=0;i<11;i++){
			System.out.print(result[i]+" ");
		}
		System.out.println();
		System.out.println(sum);
		
	}

}
