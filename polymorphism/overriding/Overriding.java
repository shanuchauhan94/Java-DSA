package polymorphism.overriding;

/*
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).
 */
class Vehicle {
    void run(String a) {
        System.out.println("Vehicle is running "+a);
    }
}

public class Overriding extends Vehicle{

    @Override
    void run(String a){System.err.println("Overriding method is running safely "+a);}

    public static void main(String[] args) {
        Overriding overriding = new Overriding();
        Vehicle overriding1 = new Overriding();
        overriding.run("hello 1");
        overriding1.run("hello 2");

    }
}
