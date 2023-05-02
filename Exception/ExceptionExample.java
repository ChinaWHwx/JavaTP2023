package Exception;

public class ExceptionExample {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int index = 10;
    try {
      int element = getElement(arr, index);
      System.out.println("The element at index " + index + " is " + element);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Index " + index + " out of bounds for array of length " + arr.length);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("This block will always execute.");
    }
  }

  public static int getElement(int[] arr, int index) {
    if (index >= arr.length || index < 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return arr[index];
  }

}

