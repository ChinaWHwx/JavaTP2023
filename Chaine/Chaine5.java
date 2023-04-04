package Chaine;

public class Chaine5 {
  public static void main(String[] a){
    String s1 = "loic";
    String s2 = "loic";
    String s3 = new String("loic");
    String s4 = new String("loic");
    String s5 = s3;
    String s6 = null;

    System.out.println(s1==s2);//true
    System.out.println(s1==s3);//false
    System.out.println(s3==s4);//false
    System.out.println(s5==s3);//true

    System.out.println(s1.equals(s3));//true
    System.out.println(s1.equals(s6));//false
    System.out.print(s6.equals(s1));//Exception in thread "main" java.lang.NullPointerException
  }
}
