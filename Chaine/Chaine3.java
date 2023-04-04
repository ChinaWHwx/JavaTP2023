package Chaine;

public class Chaine3 {
  public static void main(String args[]){
    StringBuffer s1 = new StringBuffer("loic");
    s1 = new StringBuffer("yon");

    System.out.println(s1);

    //s1[0] = 'c';
    //StringBuffer 类型不是数组类型。如果要访问 StringBuffer 中的字符，必须使用 charAt() 方法
    s1.setCharAt(0, 'b');
    System.out.println(s1);
  }
}

//yon
//bon
