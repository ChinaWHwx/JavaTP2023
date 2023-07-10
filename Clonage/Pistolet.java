package Clonage;

import java.util.Objects;

//手枪
class Pistolet extends Arme {
    public Pistolet(int serie) {
        super(serie);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
