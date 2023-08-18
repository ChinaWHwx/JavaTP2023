package BU;

import C.C;
import Passage.A;

import java.util.ArrayList;

public class Bibliotheque {
    private final int CAPACITE;
    private ArrayList<Livre> livres = new ArrayList<>();
    public Bibliotheque(int capacite){
        CAPACITE = capacite;
    }

    public void ajouterLivre(Livre livre) throws BibliothequePleineException{
        if(livres.size()>=CAPACITE){
            throw new BibliothequePleineException("La bibliothèque est pleine.");
        }
        livres.add(livre);
    }

    public int getCapacite(){
        return CAPACITE;
    }

    public int getNombreLivres(){
        return livres.size();
    }

    public class BibliothequePleineException extends Exception{
        public BibliothequePleineException(String message){
            super(message);
        }
    }
}
