package Lambda;

//定义一个函数式接口，函数式接口是只包含一个抽象方法的接口
interface MyFunction{
    int operate(int a,int b);
}
public class Lambda {
    public static void main(String args[]){
        MyFunction add = (a, b) -> a + b;
        System.out.println(add.operate(2,3));
    }
}
//Lambda表达式可以用于函数式接口的实例化