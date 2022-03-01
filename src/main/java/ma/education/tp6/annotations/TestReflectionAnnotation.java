package ma.education.tp6.annotations;

import ma.education.tp5.annotations.CalculatriceMath;

public class TestReflectionAnnotation {
    public static void main(String[] args) {
        Class c = CalculatriceMath.class;
        Programmer programmer = (Programmer)c.getAnnotation(Programmer.class);
        System.out.println(programmer.id()+":"+programmer.name());
    }
}
