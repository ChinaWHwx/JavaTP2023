package Chaine;

public class Chaine2 {
  public static void main(String []args){
    String s1 = "hello";
    String s2 = s1 + " " + s1;
    System.out.println(s2);

    StringBuilder sb = new StringBuilder(s1);
    System.out.println(sb.append(" ").append(s1));
  }
}
