package design_pattern.behavioral.chainofResponsibility.dimension;

import java.util.Arrays;

public class OneDimension implements Chain {

    private Chain nextChain;

    @Override
    public void setNext(Chain c) {
        this.nextChain = c;
    }

    @Override
    public void process(Dimension dimension) {

        if (dimension.getCoordinates().length == 1) {
            System.err.println("One dimension Object " + Arrays.toString(dimension.getCoordinates()));
        } else {
            nextChain.process(dimension);
        }
    }
}
