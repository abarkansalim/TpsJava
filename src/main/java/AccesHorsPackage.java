import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage {
    public static void main(String[] args) {
        Salle salleB = new Salle(2,"Salle B");

        System.out.println(salleB.id +" -- "+ salleB.nom);
    }
}
