import java.util.ArrayList;

public class Livre {
    String titre;
    int nbPages;
    Auteur auteur;
    public ArrayList<Genre> genres = new ArrayList<Genre>();

    public Livre(String titre, int nbPages,Auteur auteur){
        this.titre=titre;
        this.nbPages=nbPages;
        this.auteur=auteur;
    }

    public void afficherInfos(){
        System.out.println("-_-_-_-_-_-_-_-_-_-");
        System.out.println("Le titre de ce livre : "+titre);
        System.out.println("Le nombre de pages de ce livre : "+nbPages);
        System.out.println("L'auteur de ce livre : "+auteur.nom+" "+auteur.prenom);
        System.out.print("Genres : ");
        for (int i = 0; i < genres.size(); i++) {
            System.out.print(genres.get(i).nom + " ");
        }

    }

    public void ajouterGenre(Genre g) {
        this.genres.add(g);
    }


}
