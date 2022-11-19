package design_pattern.creational.singleton;

public class SingletonDPattern {

    public static void main(String[] args) {
        DBConfiguration c1 = DBConfiguration.getInstance();
        DBConfiguration c2 = DBConfiguration.getInstance();
        DBConfiguration c3 = DBConfiguration.getInstance();

        System.err.println(c1.hashCode());
        System.err.println(c2.hashCode());
        System.err.println(c3.hashCode());

    }

}
