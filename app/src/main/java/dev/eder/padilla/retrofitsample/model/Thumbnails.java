package dev.eder.padilla.retrofitsample.model;

public class Thumbnails {


    public Default _default;

    public Medium medium;

    public High high;

    public Default get_default() {
        return _default;
    }

    public Medium getMedium() {
        return medium;
    }

    public High getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return "Thumbnails{" +
                "_default=" + _default +
                ", medium=" + medium +
                ", high=" + high +
                '}';
    }
}
