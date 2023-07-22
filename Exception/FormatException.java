package Exception;

public class FormatException extends Exception{
    public FormatException(String message){
        super("Unknown format");
    }
}
