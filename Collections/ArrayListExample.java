package Collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();// 创建一个ArrayList来存储整数

        // 向ArrayList中添加元素
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");

        System.out.println("ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}

//ArrayList是一个动态数组，它可以根据需要自动调整大小，并且支持快速随机访问和增删操作。