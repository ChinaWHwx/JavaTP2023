package Abstract;

public class Main {
  public static void main(String args[]){
    Shape shape = new Circle("red", 5.0);
    Rectangle rectangle = new Rectangle("blacj", 5, 10);

    System.out.println("Color of the Circle is:" + shape.getColor()+ ";" + "Area of the Circle is:" + shape.getArea()+";");
    System.out.println("color of the rectangle is:" + rectangle.getColor() +";"+ "Area of the Rectangle is:" + rectangle.getArea()+";");
  }
}
