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

/*
 *  StringBuilder sb = new StringBuilder("hello");
    System.out.println("Before modification: " + sb);
        
    sb.setCharAt(0, 'H');
    System.out.println("After modification: " + sb);
 *
 *  setCharAt() 方法可以在 StringBuilder 中使用，因为 StringBuilder 和 StringBuffer 类似，
 *  都是可变字符串，它们都继承自 AbstractStringBuilder 类。
 *  因此，StringBuilder 也具有 setCharAt() 方法。
 */
