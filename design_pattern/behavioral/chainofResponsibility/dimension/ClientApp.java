package design_pattern.behavioral.chainofResponsibility.dimension;

public class ClientApp {

    public static void main(String[] args) {
        Chain c1 = new OneDimension();
        Chain c2 = new TwoDimension();
        Chain c3 = new ThreeDimension();
        Chain c4 = new FourDimension();

        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);

        c1.process(new Dimension(5,4,7,1));

    }
}
