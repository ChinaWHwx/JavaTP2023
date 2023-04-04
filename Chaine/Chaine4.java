package Chaine;

public class Chaine4 {
  public static void main(String args[]){
    String s1 = new String("essai");
    System.out.println(s1.concat(" de concatenation"));//字符串的拼接，不改变原始字符串(String类是不可变的)，创建一个新的字符串
    System.out.println(s1);

    String s2 = new String("essai");
    System.out.println(s2.replace('s','Z'));
    System.out.println(s2);

    s2 = new String("Changement valide");
    System.out.println(s2);
  }
}

/*
essai de concatenation
essai
eZZai
essai
Changement valide
 */