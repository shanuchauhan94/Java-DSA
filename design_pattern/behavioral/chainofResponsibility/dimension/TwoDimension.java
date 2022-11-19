package design_pattern.behavioral.chainofResponsibility.dimension;

import java.util.Arrays;

public class TwoDimension implements Chain {

    private Chain nextChain;

    @Override
    public void setNext(Chain c) {
        this.nextChain = c;
    }

    @Override
    public void process(Dimension dimension) {

        if (dimension.getCoordinates().length == 2) {
            System.err.println("Two dimension Object " + Arrays.toString(dimension.getCoordinates()));
        } else {
            nextChain.process(dimension);
        }
    }
}
