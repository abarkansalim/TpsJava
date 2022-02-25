package ma.education.tp1.introduction;

public class Salle {
    private long id;
    private String nom;

//    public Salle() {
//    }

    public Salle(String nom) {
        this.nom = nom;
    }

    public Salle(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
}
