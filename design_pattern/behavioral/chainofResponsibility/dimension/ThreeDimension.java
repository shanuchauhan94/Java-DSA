package design_pattern.behavioral.chainofResponsibility.dimension;

import java.util.Arrays;

public class ThreeDimension implements Chain {

    private Chain nextChain;

    @Override
    public void setNext(Chain c) {
        this.nextChain = c;
    }

    @Override
    public void process(Dimension dimension) {

        if (dimension.getCoordinates().length == 3) {
            System.err.println("Three dimension Object " + Arrays.toString(dimension.getCoordinates()));
        } else {
            nextChain.process(dimension);
        }
    }
}
