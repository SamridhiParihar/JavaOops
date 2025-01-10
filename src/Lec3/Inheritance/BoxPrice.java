package Lec3.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost ;

    public BoxPrice() {
        super();
        this.cost = -1;
    }

    public BoxPrice(BoxWeight other, double cost) {
        super(other);
        this.cost = cost;
    }
    public BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }

}
