package BU;

enum Format{
    PDF,
    EPUB,
    HTML
}

public class LivreNumerique extends Livre{
    private Format format;

    public LivreNumerique(String titre, double prix, Format format){
        super(titre,prix);
        this.format = format;
    }

    @Override
    public String toString(){
        return  "LivreNumerique [titre=" + getTitre() + ",prix=" + getPrix() + "isbn=" + getIsbn() + "format=" + format + "]";
    }

}
