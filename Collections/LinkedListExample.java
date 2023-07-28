package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String []args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("LinkedList:");
        for(int num:linkedList){
            System.out.println(num);
        }
    }
}

//LinkedList是一个双向链表，适用于频繁的插入和删除操作。
