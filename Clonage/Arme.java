package Clonage;

abstract class Arme {
    private int serie;

    public Arme(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }
}
