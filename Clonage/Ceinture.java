package Clonage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ceinture implements Cloneable{
    private List<String> elements;

    public Ceinture(List<String> elements){
        this.elements = elements;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        List<String> clonedElements = new ArrayList<>(elements.size());
        for(String element: elements){
            clonedElements.add(element);
        }
        return new Ceinture(clonedElements);
    }

    @Override
    public String toString(){
        return elements.toString();
    }
}
