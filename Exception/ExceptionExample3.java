package Exception;

public class ExceptionExample3 {
    public void throwCustomException() throws CustomException{
        throw new CustomException("this is a custom exception message");
    }

    public static void main(String args[]){
        ExceptionExample3 exceptionExample3 = new ExceptionExample3();
        try{
            exceptionExample3.throwCustomException();
        }catch (CustomException e){
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
