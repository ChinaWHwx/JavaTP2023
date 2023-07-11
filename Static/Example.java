package Static;
//类方法，也称为静态方法，是与类本身相关联的方法，而不是与类的特定实例相关联的方法。这意味着您可以直接从类中调用类方法，而无需创建类的实例。
//要在Java中定义类方法，必须在声明方法时使用static关键字。
class Example {
    private static int counter = 0;

    public static void incrementCounter() {
        counter++;
    }

    public void printCounter() {
        incrementCounter(); // 在类内部调用静态方法
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.printCounter(); // 输出: Counter: 1
    }

}




