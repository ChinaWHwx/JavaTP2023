package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String args[]){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        System.out.println("HashSet:");
        for(String fruit:hashSet){
            System.out.println(fruit);
        }
    }
}

//HashSet是一个哈希集，用于存储唯一元素，不保证元素的顺序。