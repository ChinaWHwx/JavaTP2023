package substring;

public class Substring {
  public static void main(String [] args){
      String str = "hello world";
      String substr = str.substring(6);
      String substr2 = str.substring(1, 4);
      String substr3 = str.substring(0, 10);//如果设置为0-15，则会引发数组越界异常；StringIndexOutOfBoundsException;

      System.out.println(substr);
      System.out.println(substr2);
      System.out.println(substr3);
  }
}
