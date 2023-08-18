package Point;

import java.util.Vector;

public class PolygoneVector {
    private Vector<Point> points = new Vector<>();

    public void ajouter(Point point){
        points.add(point);
    }

    public void enlever(){
        if(!points.isEmpty()){
            points.remove(points.size()-1);
        }
    }

    @Override
    public String toString(){
        return "PolygoneVector [points=" + points + "]";
}   public static void main(String args[]){
        Point point1 = new Point(3.5,2.8);
        Point point2 = new Point(1.2,5.7);

        // 使用数组实现的 Polygone
        PolygoneVector polygoneVector = new PolygoneVector();
        polygoneVector.ajouter(point1);
        polygoneVector.ajouter(point2);
        System.out.println("PolygoneVector: " + polygoneVector);
        polygoneVector.enlever();
        System.out.println("PolygoneVector après enlever(): " + polygoneVector);
    }
}
