package Collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]){
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);

        System.out.println("TreeSet:");
        for(int num:treeSet){
            System.out.println(num);
        }
    }
}

//TreeSet是一个有序集，用于存储唯一元素，并按照元素的自然顺序进行排序。
