import java.util.ArrayList;

public class Auteur {
    String nom;
    String prenom;
    int anneeNaissance;

    public Auteur(String nom,String prenom,int anneeNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
    }

    public void afficherInfos(){
            System.out.println("_-_-_-_-_-_-_-_-_");
            System.out.println("Le nom de cet auteur : "+nom);
            System.out.println("Le prénom de cet auteur : "+prenom);
            System.out.println("L'auteur est né en : "+anneeNaissance);
    }

    public void modifierAnneeNaissance(int annee) {
        anneeNaissance = annee;
        System.out.println("L'année de naissance a été mise à jour !");
    }


}
