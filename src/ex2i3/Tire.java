package ex2i3;

public class Tire {
    private int width;
    private int aspectRatio;
    private int diameter;

    Tire(int width, int aspectRatio, int diameter) {
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public int getAspectRatio() {
        return aspectRatio;
    }

    public int getDiameter() {
        return diameter;
    }
}
