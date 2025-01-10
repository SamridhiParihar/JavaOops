package Lec3.Inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // this calls parent class constructor
        // it is used to initialize values in the parent class
        this.weight = weight;
    }
}
