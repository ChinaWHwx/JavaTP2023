package Point;

public class PolygoneArray {
    private Point[] points;
    private int size;
    private static final int DEFAULT_CAPACITE = 10;

    public PolygoneArray(){
        points = new Point[DEFAULT_CAPACITE];
        size = 0;
    }

    public void ajouter(Point point){
        if(size == points.length){
            Point[] newPoints = new Point[points.length*2];
            System.arraycopy(points,0,newPoints,0,size);
            points = newPoints;
        }
        points[size++]=point;
    }

    public void enlever(){
        if(size>0){
            points[--size] = null;
        }
    }

    @Override
    public String toString(){
        StringBuffer result = new StringBuffer("PolygoneArray [Points=");
        for(int i=0;i<size;i++){
            result.append(points[i]);
            if(i<size-1) {
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String args[]){
        Point point1 = new Point(3.5,2.8);
        Point point2 = new Point(1.2,5.7);

        // 使用数组实现的 Polygone
        PolygoneArray polygoneArray = new PolygoneArray();
        polygoneArray.ajouter(point1);
        polygoneArray.ajouter(point2);
        System.out.println("PolygoneArray: " + polygoneArray);
        polygoneArray.enlever();
        System.out.println("PolygoneArray après enlever(): " + polygoneArray);
    }
}
