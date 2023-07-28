package Imbrique.statique;

public class Main {
    public static void main(String[] args){
        //在外部类的静态方法中实例化静态嵌套类
        OuterClass.InnerStaticClass innerObj = new OuterClass.InnerStaticClass();
        innerObj.innerStaticMethod();
        innerObj.displayOuterStaticVar();
    }
}
