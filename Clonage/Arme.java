package Clonage;

abstract class Arme implements Cloneable{
    /*
     * Cloneable 是一个标记接口，位于java.lang包下。
     *Cloneable接口用于指示一个类实现了克隆（clone）的能力，即通过clone()方法创建该类的副本。
     * 当一个类实现了Cloneable接口，并且调用了该类的clone()方法时，会创建该类的一个副本对象。
     * 需要注意的是，Cloneable接口本身并没有定义clone()方法，它只是作为一个标记，告诉编译器这个类支持克隆操作。
     * 实际上，clone()方法是定义在Object类中，而且是受保护的方法。
     * 当一个类实现了Cloneable接口，但没有重写clone()方法时，调用该类的clone()方法会抛出CloneNotSupportedException异常。
     * 因此，如果想要在一个类中使用克隆操作，需要实现Cloneable接口，并且重写clone()方法来定义克隆的行为。
     */
    private int serie;

    public Arme(int serie) {
        this.serie = serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }


    public int getSerie() {
        return serie;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
