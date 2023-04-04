package Index;

public class Index {
  public static void main(String []args){
    
  String str = "Hello World";
  int index = str.indexOf("world");
  int index2 = str.indexOf("World");

  System.out.println(index);//如果没有找到，返回-1；
  System.out.println(index2);
  }

}
