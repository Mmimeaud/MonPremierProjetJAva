package POO.JavaBnB.logements;

public enum ClasseEnergie {
    A("les Meilleurs"),B("Bel effort"),C("travaux à prévoir !"),D("tout à refaire");

   // je déclare un attribut "commentaire"
    private final String commentaire;

    // initialise l'attribut
    private ClasseEnergie(String pCommentaire){
        commentaire = pCommentaire;
    }

    // un getter permettant de retourner l'attribut
    public String getCommentaire(){
        return commentaire;
    }
}

