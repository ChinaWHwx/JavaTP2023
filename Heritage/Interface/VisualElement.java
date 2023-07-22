package Heritage.Interface;
public interface VisualElement {
    void display();
    String log();
}
//在接口中，可以定义抽象方法、默认方法和静态方法。抽象方法必须由实现类提供具体实现，
// 而默认方法和静态方法可以在接口中提供默认的实现，实现类可以选择是否覆盖这些方法。

/*
public class VisualElement{
    private static int counter= 0;

    public VisualElement(){
        counter ++;
    }

    public static int getCounter(){
    return counter;
    }

    // log method takes a Function<String, String> as parameter
    public void log(Function<String, String> logger) {
        // Get the log message
        String logMessage = "Log message from VisualElement";

        // Call the logger function to modify the log message
        String modifiedMessage = logger.apply(logMessage);

        // Print the modified log message
        System.out.println(modifiedMessage);
    }
 }
 */