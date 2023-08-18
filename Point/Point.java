package Point;

public class Point {
    private double x;
    private double y;

    private static  int instanceCount = 0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public  void setY(double y){
        this.y = y;
    }

    public static int getInstanceCount(){
        return instanceCount;
    }

    @Override
    public String toString(){
        return "Point [x=" +x + ",y"+ y + "]";
    }

    public static void main(String args[]){
        Point point1 = new Point(3.5,2.6);
        System.out.println("Point 1:"+point1);
        Point point2 = new Point(1.2,5.7);
        System.out.println("Point 2:"+point2);

        System.out.println("Number of Point instances:"+Point.getInstanceCount());
    }
}
