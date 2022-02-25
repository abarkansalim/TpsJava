package ma.education.tp1.introduction;

public class TestHeritage {
    public static void main(String[] args) {
        Salle s1=new SalleCours(1, "Salle 1", (byte) 20);
        SalleCours s2= new SalleCours(2, "Salle 2", (byte) 20);
        // SalleCours s3=s1; on peu pas affecter class mere a class fille sans cast
        SalleCours s4=s2;
    }
}
