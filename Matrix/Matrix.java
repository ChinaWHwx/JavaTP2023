package Matrix;

public class Matrix {
  public static void main(String []args){
    //int[][] matrix = new int[3][3]; //声明一个3行3列的二维数组
    //int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //声明一个3行3列的二维数组，并初始化值
    System.out.println(matrix[0][0]); //输出1，访问二维数组的元素
  }
}
