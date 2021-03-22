package HW;

import java.util.Scanner;


public class builldingHeight {

  public static void main(String[] args) {
   
   int coffee = 2000;
   int milk = 1000;
   int water = 500;
   Scanner in = new Scanner(System.in);
   System.out.println("1.커피 2000원");
   System.out.println("2.우유 1000원");
   System.out.println("3.물 500원");
   int menu = in.nextInt();
   System.out.println("수량입력");
   int i = in.nextInt();
   
   if (menu == 1){
     System.out.println("커피 " + i + "잔 " + coffee*i + "원 입니다.");
   }
   else if(menu == 2){
     System.out.println("우유 " + i + "잔 " +milk*i + "원 입니다.");
   }
   else if(menu == 3){
     System.out.println("물 " + i + "잔 " +water*i + "원 입니다.");
   }
   else{
     System.out.println("다시 입력해주세요");
   }
   
   
   
  }
}
