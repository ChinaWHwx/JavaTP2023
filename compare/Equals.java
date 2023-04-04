package compare;

public class Equals {
  public static void main(String [] args){
  String str1 = "hello";
  String str2 = "hello";

  boolean isEqual = str1.equals(str2);
  int compareResult = str1.compareTo(str2);

  System.out.println("isEqual:"+isEqual);
  System.out.println("compareResult:" + compareResult);
  }
}
