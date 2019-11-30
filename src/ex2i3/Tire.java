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

    int getWidth() {
        return width;
    }

    int getAspectRatio() {
        return aspectRatio;
    }

    int getDiameter() {
        return diameter;
    }

    String toPrint() {
        return "[" + width + "/" + aspectRatio + " R" + diameter + "]";
    }
}
