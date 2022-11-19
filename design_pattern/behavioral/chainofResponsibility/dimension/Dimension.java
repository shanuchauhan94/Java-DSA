package design_pattern.behavioral.chainofResponsibility.dimension;

public class Dimension {

    private int[] coordinates;

    public Dimension(int x) {
        this.coordinates = new int[]{x};
    }

    public Dimension(int x, int y) {
        this.coordinates = new int[]{x, y};
    }

    public Dimension(int x, int y, int z) {
        this.coordinates = new int[]{x, y, z};
    }

    public Dimension(int x, int y, int z, int a) {
        this.coordinates = new int[]{x, y, z, a};
    }

    public int[] getCoordinates() {
        return this.coordinates;
    }

}
