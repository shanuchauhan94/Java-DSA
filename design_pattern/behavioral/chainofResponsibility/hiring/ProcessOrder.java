package design_pattern.behavioral.chainofResponsibility.hiring;

public enum ProcessOrder {
    DEFAULT(0),
    TECHNICAL(1),
    MANAGERIAL(2),
    HR(3);

    private int level;

    ProcessOrder(int l) {
        this.level = l;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
