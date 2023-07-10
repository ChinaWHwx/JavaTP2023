package Clonage;

import java.util.Objects;

//步枪
class Fusil extends Arme {
    public Fusil(int serie) {
        super(serie);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }
}
