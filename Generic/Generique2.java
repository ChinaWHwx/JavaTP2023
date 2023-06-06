package Generic;

import java.util.List;

public class Generique2<E extends List> {
    private E list;
    public Generique2(E list){
        this.list = list;
    }

    public E getList(){
        return list;
    }

    public void setList(E list){
        this.list = list;
    }

    public static void main(String[] args){
        List<Integer> intList = List.of(1,2,3,4,5);
        Generique2<List<Integer>> generique = new Generique2<>(intList);
        System.out.println(generique.getList());
    }
}
