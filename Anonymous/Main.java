package Anonymous;

public class Main {
    public static void main(String[] args){
        // 使用匿名类实现Greeting接口
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, anonymous class!");
            }
        };

        greeting.sayHello(); // Output: Hello, anonymous class!

        // 使用匿名类继承Shape抽象类
        Shape shape = new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing a shape using anonymous class");
            }
        };

        MessagePrinter printer = new MessagePrinter();
        // 使用匿名类作为方法参数
        printer.printMessage(new Message() {
            @Override
            public String getContent() {
                return "This is a message from an anonymous class";
            }
        });
    }
}
