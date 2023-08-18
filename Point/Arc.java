package Point;

public class Arc {
    private Point origine;
    private Point destination;

    public Arc(Point origine, Point destination) {
        this.origine = origine;
        this.destination = destination;
    }

    public Arc(){
        this(new Point(0, 0), new Point(0, 0));
    }

    public Point getOrigine(){
        return origine;
    }

    public void setOrigine(Point origine) {
        this.origine = origine;
    }

    public Point getDestination(){
        return destination;
    }

    public void setDestination(Point destination){
        this.destination = destination;
    }


    @Override
    public String toString(){//toString方法是Objec类中的一个方法，所有Java类都会继承这个方法
        return "Arc [origine=" + origine +",destination=" + destination +"]";//默认情况下，该方法返回一个表示对象的字符串，通常是类名后接@符号和对象的哈希码
    }

    public static void main(String args[]){
        Point point1 = new Point(3.5,2.8);
        Point point2 = new Point(1.2,5.7);

        Arc arc1 = new Arc();
        System.out.println("Arc 1:"+arc1);

        Arc arc2 = new Arc(point1,point2);
        System.out.println("Arc 2:"+arc2);
    }
}


