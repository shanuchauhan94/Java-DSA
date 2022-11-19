package design_pattern.behavioral.chainofResponsibility.dimension;

public interface Chain {

    public abstract void setNext(Chain nextInChain);
    public abstract void process(Dimension dimension);
}
