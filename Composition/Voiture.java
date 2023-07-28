package Composition;

public class Voiture {
    private Moteur m;
    public Voiture(Moteur m){
        this.m= m;//聚合，此时通过构造方法手动传入对Moteur对象m的引用，该m对象独立于voiture2
                  //故m对象与Voiture生命周期不同步。
    }
    public void demarrer(){

    }
}
