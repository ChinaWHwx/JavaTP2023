package BU;

public class Livre {
    private static int instanceCount = 0;
    private String titre;
    private double prix;

    private int isbn;

    public Livre(String titre, double prix){
        this.titre = titre;
        this.prix = prix;
        this.isbn = ++instanceCount;
    }

    public String getTitre(){
        return titre;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }

    public double getPrix(){
        return prix;
    }

    public void setPrix(double prix){
        this.prix = prix;
    }


    @Override
    public String toString(){
        return "Livre [titre=" + titre + ",prix=" + prix + "isbn="+ isbn + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livre livre = (Livre) o;

        return isbn == livre.isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public int hashCode() {
        return isbn;
    }
}
