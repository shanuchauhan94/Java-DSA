package design_pattern.behavioral.chainofResponsibility.dimension;

import java.util.Arrays;

public class FourDimension implements Chain {

    private Chain nextChain;

    @Override
    public void setNext(Chain c) {
        this.nextChain = c;
    }

    @Override
    public void process(Dimension dimension) {

        if (dimension.getCoordinates().length == 4) {
            System.err.println("Four dimension Object " + Arrays.toString(dimension.getCoordinates()));
        }
    }
}
