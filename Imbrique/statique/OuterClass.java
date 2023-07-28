package Imbrique.statique;

public class OuterClass {
    //外部类的静态变量和方法
    private static int outerStaticVar = 10;

    public static void outerStaticMethod(){
        System.out.println("Outer static method");
    }

    //静态嵌套类（静态内部类）
    public static class InnerStaticClass{
        private static int innerStaticVar = 20;//静态嵌套类（内部类）的静态变量

        public static void innerStaticMethod(){//静态嵌套类（内部类）的静态方法
            System.out.println("Inner static Method");
        }

        public void displayOuterStaticVar(){
            System.out.println("Outer static variable from inner class:"+ innerStaticVar);
        }
    }
}

