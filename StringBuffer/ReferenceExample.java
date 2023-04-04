package StringBuffer;

public class ReferenceExample {
  public static void main(String [] args){
    StringBuffer s1 = new StringBuffer("Bonjour"); //创建一个StringBuffer对象，对象的值传递给引用
    StringBuffer s2 = s1; //对象的值赋给另一个引用s2，s1和s2引用了同一个对象
    s1.append(" les ZZ");//添加字符串" les ZZ"
    s1.append(2);//添加数字2

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1.length());
    System.out.println(s2.capacity());

    /* java的对象引用实际上是指向该对象存储空间（内存地址）的指针
     * 创建一个对象时，会为对象分配一块内存，并返回该内存地址给引用变量
     * 可以通过引用变量来访问对象 
     */
  }
}
