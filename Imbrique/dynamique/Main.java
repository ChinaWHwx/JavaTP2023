package Imbrique.dynamique;

public class Main {
    public static void main(String [] args){
        //在外部类的实例化中实例非静态嵌套类
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.innerMethod();
    }
}
