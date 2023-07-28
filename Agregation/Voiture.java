package Agregation;

public class Voiture {
    private Moteur m;

    public Voiture(){
        m = new Moteur();//组合，这是在类创建时初始化的对象m；当类被销毁时，此对象的生命周期也将结束。
    }

    public void demarrer(){

    }
}
