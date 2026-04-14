import java.util.ArrayList;

public class Main {
    static void main(){

        Bibliotheque b1 = new Bibliotheque("Médiathèque de Toulouse");

        Auteur a1 = new Auteur("Hugo", "Victor", 1802);
        Auteur a2 = new Auteur("Rowling", "JK", 1965);

        Livre l1 = new Livre("Les Misérables", 1500, a1);
        b1.ajouterLivre(l1);
        Livre l2 = new Livre("Harry Potter", 400, a2);
        b1.ajouterLivre(l2);
        Livre l3 = new Livre("Notre-Dame de Paris", 600, a1);
        b1.ajouterLivre(l3);

        //Affichage des livres de la bibiliothèque :
        b1.afficherLivres();

        //test affichage des infos d'un auteur :

        a1.afficherInfos();

        //Test

        Genre g1 = new Genre("Roman", "Long récit");
        Genre g2 = new Genre("Classique", "Oeuvre de référence");
        Genre g3 = new Genre("Sciences", "Oeuvre de scientifiques");

        l1.ajouterGenre(g1);
        l2.ajouterGenre(g2);
        l2.ajouterGenre(g3);

        l2.afficherInfos();

        a1.modifierAnneeNaissance(2022);
        a1.afficherInfos();



    }
}

