import java.util.ArrayList;

public class Bibliotheque {
    String nom;
    ArrayList<Livre> livres;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<Livre>();
    }

    public void ajouterLivre(Livre livre) {
        this.livres.add(livre);
    }

    public void afficherLivres(){
        System.out.println("Liste des livres : ");
        for(int i=0; i<livres.size(); i++){
            livres.get(i).afficherInfos();
        }
    }
}