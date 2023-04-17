package Abstract;

class Circle extends Shape {
  private double radius;
  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
}

public double getRadius() {
    return radius;
}

@Override
public double getArea() {
    return Math.PI * radius * radius;
}
}
