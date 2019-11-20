package honggil;

public class HongGilDong {

  public static void main(String[] args) {
   String s1 =new String("hong");
   String s2 = new String("gil");
   String s3 = new String("dong");
   
   System.out.println(s1);
   System.out.println(s2);
   System.out.println(s3);
   System.out.println(s1+s2+s3);
   
   System.out.println(upperChar(s1)+s1.substring(1,4));
   System.out.println(upperChar(s2)+s2.substring(1,3));
   System.out.println(upperChar(s3)+s3.substring(1,4));
   System.out.println(upperChar(s1)+s1.substring(1,4)+upperChar(s2)+s2.substring(1,3)+upperChar(s3)+s3.substring(1,4));
   System.out.println(upperChar(s1));
   System.out.println(upperChar(s2));
   System.out.println(upperChar(s3));
   
  }
  public static char upperChar(String s1){
    String u = s1.toUpperCase();
    return u.charAt(0);
  }
}
