package design_pattern.creational.builder;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Vehicle vehicle1 =new Vehicle.VehicleBuilder("1000cc",2).setAirbag(1).build();
        Vehicle vehicle2 =new Vehicle.VehicleBuilder("1500cc",4).build();

        System.err.println("v1 "+vehicle1.getEngine());
        System.err.println("v2 "+vehicle2.getEngine());

    }
}
