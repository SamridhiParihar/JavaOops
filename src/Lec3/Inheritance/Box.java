package Lec3.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    // for cube
    Box(double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }
    Box(double l, double w, double h){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    // copy constructor
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void info(){
        System.out.println("height = "+this.h);
        System.out.println("width = "+this.w);
        System.out.println("length = "+this.l);
    }

}
