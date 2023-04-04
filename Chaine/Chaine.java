package Chaine;

public class Chaine {
  public static void main(String[] a){
    String s1 = "moi";
    String s2 = "encore moi";

    System.out.println(s1);
    System.out.println(s2);

    System.out.println(s1+s2);
    System.out.println(s2.replace("moi", "loic"));
    System.out.println(s2.replace('l', 'L'));

    System.out.println("123");
    System.out.println("1"+"2");
    
  }
}

 /*
  *moi
  *encore moi
  *moiencore moi
  *encore loic
  *encore moi
  *123
  *12
  */
