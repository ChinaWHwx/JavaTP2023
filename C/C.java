package C;

public class C {
  String chaine1, chaine2;
  public C(){
    chaine1 = "CHAINE1";
    chaine2 = "CHAINE2";
  }

  void methode1(String chaine1, String c){
    this.chaine1 = chaine1;
    chaine2 = c;
  }

  void methode2(){
    methode1("e","f");
    this.methode1("", "");
  }

  public static void main(String[] args){
    C instance =  new C();//创建一个c对象，调用构造函数，初始化chaine1、chaine2
    System.out.println(instance.chaine1); // output: CHAINE1
    System.out.println(instance.chaine2); // output: CHAINE2

    instance.methode1("new string", "new string 2");
    System.out.println(instance.chaine1);// output: new string
    System.out.println(instance.chaine2);// output: new string 2

    instance.methode2();
    System.out.println(instance.chaine1);// output: 
    System.out.println(instance.chaine2);// output:
  }
}
