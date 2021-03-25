import java.util.Scanner;


public class builldingHeight {

  public static void main(String[] args) {
   
   
   Scanner in = new Scanner(System.in);
   System.out.println("건물의 높이를 입력하세요");
   int height = in.nextInt();
   
   System.out.println( "건물의 층수 : " + height/5 + 'm');
   
   
   
  }
}

